<%@ include file="/init.jsp" %>

<%@ page import="javax.portlet.RenderResponse"%>
<%@ page import="javax.portlet.PortletURL"%>

<%@ page import="br.com.services.model.Proposta" %>
<%@ page import="br.com.services.model.PropostaModel" %>
<%@ page import="br.com.services.service.PropostaLocalServiceUtil"%>

<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="java.util.LinkedList" %>

<%-- <p>
 <b><liferay-ui:message key="operadorasaude.caption"/></b>
 <b><liferay-ui:success key="success" message='<%="Solicitação realizada com sucesso, número da proposta gerado: " + request.getAttribute("id_proposta")%>'/></b>
</p> --%>

<liferay-ui:success key="success" message='<%="Solicitação realizada com sucesso, número da proposta gerado: " + request.getAttribute("id_proposta")%>'/>

<liferay-ui:header title="Inclusão de Proposta" backURL="<%= backURL %>"></liferay-ui:header>

<portlet:actionURL name="adicionarPlano" var="addPlanoUrl"/>

<aui:form name="formProposta" action="<%= addPlanoUrl %>" method="post">
<aui:fieldset-group>
	<aui:fieldset label="Dados do Plano">
		<aui:row>
			<aui:col width="50">
				<aui:select name="plano" label="Plano" required="true">
				  <aui:option selected="true">Selecione uma opção</aui:option>
		          <aui:option value="B">Básico</aui:option>
		          <aui:option value="I">Intermediário</aui:option>
		          <aui:option value="C">Completo</aui:option>
				</aui:select>
			</aui:col>
			<aui:col width="50">
				<aui:select name="regiao" label="Região" required="true">
				  <aui:option selected="true">Selecione uma opção</aui:option>
		          <aui:option value="N">Nacional</aui:option>
		          <aui:option value="E">Estadual</aui:option>
				</aui:select>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:select name="acomodacao" label="Acomodação" required="true">
				  <aui:option selected="true">Selecione uma opção</aui:option>
		          <aui:option value="C">Coletivo (Enfermaria)</aui:option>
		          <aui:option value="I">Individual (Apartamento)</aui:option>
				</aui:select>
			</aui:col>
			<aui:col width="50">
				<label for="mensalidade">Forma de mensalidade</label>
				<aui:input style="margin-top: 10px;" label="Mensalidade com valor fixo" name="mensalidade" type="checkbox" />
			</aui:col>
		</aui:row>
	</aui:fieldset>
</aui:fieldset-group>

<aui:fieldset-group>
	<aui:fieldset label="Dados Pessoais">
		<aui:row>
			<aui:col width="50">
				<aui:input label="Nome Completo" name="nomeCompleto" type="text">
				  <aui:validator name="required" />
				  <aui:validator name="maxLength">60</aui:validator>
				</aui:input>
			</aui:col>
			<aui:col width="50">
				<aui:input label="CPF" name="cpf" type="text">
				  <aui:validator name="required" />
				  <aui:validator name="number" />
				  <aui:validator name="maxLength">11</aui:validator>
				</aui:input>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:input label="Idade" name="idade" type="text">
				 <aui:validator name="required" />
				 <aui:validator name="number" />
				 <aui:validator name="maxLength">3</aui:validator>
				</aui:input>
			</aui:col>
			<aui:col width="50">
				<aui:input label="Email" name="email" type="email">
				 <aui:validator name="required" />
				</aui:input>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:select name="sexo" label="Sexo">
				  <aui:option selected="true" value="M">Masculino</aui:option>
		          <aui:option value="F">Feminino</aui:option>
		          <aui:option value="O">Outros</aui:option>
				</aui:select>
			</aui:col>
			<aui:col width="50">
				<aui:select name="estadoCivil" label="Estado Civil">
				  <aui:option selected="true" value="S">Solteiro</aui:option>
		          <aui:option value="C">Casado</aui:option>
		          <aui:option value="S">Separado</aui:option>
		          <aui:option value="D">Divorciado</aui:option>
		          <aui:option value="V">Viúvo</aui:option>
				</aui:select>
			</aui:col>
		</aui:row>
	</aui:fieldset>
</aui:fieldset-group>
<aui:button-row>
   <aui:button style="margin-right: 10px;" type="submit" value="Salvar"></aui:button>
   <aui:button style="margin-right: 10px;" type="reset" value="Limpar"></aui:button>
   <aui:button cssClass="btn-danger" type="submit" value="Cancelar" href="<%= backURL %>"></aui:button>
 </aui:button-row>
</aui:form>
