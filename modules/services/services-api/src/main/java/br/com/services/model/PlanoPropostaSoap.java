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
public class PlanoPropostaSoap implements Serializable {

	public static PlanoPropostaSoap toSoapModel(PlanoProposta model) {
		PlanoPropostaSoap soapModel = new PlanoPropostaSoap();

		soapModel.setId(model.getId());
		soapModel.setDescricao(model.getDescricao());

		return soapModel;
	}

	public static PlanoPropostaSoap[] toSoapModels(PlanoProposta[] models) {
		PlanoPropostaSoap[] soapModels = new PlanoPropostaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PlanoPropostaSoap[][] toSoapModels(PlanoProposta[][] models) {
		PlanoPropostaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PlanoPropostaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PlanoPropostaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PlanoPropostaSoap[] toSoapModels(List<PlanoProposta> models) {
		List<PlanoPropostaSoap> soapModels = new ArrayList<PlanoPropostaSoap>(
			models.size());

		for (PlanoProposta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PlanoPropostaSoap[soapModels.size()]);
	}

	public PlanoPropostaSoap() {
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

	public String getDescricao() {
		return _descricao;
	}

	public void setDescricao(String descricao) {
		_descricao = descricao;
	}

	private long _id;
	private String _descricao;

}