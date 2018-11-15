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

import br.com.slac.model.ChamadoModel;
import br.com.slac.model.ResponseModel;
import br.com.slac.service.ChamadoService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ChamadoController {
	
	@Autowired
	private ChamadoService chamadoService;
	/**
	 * SALVAR UM NOVO CHAMADO
	 * @param chamado
	 * @return
	 */
	@RequestMapping( value="/chamado", method = RequestMethod.POST )
	public @ResponseBody ResponseModel salvar( @RequestBody ChamadoModel chamado )
	{
		return chamadoService.salvarChamado( chamado );			
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UM CHAMADO
	 * @param chamado
	 * @return
	 */
	@RequestMapping( value="/chamado", method = RequestMethod.PUT )
	public @ResponseBody ResponseModel atualizar( @RequestBody ChamadoModel chamado )
	{
		return chamadoService.atualizarChamado( chamado );
	}
 
	/**
	 * CONSULTAR TODOS OS CHAMADOS
	 * @return
	 */
	@RequestMapping( value="/chamado", method = RequestMethod.GET )
	public @ResponseBody List<ChamadoModel> consultar( )
	{
		return chamadoService.consultarChamados( );
	}
	
	/**
	 * CONSULTAR TODOS OS CHAMADOS DE UM USUÁRIO
	 * @return
	 */
	@RequestMapping( value="/chamado/{usuario_id}", method = RequestMethod.GET )
	public @ResponseBody List<ChamadoModel> consultaChamadosUsuario( @PathVariable("usuario_id")  Integer usuario_id )
	{
		return chamadoService.consultarChamadosUsuario( usuario_id );
	}
 
	/**
	 * BUSCAR UM CHAMADO PELO ID
	 * @param id
	 * @return
	 */
	@RequestMapping( value="/chamado/id/{id}", method = RequestMethod.GET )
	public @ResponseBody ChamadoModel buscar( @PathVariable( "id" ) Integer id )
	{
		return chamadoService.buscaChamadoPeloId( id );
	}
 
	/***
	 * EXCLUIR UM CHAMADO PELO ID
	 * @param id
	 * @return
	 */
	@RequestMapping( value="/chamado/{id}", method = RequestMethod.DELETE )
	public @ResponseBody ResponseModel excluir( @PathVariable( "id" ) Integer id )
	{
		return chamadoService.excluirChamadoPeloId( id );
	}
}
