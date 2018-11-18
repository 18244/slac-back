package br.com.slac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.slac.model.MensagemModel;
import br.com.slac.model.ResponseModel;
import br.com.slac.service.MensagemService;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class MensagemController {
	
	@Autowired
	private MensagemService mensagemService;
	
	/**
	 * SALVAR UMA NOVA MENSAGEM
	 * @param mensagem
	 * @return
	 */
	@RequestMapping( value="/mensagem", method = RequestMethod.POST )
	public @ResponseBody ResponseModel salvarMensagem( @RequestBody MensagemModel mensagem )
	{
		return mensagemService.salvarMensagem( mensagem );			
	}
 
	/**
	 * BUSCA TODAS AS MENSAGENS DE UM USUÁRIO
	 * @param usuario_id
	 * @return
	 */
	@RequestMapping( value="/mensagem/usuario/{usuario_id}", method = RequestMethod.GET )
	public @ResponseBody List<MensagemModel> consultarMensagensUsuario( @PathVariable("usuario_id") Integer usuario_id )
	{
		return mensagemService.consultarMensagensUsuario( usuario_id );
	}
	
	/**
	 * BUSCA TODAS AS MENSAGENS DE UM FUNCIONÁRIO
	 * @param responsavel_id
	 * @return
	 */
	@RequestMapping( value="/mensagem/funcionario/{responsavel_id}", method = RequestMethod.GET )
	public @ResponseBody List<MensagemModel> consultarMensagensResponsavel( @PathVariable("responsavel_id") Integer responsavel_id )
	{
		return mensagemService.consultarMensagensResponsavel( responsavel_id );
	}
	
	

}
