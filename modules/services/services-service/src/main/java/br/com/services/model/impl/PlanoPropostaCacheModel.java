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

package br.com.services.model.impl;

import br.com.services.model.PlanoProposta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing PlanoProposta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PlanoPropostaCacheModel
	implements CacheModel<PlanoProposta>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PlanoPropostaCacheModel)) {
			return false;
		}

		PlanoPropostaCacheModel planoPropostaCacheModel =
			(PlanoPropostaCacheModel)obj;

		if (id == planoPropostaCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(id);
		sb.append(", descricao=");
		sb.append(descricao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PlanoProposta toEntityModel() {
		PlanoPropostaImpl planoPropostaImpl = new PlanoPropostaImpl();

		planoPropostaImpl.setId(id);

		if (descricao == null) {
			planoPropostaImpl.setDescricao("");
		}
		else {
			planoPropostaImpl.setDescricao(descricao);
		}

		planoPropostaImpl.resetOriginalValues();

		return planoPropostaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		descricao = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (descricao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descricao);
		}
	}

	public long id;
	public String descricao;

}