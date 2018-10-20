package br.com.slac.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.slac.model.ResponseModel;
import br.com.slac.model.UsuarioModel;
import br.com.slac.repository.UsuarioRepository;
import br.com.slac.service.UsuarioService;

@Service
public class UsuarioImplementation implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository; 

	@Override
	public ResponseModel salvarUsuario( UsuarioModel usuario ) {
		try {
			 
			this.usuarioRepository.save( usuario );
 
			return new ResponseModel( 1,"Usuário salvo com sucesso!" );
 
		}catch( Exception e ) {
 
			return new ResponseModel( 0,e.getMessage( ) );			
		}
	}

	@Override
	public ResponseModel atualizarUsuario( UsuarioModel usuario ) {
		try {
			 
			this.usuarioRepository.save( usuario );		
 
			return new ResponseModel( 1,"Usuário atualizado com sucesso!" );
 
		}catch( Exception e ) {
 
			return new ResponseModel( 0,e.getMessage( ) );
		}
	}

	@Override
	public List<UsuarioModel> consultarUsuarios( )
	{
		return this.usuarioRepository.findAll( );
	}

	@Override
	public UsuarioModel buscaUsuarioPeloId( Integer id )
	{
		return this.usuarioRepository.findById( id );
	}

	@Override
	public ResponseModel excluiUsuarioPeloId( Integer id )
	{
		UsuarioModel usuario = usuarioRepository.findById( id );
		 
		try {
 
			usuarioRepository.delete( usuario );
 
			return new ResponseModel( 1, "Usuário excluido com sucesso!" );
 
		}catch( Exception e ) {
			return new ResponseModel( 0, e.getMessage( ) );
		}
	}
}
