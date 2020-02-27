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

import br.com.services.exception.NoSuchPlanoPropostaException;
import br.com.services.model.PlanoProposta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the plano proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanoPropostaUtil
 * @generated
 */
@ProviderType
public interface PlanoPropostaPersistence
	extends BasePersistence<PlanoProposta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PlanoPropostaUtil} to access the plano proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the plano proposta in the entity cache if it is enabled.
	 *
	 * @param planoProposta the plano proposta
	 */
	public void cacheResult(PlanoProposta planoProposta);

	/**
	 * Caches the plano propostas in the entity cache if it is enabled.
	 *
	 * @param planoPropostas the plano propostas
	 */
	public void cacheResult(java.util.List<PlanoProposta> planoPropostas);

	/**
	 * Creates a new plano proposta with the primary key. Does not add the plano proposta to the database.
	 *
	 * @param id the primary key for the new plano proposta
	 * @return the new plano proposta
	 */
	public PlanoProposta create(long id);

	/**
	 * Removes the plano proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta that was removed
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	public PlanoProposta remove(long id) throws NoSuchPlanoPropostaException;

	public PlanoProposta updateImpl(PlanoProposta planoProposta);

	/**
	 * Returns the plano proposta with the primary key or throws a <code>NoSuchPlanoPropostaException</code> if it could not be found.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta
	 * @throws NoSuchPlanoPropostaException if a plano proposta with the primary key could not be found
	 */
	public PlanoProposta findByPrimaryKey(long id)
		throws NoSuchPlanoPropostaException;

	/**
	 * Returns the plano proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta, or <code>null</code> if a plano proposta with the primary key could not be found
	 */
	public PlanoProposta fetchByPrimaryKey(long id);

	/**
	 * Returns all the plano propostas.
	 *
	 * @return the plano propostas
	 */
	public java.util.List<PlanoProposta> findAll();

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
	public java.util.List<PlanoProposta> findAll(int start, int end);

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
	public java.util.List<PlanoProposta> findAll(
		int start, int end, OrderByComparator<PlanoProposta> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<PlanoProposta> findAll(
		int start, int end, OrderByComparator<PlanoProposta> orderByComparator);

	/**
	 * Removes all the plano propostas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of plano propostas.
	 *
	 * @return the number of plano propostas
	 */
	public int countAll();

}