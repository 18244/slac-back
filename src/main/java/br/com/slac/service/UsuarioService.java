package br.com.slac.service;

import java.util.List;
import java.util.Optional;

import br.com.slac.model.ResponseModel;
import br.com.slac.model.UsuarioModel;

public interface UsuarioService {
	public ResponseModel salvarUsuario( UsuarioModel usuario );
	
	public ResponseModel atualizarUsuario( UsuarioModel usuario );
	
	public List<UsuarioModel> consultarUsuarios( );

	public List<UsuarioModel> consultarFuncionarios( String tipo );
	
	public UsuarioModel buscaUsuarioPeloId( Integer id);
	
	public ResponseModel excluiUsuarioPeloId( Integer id);

	public  Optional<UsuarioModel> efetuaLogin( String login, String senha );	
	
}
