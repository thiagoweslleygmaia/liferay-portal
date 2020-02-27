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

package br.com.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link PlanoProposta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanoProposta
 * @generated
 */
@ProviderType
public class PlanoPropostaWrapper
	extends BaseModelWrapper<PlanoProposta>
	implements PlanoProposta, ModelWrapper<PlanoProposta> {

	public PlanoPropostaWrapper(PlanoProposta planoProposta) {
		super(planoProposta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("descricao", getDescricao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String descricao = (String)attributes.get("descricao");

		if (descricao != null) {
			setDescricao(descricao);
		}
	}

	/**
	 * Returns the descricao of this plano proposta.
	 *
	 * @return the descricao of this plano proposta
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the ID of this plano proposta.
	 *
	 * @return the ID of this plano proposta
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this plano proposta.
	 *
	 * @return the primary key of this plano proposta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the descricao of this plano proposta.
	 *
	 * @param descricao the descricao of this plano proposta
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the ID of this plano proposta.
	 *
	 * @param id the ID of this plano proposta
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this plano proposta.
	 *
	 * @param primaryKey the primary key of this plano proposta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected PlanoPropostaWrapper wrap(PlanoProposta planoProposta) {
		return new PlanoPropostaWrapper(planoProposta);
	}

}