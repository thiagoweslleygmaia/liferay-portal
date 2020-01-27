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
 * Provides a wrapper for {@link PropostaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PropostaLocalService
 * @generated
 */
@ProviderType
public class PropostaLocalServiceWrapper
	implements PropostaLocalService, ServiceWrapper<PropostaLocalService> {

	public PropostaLocalServiceWrapper(
		PropostaLocalService propostaLocalService) {

		_propostaLocalService = propostaLocalService;
	}

	/**
	 * Adds the proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * @param proposta the proposta
	 * @return the proposta that was added
	 */
	@Override
	public br.com.services.model.Proposta addProposta(
		br.com.services.model.Proposta proposta) {

		return _propostaLocalService.addProposta(proposta);
	}

	/**
	 * Creates a new proposta with the primary key. Does not add the proposta to the database.
	 *
	 * @param id the primary key for the new proposta
	 * @return the new proposta
	 */
	@Override
	public br.com.services.model.Proposta createProposta(long id) {
		return _propostaLocalService.createProposta(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the proposta
	 * @return the proposta that was removed
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	@Override
	public br.com.services.model.Proposta deleteProposta(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.deleteProposta(id);
	}

	/**
	 * Deletes the proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * @param proposta the proposta
	 * @return the proposta that was removed
	 */
	@Override
	public br.com.services.model.Proposta deleteProposta(
		br.com.services.model.Proposta proposta) {

		return _propostaLocalService.deleteProposta(proposta);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _propostaLocalService.dynamicQuery();
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

		return _propostaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.services.model.impl.PropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _propostaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.services.model.impl.PropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _propostaLocalService.dynamicQuery(
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

		return _propostaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _propostaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.services.model.Proposta fetchProposta(long id) {
		return _propostaLocalService.fetchProposta(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _propostaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _propostaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _propostaLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the proposta with the primary key.
	 *
	 * @param id the primary key of the proposta
	 * @return the proposta
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	@Override
	public br.com.services.model.Proposta getProposta(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.getProposta(id);
	}

	/**
	 * Returns a range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.services.model.impl.PropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of propostas
	 */
	@Override
	public java.util.List<br.com.services.model.Proposta> getPropostas(
		int start, int end) {

		return _propostaLocalService.getPropostas(start, end);
	}

	/**
	 * Returns the number of propostas.
	 *
	 * @return the number of propostas
	 */
	@Override
	public int getPropostasCount() {
		return _propostaLocalService.getPropostasCount();
	}

	/**
	 * Updates the proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param proposta the proposta
	 * @return the proposta that was updated
	 */
	@Override
	public br.com.services.model.Proposta updateProposta(
		br.com.services.model.Proposta proposta) {

		return _propostaLocalService.updateProposta(proposta);
	}

	@Override
	public PropostaLocalService getWrappedService() {
		return _propostaLocalService;
	}

	@Override
	public void setWrappedService(PropostaLocalService propostaLocalService) {
		_propostaLocalService = propostaLocalService;
	}

	private PropostaLocalService _propostaLocalService;

}