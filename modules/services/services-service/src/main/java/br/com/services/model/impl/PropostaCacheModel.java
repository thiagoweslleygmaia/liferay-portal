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

import br.com.services.model.Proposta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Proposta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PropostaCacheModel
	implements CacheModel<Proposta>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PropostaCacheModel)) {
			return false;
		}

		PropostaCacheModel propostaCacheModel = (PropostaCacheModel)obj;

		if (id == propostaCacheModel.id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nome_completo=");
		sb.append(nome_completo);
		sb.append(", idade=");
		sb.append(idade);
		sb.append(", sexo=");
		sb.append(sexo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Proposta toEntityModel() {
		PropostaImpl propostaImpl = new PropostaImpl();

		propostaImpl.setId(id);

		if (nome_completo == null) {
			propostaImpl.setNome_completo("");
		}
		else {
			propostaImpl.setNome_completo(nome_completo);
		}

		propostaImpl.setIdade(idade);

		if (sexo == null) {
			propostaImpl.setSexo("");
		}
		else {
			propostaImpl.setSexo(sexo);
		}

		propostaImpl.resetOriginalValues();

		return propostaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		nome_completo = objectInput.readUTF();

		idade = objectInput.readInt();
		sexo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (nome_completo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome_completo);
		}

		objectOutput.writeInt(idade);

		if (sexo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sexo);
		}
	}

	public long id;
	public String nome_completo;
	public int idade;
	public String sexo;

}