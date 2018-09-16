package br.com.slac.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.slac.model.ChamadoModel;

public interface ChamadoRepository extends Repository<ChamadoModel, Integer> {
	
	 void save( ChamadoModel chamado );

	 void delete( ChamadoModel chamado );
	 
	 List<ChamadoModel> findAll( );
	 
	 ChamadoModel findById(Integer id);


}
