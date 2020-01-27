package br.com.operadora.saude.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import br.com.operadora.saude.constants.OperadoraSaudePortletKeys;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + OperadoraSaudePortletKeys.OPERADORASAUDE,
		"mvc.command.name=/plano/update"
	},
	service = MVCActionCommand.class
)
public class UpdateActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		System.out.println("Nome do plano selecionado: " + ParamUtil.getString(actionRequest, "name"));
		return true;
	}

}
