package br.com.slac.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.slac.model.ResponseModel;
import br.com.slac.model.UsuarioModel;
import br.com.slac.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	/**
	 * SALVAR UM NOVO USUÁRIO
	 * @param usuario
	 * @return
	 */
	@RequestMapping( value="/usuario", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
																	produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody ResponseModel salvar( @RequestBody UsuarioModel usuario )
	{
		return usuarioService.salvarUsuario( usuario );
	}
	
	/**
	 * EFETUA LOGIN DE UM USUÁRIO
	 * @param usuario
	 * @return
	 */
	@RequestMapping( value="/usuario/login", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
																	produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody Optional<UsuarioModel> efetuaLogin( @RequestBody UsuarioModel usuario )
	{
		return usuarioService.efetuaLogin( usuario.getLogin( ), usuario.getSenha( ) );
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UM USUÁRIO
	 * @param usuario
	 * @return
	 */
	@RequestMapping( value="/usuario", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody ResponseModel atualizar( @RequestBody UsuarioModel usuario )
	{
		return usuarioService.atualizarUsuario( usuario ); 
	}
 
	/**
	 * CONSULTAR TODOS OS USUÁRIOS
	 * @return
	 */
	@RequestMapping( value="/usuario", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody List<UsuarioModel> consultar( )
	{
		return usuarioService.consultarUsuarios( );
	}
 
	/**
	 * BUSCAR UM USUÁRIO PELO ID
	 * @param id
	 * @return
	 */
	@RequestMapping( value="/usuario/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody UsuarioModel buscar( @PathVariable( "id" ) Integer id )
	{
		return usuarioService.buscaUsuarioPeloId( id );
	}
 
	/***
	 * EXCLUIR UM USUÁRIO PELO ID
	 * @param id
	 * @return
	 */
	@RequestMapping( value="/usuario/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public @ResponseBody ResponseModel excluir( @PathVariable( "id" ) Integer id )
	{
		return usuarioService.excluiUsuarioPeloId( id );
	}

}
