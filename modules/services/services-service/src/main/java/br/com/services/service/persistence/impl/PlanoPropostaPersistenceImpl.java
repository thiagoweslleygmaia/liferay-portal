/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.com.services.service.persistence.impl;

import br.com.services.exception.NoSuchPlanoPropostaException;
import br.com.services.model.PlanoProposta;
import br.com.services.model.impl.PlanoPropostaImpl;
import br.com.services.model.impl.PlanoPropostaModelImpl;
import br.com.services.service.persistence.PlanoPropostaPersistence;
import br.com.services.service.persistence.impl.constants.PropostaPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the plano proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PlanoPropostaPersistence.class)
@ProviderType
public class PlanoPropostaPersistenceImpl
	extends BasePersistenceImpl<PlanoProposta>
	implements PlanoPropostaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PlanoPropostaUtil</code> to access the plano proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PlanoPropostaImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public PlanoPropostaPersistenceImpl() {
		setModelClass(PlanoProposta.class);

		setModelImplClass(PlanoPropostaImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the plano proposta in the entity cache if it is enabled.
	 *
	 * @param planoProposta the plano proposta
	 */
	@Override
	public void cacheResult(PlanoProposta planoProposta) {
		entityCache.putResult(
			entityCacheEnabled, PlanoPropostaImpl.class,
			planoProposta.getPrimaryKey(), planoProposta);

		planoProposta.resetOriginalValues();
	}

	/**
	 * Caches the plano propostas in the entity cache if it is enabled.
	 *
	 * @param planoPropostas the plano propostas
	 */
	@Override
	public void cacheResult(List<PlanoProposta> planoPropostas) {
		for (PlanoProposta planoProposta : planoPropostas) {
			if (entityCache.getResult(
					entityCacheEnabled, PlanoPropostaImpl.class,
					planoProposta.getPrimaryKey()) == null) {

				cacheResult(planoProposta);
			}
			else {
				planoProposta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all plano propostas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PlanoPropostaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the plano proposta.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PlanoProposta planoProposta) {
		entityCache.removeResult(
			entityCacheEnabled, PlanoPropostaImpl.class,
			planoProposta.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PlanoProposta> planoPropostas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PlanoProposta planoProposta : planoPropostas) {
			entityCache.removeResult(
				entityCacheEnabled, PlanoPropostaImpl.class,
				planoProposta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new plano proposta with the primary key. Does not add the plano proposta to the database.
	 *
	 * @param id the primary key for the new plano proposta
	 * @return the new plano proposta
	 */
	@Override
	public PlanoProposta create(long id) {
		PlanoProposta planoProposta = new PlanoPropostaImpl();

		planoProposta.setNew(true);
		planoProposta.setPrimaryKey(id);

		return planoProposta;
	}

	/**
	 * Removes the plano proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta that was removed
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	@Override
	public PlanoProposta remove(long id) throws NoSuchPlanoPropostaException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the plano proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the plano proposta
	 * @return the plano proposta that was removed
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	@Override
	public PlanoProposta remove(Serializable primaryKey)
		throws NoSuchPlanoPropostaException {

		Session session = null;

		try {
			session = openSession();

			PlanoProposta planoProposta = (PlanoProposta)session.get(
				PlanoPropostaImpl.class, primaryKey);

			if (planoProposta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPlanoPropostaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(planoProposta);
		}
		catch (NoSuchPlanoPropostaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PlanoProposta removeImpl(PlanoProposta planoProposta) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(planoProposta)) {
				planoProposta = (PlanoProposta)session.get(
					PlanoPropostaImpl.class, planoProposta.getPrimaryKeyObj());
			}

			if (planoProposta != null) {
				session.delete(planoProposta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (planoProposta != null) {
			clearCache(planoProposta);
		}

		return planoProposta;
	}

	@Override
	public PlanoProposta updateImpl(PlanoProposta planoProposta) {
		boolean isNew = planoProposta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (planoProposta.isNew()) {
				session.save(planoProposta);

				planoProposta.setNew(false);
			}
			else {
				planoProposta = (PlanoProposta)session.merge(planoProposta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, PlanoPropostaImpl.class,
			planoProposta.getPrimaryKey(), planoProposta, false);

		planoProposta.resetOriginalValues();

		return planoProposta;
	}

	/**
	 * Returns the plano proposta with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the plano proposta
	 * @return the plano proposta
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	@Override
	public PlanoProposta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPlanoPropostaException {

		PlanoProposta planoProposta = fetchByPrimaryKey(primaryKey);

		if (planoProposta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPlanoPropostaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return planoProposta;
	}

	/**
	 * Returns the plano proposta with the primary key or throws a <code>NoSuchPlanoPropostaException</code> if it could not be found.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	@Override
	public PlanoProposta findByPrimaryKey(long id)
		throws NoSuchPlanoPropostaException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the plano proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta, or <code>null</code> if a plano proposta with the primary key could not be found
	 */
	@Override
	public PlanoProposta fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the plano propostas.
	 *
	 * @return the plano propostas
	 */
	@Override
	public List<PlanoProposta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the plano propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoPropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plano propostas
	 * @param end the upper bound of the range of plano propostas (not inclusive)
	 * @return the range of plano propostas
	 */
	@Override
	public List<PlanoProposta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the plano propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoPropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of plano propostas
	 * @param end the upper bound of the range of plano propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of plano propostas
	 */
	@Deprecated
	@Override
	public List<PlanoProposta> findAll(
		int start, int end, OrderByComparator<PlanoProposta> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the plano propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoPropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plano propostas
	 * @param end the upper bound of the range of plano propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plano propostas
	 */
	@Override
	public List<PlanoProposta> findAll(
		int start, int end,
		OrderByComparator<PlanoProposta> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PlanoProposta> list = (List<PlanoProposta>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PLANOPROPOSTA);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PLANOPROPOSTA;

				if (pagination) {
					sql = sql.concat(PlanoPropostaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PlanoProposta>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PlanoProposta>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the plano propostas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PlanoProposta planoProposta : findAll()) {
			remove(planoProposta);
		}
	}

	/**
	 * Returns the number of plano propostas.
	 *
	 * @return the number of plano propostas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PLANOPROPOSTA);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PLANOPROPOSTA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PlanoPropostaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the plano proposta persistence.
	 */
	@Activate
	public void activate() {
		PlanoPropostaModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		PlanoPropostaModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PlanoPropostaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PlanoPropostaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PlanoPropostaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = PropostaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.br.com.services.model.PlanoProposta"),
			true);
	}

	@Override
	@Reference(
		target = PropostaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PropostaPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PLANOPROPOSTA =
		"SELECT planoProposta FROM PlanoProposta planoProposta";

	private static final String _SQL_COUNT_PLANOPROPOSTA =
		"SELECT COUNT(planoProposta) FROM PlanoProposta planoProposta";

	private static final String _ORDER_BY_ENTITY_ALIAS = "planoProposta.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PlanoProposta exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		PlanoPropostaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id"});

	static {
		try {
			Class.forName(PropostaPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}