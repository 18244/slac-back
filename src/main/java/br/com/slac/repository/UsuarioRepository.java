package br.com.slac.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.slac.model.UsuarioModel;

public interface UsuarioRepository extends Repository<UsuarioModel, Integer> {
	
	 void save(UsuarioModel usuario);

	 void delete(UsuarioModel usuario);
	 
	 List<UsuarioModel> findAll();
	 
	 UsuarioModel findById(Integer id);

}
