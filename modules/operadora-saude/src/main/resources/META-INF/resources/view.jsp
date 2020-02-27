<%@ include file="/init.jsp" %>

<%@ page import="javax.portlet.RenderResponse"%>
<%@ page import="javax.portlet.PortletURL"%>

<%@ page import="br.com.services.model.Proposta" %>
<%@ page import="br.com.services.model.PropostaModel" %>
<%@ page import="br.com.services.service.PropostaLocalServiceUtil"%>

<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="java.util.LinkedList" %>

<!DOCTYPE html>
<html>
<body>

<liferay-portlet:renderURL var="addPropostaURL">
  <liferay-portlet:param name="mvcRenderCommandName" value="add-proposta"/>
  <liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
</liferay-portlet:renderURL>
<aui:button cssClass="btn-warning" icon="icon-plus" style="margin-bottom: 10px;" onClick="<%= addPropostaURL %>" value="Adicionar Proposta"></aui:button>

<%
  List<Proposta> listProposta = PropostaLocalServiceUtil.getPropostas(-1, -1);  
%>

<!-- <div class="separator"></div> -->

<liferay-ui:panel cssClass="title-text-x" title="Lista de Propostas">

	<liferay-ui:search-container delta="10" emptyResultsMessage="Nenhum registro encontrado."
	headerNames="Id, Nome Completo, Idade, Sexo" deltaConfigurable="true">
	<liferay-ui:search-container-results results="<%= ListUtil.subList(listProposta, searchContainer.getStart(), searchContainer.getEnd()) %>"/>

	<%-- <liferay-ui:header title="Lista de Propostas"></liferay-ui:header> --%>
	
	<liferay-ui:search-container-row className="Proposta" modelVar="prop" keyProperty="id">
		<portlet:renderURL var="updateURL">
          <portlet:param name="jspPage" value="/update.jsp" />
          <portlet:param name="id" value="${prop.id}"/>
	    </portlet:renderURL>
	    
	    <portlet:actionURL name="deleteProposta" var="DeleteURL" >
	      <portlet:param name="id" value="${prop.id}"/>
	    </portlet:actionURL>
	    
	    <liferay-ui:search-container-column-text name="Id" property="id"/>
        <liferay-ui:search-container-column-text name="Name Completo" property="nome_completo"/>
        <liferay-ui:search-container-column-text name="Idade" property="idade"/>
        <liferay-ui:search-container-column-text name="Sexo" property="sexo"/>
        
        <liferay-portlet:renderURL var="editURL">
		  <liferay-portlet:param name="mvcRenderCommandName" value="editar-plano-saude"/>
		  <liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
		</liferay-portlet:renderURL>
		<%-- <aui:button type="submit" onClick="<%= editURL %>" value="Adicionar Proposta"></aui:button> --%>

		<liferay-ui:search-container-column-text align="center">
		  <aui:button-row cssClass="margin-column">
		  <aui:button cssClass="btn-primary font-size-btn" style="margin-right: 10px;" icon="icon-pencil" />
		  <aui:button cssClass="btn-danger font-size-btn" icon="icon-trash" />
		 </aui:button-row>
		</liferay-ui:search-container-column-text>
        
        <%-- <liferay-ui:search-container-column-text name="Update" href="${updateURL}" value="Update" >
        </liferay-ui:search-container-column-text>
        
        <liferay-ui:search-container-column-text name="Delete" href="${DeleteURL}" value="Delete" >
        </liferay-ui:search-container-column-text> --%>
        
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator/>
	
</liferay-ui:search-container>

</liferay-ui:panel>

<%-- <liferay-portlet:renderURL var="editURL">
  <liferay-portlet:param name="mvcRenderCommandName" value="editar-plano-saude"/>
  <liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
</liferay-portlet:renderURL>
<aui:button type="submit" onClick="<%= editURL %>" value="Adicionar Proposta"></aui:button> --%>

</body>
</html>


