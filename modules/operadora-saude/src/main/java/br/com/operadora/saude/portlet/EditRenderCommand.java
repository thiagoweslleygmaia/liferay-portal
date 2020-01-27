package br.com.operadora.saude.portlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import br.com.operadora.saude.constants.OperadoraSaudePortletKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + OperadoraSaudePortletKeys.OPERADORASAUDE,
		"mvc.command.name=editar-plano-saude"
	},
	service = MVCRenderCommand.class
)
public class EditRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		return "/edit.jsp";
	}

}
