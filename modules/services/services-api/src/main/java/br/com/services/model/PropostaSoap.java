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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PropostaSoap implements Serializable {

	public static PropostaSoap toSoapModel(Proposta model) {
		PropostaSoap soapModel = new PropostaSoap();

		soapModel.setId(model.getId());
		soapModel.setNome_completo(model.getNome_completo());
		soapModel.setIdade(model.getIdade());
		soapModel.setSexo(model.getSexo());

		return soapModel;
	}

	public static PropostaSoap[] toSoapModels(Proposta[] models) {
		PropostaSoap[] soapModels = new PropostaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PropostaSoap[][] toSoapModels(Proposta[][] models) {
		PropostaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PropostaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PropostaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PropostaSoap[] toSoapModels(List<Proposta> models) {
		List<PropostaSoap> soapModels = new ArrayList<PropostaSoap>(
			models.size());

		for (Proposta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PropostaSoap[soapModels.size()]);
	}

	public PropostaSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getNome_completo() {
		return _nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		_nome_completo = nome_completo;
	}

	public Integer getIdade() {
		return _idade;
	}

	public void setIdade(Integer idade) {
		_idade = idade;
	}

	public String getSexo() {
		return _sexo;
	}

	public void setSexo(String sexo) {
		_sexo = sexo;
	}

	private long _id;
	private String _nome_completo;
	private Integer _idade;
	private String _sexo;

}