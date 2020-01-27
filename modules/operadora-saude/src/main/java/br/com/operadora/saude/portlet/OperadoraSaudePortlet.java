package br.com.operadora.saude.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import br.com.operadora.saude.constants.OperadoraSaudePortletKeys;
import br.com.services.model.Proposta;
import br.com.services.service.PropostaLocalService;

/**
 * @author Thiago Maia
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Operadora de Saúde",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=OperadoraSaude",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + OperadoraSaudePortletKeys.OPERADORASAUDE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OperadoraSaudePortlet extends MVCPortlet {
	
	@Reference
	private PropostaLocalService propostaLocalService;
	
	@ProcessAction(name = "adicionarPlano")
	public void adicionarPlano(ActionRequest request, ActionResponse response) throws IOException, PortletException {
        Proposta newProposta = propostaLocalService.createProposta(CounterLocalServiceUtil.increment());
        newProposta.setNome_completo(ParamUtil.getString(request, "nomeCompleto"));
        newProposta.setIdade(ParamUtil.getInteger(request, "idade"));
        newProposta.setSexo(ParamUtil.getString(request, "sexo"));
        propostaLocalService.addProposta(newProposta);
        request.setAttribute("id_proposta", newProposta.getId());
        SessionMessages.add(request, "success");
	}
}