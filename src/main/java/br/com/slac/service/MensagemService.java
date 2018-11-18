package br.com.slac.service;

import java.util.List;

import br.com.slac.model.MensagemModel;
import br.com.slac.model.ResponseModel;

public interface MensagemService {
	
	public ResponseModel salvarMensagem( MensagemModel mensagem );

	public List<MensagemModel> consultarMensagensUsuario( Integer usuario_id );

	public List<MensagemModel> consultarMensagensResponsavel( Integer responsavel_id );

}
