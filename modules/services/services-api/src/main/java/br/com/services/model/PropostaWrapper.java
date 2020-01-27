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
 * This class is a wrapper for {@link Proposta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Proposta
 * @generated
 */
@ProviderType
public class PropostaWrapper
	extends BaseModelWrapper<Proposta>
	implements Proposta, ModelWrapper<Proposta> {

	public PropostaWrapper(Proposta proposta) {
		super(proposta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nome_completo", getNome_completo());
		attributes.put("idade", getIdade());
		attributes.put("sexo", getSexo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String nome_completo = (String)attributes.get("nome_completo");

		if (nome_completo != null) {
			setNome_completo(nome_completo);
		}

		Integer idade = (Integer)attributes.get("idade");

		if (idade != null) {
			setIdade(idade);
		}

		String sexo = (String)attributes.get("sexo");

		if (sexo != null) {
			setSexo(sexo);
		}
	}

	/**
	 * Returns the ID of this proposta.
	 *
	 * @return the ID of this proposta
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the idade of this proposta.
	 *
	 * @return the idade of this proposta
	 */
	@Override
	public Integer getIdade() {
		return model.getIdade();
	}

	/**
	 * Returns the nome_completo of this proposta.
	 *
	 * @return the nome_completo of this proposta
	 */
	@Override
	public String getNome_completo() {
		return model.getNome_completo();
	}

	/**
	 * Returns the primary key of this proposta.
	 *
	 * @return the primary key of this proposta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sexo of this proposta.
	 *
	 * @return the sexo of this proposta
	 */
	@Override
	public String getSexo() {
		return model.getSexo();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this proposta.
	 *
	 * @param id the ID of this proposta
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the idade of this proposta.
	 *
	 * @param idade the idade of this proposta
	 */
	@Override
	public void setIdade(Integer idade) {
		model.setIdade(idade);
	}

	/**
	 * Sets the nome_completo of this proposta.
	 *
	 * @param nome_completo the nome_completo of this proposta
	 */
	@Override
	public void setNome_completo(String nome_completo) {
		model.setNome_completo(nome_completo);
	}

	/**
	 * Sets the primary key of this proposta.
	 *
	 * @param primaryKey the primary key of this proposta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sexo of this proposta.
	 *
	 * @param sexo the sexo of this proposta
	 */
	@Override
	public void setSexo(String sexo) {
		model.setSexo(sexo);
	}

	@Override
	protected PropostaWrapper wrap(Proposta proposta) {
		return new PropostaWrapper(proposta);
	}

}