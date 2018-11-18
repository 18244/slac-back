package br.com.slac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.slac.model.ChamadoModel;

public interface ChamadoRepository extends Repository<ChamadoModel, Integer> {
	
	 void save( ChamadoModel chamado );

	 void delete( ChamadoModel chamado );
	 
	 List<ChamadoModel> findAll( );

	 @Query( value = "SELECT * FROM chamados c WHERE c.usuario_id = :usuario_id", nativeQuery = true )
	 List<ChamadoModel> consultaChamadosUsuario( @Param( "usuario_id" ) Integer usuario_id );
	 
	 ChamadoModel findById( Integer id );
}
