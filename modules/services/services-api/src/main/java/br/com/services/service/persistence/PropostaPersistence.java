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

import br.com.services.exception.NoSuchPropostaException;
import br.com.services.model.Proposta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PropostaUtil
 * @generated
 */
@ProviderType
public interface PropostaPersistence extends BasePersistence<Proposta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PropostaUtil} to access the proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the proposta in the entity cache if it is enabled.
	 *
	 * @param proposta the proposta
	 */
	public void cacheResult(Proposta proposta);

	/**
	 * Caches the propostas in the entity cache if it is enabled.
	 *
	 * @param propostas the propostas
	 */
	public void cacheResult(java.util.List<Proposta> propostas);

	/**
	 * Creates a new proposta with the primary key. Does not add the proposta to the database.
	 *
	 * @param id the primary key for the new proposta
	 * @return the new proposta
	 */
	public Proposta create(long id);

	/**
	 * Removes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the proposta
	 * @return the proposta that was removed
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public Proposta remove(long id) throws NoSuchPropostaException;

	public Proposta updateImpl(Proposta proposta);

	/**
	 * Returns the proposta with the primary key or throws a <code>NoSuchPropostaException</code> if it could not be found.
	 *
	 * @param id the primary key of the proposta
	 * @return the proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public Proposta findByPrimaryKey(long id) throws NoSuchPropostaException;

	/**
	 * Returns the proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the proposta
	 * @return the proposta, or <code>null</code> if a proposta with the primary key could not be found
	 */
	public Proposta fetchByPrimaryKey(long id);

	/**
	 * Returns all the propostas.
	 *
	 * @return the propostas
	 */
	public java.util.List<Proposta> findAll();

	/**
	 * Returns a range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of propostas
	 */
	public java.util.List<Proposta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of propostas
	 */
	@Deprecated
	public java.util.List<Proposta> findAll(
		int start, int end, OrderByComparator<Proposta> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of propostas
	 */
	public java.util.List<Proposta> findAll(
		int start, int end, OrderByComparator<Proposta> orderByComparator);

	/**
	 * Removes all the propostas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of propostas.
	 *
	 * @return the number of propostas
	 */
	public int countAll();

}