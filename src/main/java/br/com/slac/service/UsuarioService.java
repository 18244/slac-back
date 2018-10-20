package br.com.slac.service;

import java.util.List;

import br.com.slac.model.ResponseModel;
import br.com.slac.model.UsuarioModel;

public interface UsuarioService {
	public ResponseModel salvarUsuario( UsuarioModel usuario );
	
	public ResponseModel atualizarUsuario( UsuarioModel usuario );
	
	public List<UsuarioModel> consultarUsuarios( );
	
	public UsuarioModel buscaUsuarioPeloId( Integer id);
	
	public ResponseModel excluiUsuarioPeloId( Integer id);
}
