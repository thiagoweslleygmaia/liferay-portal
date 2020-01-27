<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-ui:header title="Altera��o de solicita��o de plano" backURL="<%= backURL %>"></liferay-ui:header>

<liferay-portlet:actionURL var="updateURL" name="/plano/update">
  <%-- <liferay-portlet:param name="backURL" value="<%= currentURL %>"/> --%>
</liferay-portlet:actionURL>

<aui:form action="<%= updateURL %>">
 <aui:input name="name" label="Nome" type="text"></aui:input>
 <aui:button-row>
   <aui:button type="submit" value="Atualizar"></aui:button>
   <aui:button type="cancel" value="Cancelar" href="<%= backURL %>"></aui:button>
 </aui:button-row>
</aui:form>