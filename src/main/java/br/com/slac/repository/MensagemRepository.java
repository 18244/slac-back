package br.com.slac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.slac.model.MensagemModel;

public interface MensagemRepository extends Repository<MensagemModel, Integer> {
	
	void delete( MensagemModel mensagem );
	
	void save( MensagemModel mensagem );
	
	List<MensagemModel> findAll( );

	@Query( value = "SELECT * FROM mensagem m WHERE m.usuario_id = :usuario_id", nativeQuery = true )
	List<MensagemModel> consultaMensagensUsuario(@Param("usuario_id") Integer usuario_id );

	@Query( value = "SELECT * FROM mensagem m WHERE m.responsavel_id = :responsavel_id", nativeQuery = true )
	List<MensagemModel> consultaMensagensResponsavel(@Param("responsavel_id") Integer responsavel_id );
}
