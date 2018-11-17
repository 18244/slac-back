package br.com.slac.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.slac.model.UsuarioModel;

public interface UsuarioRepository extends Repository<UsuarioModel, Integer> {
	
	 void save( UsuarioModel usuario );

	 void delete( UsuarioModel usuario );
	 
	 List<UsuarioModel> findAll( );

	 @Query( value = "SELECT * FROM usuario u WHERE u.tipo = :tipo AND u.matricula IS NOT NULL", nativeQuery = true ) 
	 List<UsuarioModel> consultaFuncionarios(  @Param( "tipo" ) String tipo );

	 @Query( value = "SELECT * FROM usuario u WHERE u.matricula = :matricula", nativeQuery = true ) 
	 UsuarioModel consultaResponsavel(  @Param( "matricula" ) Integer matricula );
	 
	 UsuarioModel findById( Integer id );
	 
	 @Query( value = "SELECT * FROM usuario u WHERE u.login = :login AND u.senha = :senha", nativeQuery = true ) 
	 Optional<UsuarioModel> efetuaLogin( @Param( "login" ) String login, @Param( "senha" ) String senha );

}
