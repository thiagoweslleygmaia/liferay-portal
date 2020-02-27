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

package br.com.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link PlanoPropostaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlanoPropostaLocalService
 * @generated
 */
@ProviderType
public class PlanoPropostaLocalServiceWrapper
	implements PlanoPropostaLocalService,
			   ServiceWrapper<PlanoPropostaLocalService> {

	public PlanoPropostaLocalServiceWrapper(
		PlanoPropostaLocalService planoPropostaLocalService) {

		_planoPropostaLocalService = planoPropostaLocalService;
	}

	/**
	 * Adds the plano proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * @param planoProposta the plano proposta
	 * @return the plano proposta that was added
	 */
	@Override
	public br.com.services.model.PlanoProposta addPlanoProposta(
		br.com.services.model.PlanoProposta planoProposta) {

		return _planoPropostaLocalService.addPlanoProposta(planoProposta);
	}

	/**
	 * Creates a new plano proposta with the primary key. Does not add the plano proposta to the database.
	 *
	 * @param id the primary key for the new plano proposta
	 * @return the new plano proposta
	 */
	@Override
	public br.com.services.model.PlanoProposta createPlanoProposta(long id) {
		return _planoPropostaLocalService.createPlanoProposta(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoPropostaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the plano proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta that was removed
	 * @throws PortalException if a plano proposta with the primary key could not be found
	 */
	@Override
	public br.com.services.model.PlanoProposta deletePlanoProposta(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoPropostaLocalService.deletePlanoProposta(id);
	}

	/**
	 * Deletes the plano proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * @param planoProposta the plano proposta
	 * @return the plano proposta that was removed
	 */
	@Override
	public br.com.services.model.PlanoProposta deletePlanoProposta(
		br.com.services.model.PlanoProposta planoProposta) {

		return _planoPropostaLocalService.deletePlanoProposta(planoProposta);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _planoPropostaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _planoPropostaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.services.model.impl.PlanoPropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _planoPropostaLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.services.model.impl.PlanoPropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _planoPropostaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _planoPropostaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _planoPropostaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.services.model.PlanoProposta fetchPlanoProposta(long id) {
		return _planoPropostaLocalService.fetchPlanoProposta(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _planoPropostaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _planoPropostaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _planoPropostaLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoPropostaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the plano proposta with the primary key.
	 *
	 * @param id the primary key of the plano proposta
	 * @return the plano proposta
	 * @throws PortalException if a plano proposta with the primary key could not be found
	 */
	@Override
	public br.com.services.model.PlanoProposta getPlanoProposta(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoPropostaLocalService.getPlanoProposta(id);
	}

	/**
	 * Returns a range of all the plano propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.services.model.impl.PlanoPropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plano propostas
	 * @param end the upper bound of the range of plano propostas (not inclusive)
	 * @return the range of plano propostas
	 */
	@Override
	public java.util.List<br.com.services.model.PlanoProposta>
		getPlanoPropostas(int start, int end) {

		return _planoPropostaLocalService.getPlanoPropostas(start, end);
	}

	/**
	 * Returns the number of plano propostas.
	 *
	 * @return the number of plano propostas
	 */
	@Override
	public int getPlanoPropostasCount() {
		return _planoPropostaLocalService.getPlanoPropostasCount();
	}

	/**
	 * Updates the plano proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param planoProposta the plano proposta
	 * @return the plano proposta that was updated
	 */
	@Override
	public br.com.services.model.PlanoProposta updatePlanoProposta(
		br.com.services.model.PlanoProposta planoProposta) {

		return _planoPropostaLocalService.updatePlanoProposta(planoProposta);
	}

	@Override
	public PlanoPropostaLocalService getWrappedService() {
		return _planoPropostaLocalService;
	}

	@Override
	public void setWrappedService(
		PlanoPropostaLocalService planoPropostaLocalService) {

		_planoPropostaLocalService = planoPropostaLocalService;
	}

	private PlanoPropostaLocalService _planoPropostaLocalService;

}