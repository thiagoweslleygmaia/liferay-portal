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

package br.com.services.service.persistence;

import br.com.services.model.PlanoProposta;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the plano proposta service. This utility wraps <code>br.com.services.service.persistence.impl.PlanoPropostaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanoPropostaPersistence
 * @generated
 */
@ProviderType
public class PlanoPropostaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(PlanoProposta planoProposta) {
		getPersistence().clearCache(planoProposta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, PlanoProposta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PlanoProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PlanoProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PlanoProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PlanoProposta> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PlanoProposta update(PlanoProposta planoProposta) {
		return getPersistence().update(planoProposta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PlanoProposta update(
		PlanoProposta planoProposta, ServiceContext serviceContext) {

		return getPersistence().update(planoProposta, serviceContext);
	}

	/**
	 * Caches the plano proposta in the entity cache if it is enabled.
	 *
	 * @param planoProposta the plano proposta
	 */
	public static void cacheResult(PlanoProposta planoProposta) {
		getPersistence().cacheResult(planoProposta);
	}

	/**
	 * Caches the plano propostas in the entity cache if it is enabled.
	 *
	 * @param planoPropostas the plano propostas
	 */
	public static void cacheResult(List<PlanoProposta> planoPropostas) {
		getPersistence().cacheResult(planoPropostas);
	}

	/**
	 * Creates a new plano proposta with the primary key. Does not add the plano proposta to the database.
	 *
	 * @param id the primary key for the new plano proposta
	 * @return the new plano proposta
	 */
	public static PlanoProposta create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the plano proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta that was removed
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	public static PlanoProposta remove(long id)
		throws br.com.services.exception.NoSuchPlanoPropostaException {

		return getPersistence().remove(id);
	}

	public static PlanoProposta updateImpl(PlanoProposta planoProposta) {
		return getPersistence().updateImpl(planoProposta);
	}

	/**
	 * Returns the plano proposta with the primary key or throws a <code>NoSuchPlanoPropostaException</code> if it could not be found.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	public static PlanoProposta findByPrimaryKey(long id)
		throws br.com.services.exception.NoSuchPlanoPropostaException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the plano proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta, or <code>null</code> if a plano proposta with the primary key could not be found
	 */
	public static PlanoProposta fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the plano propostas.
	 *
	 * @return the plano propostas
	 */
	public static List<PlanoProposta> findAll() {
		return getPersistence().findAll();
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
	public static List<PlanoProposta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<PlanoProposta> findAll(
		int start, int end, OrderByComparator<PlanoProposta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
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
	public static List<PlanoProposta> findAll(
		int start, int end,
		OrderByComparator<PlanoProposta> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the plano propostas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of plano propostas.
	 *
	 * @return the number of plano propostas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PlanoPropostaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PlanoPropostaPersistence, PlanoPropostaPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PlanoPropostaPersistence.class);

		ServiceTracker<PlanoPropostaPersistence, PlanoPropostaPersistence>
			serviceTracker =
				new ServiceTracker
					<PlanoPropostaPersistence, PlanoPropostaPersistence>(
						bundle.getBundleContext(),
						PlanoPropostaPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}