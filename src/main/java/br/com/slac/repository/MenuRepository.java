package br.com.slac.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.slac.model.MenuModel;

public interface MenuRepository extends Repository<MenuModel, Integer> {
	
	void save( MenuModel menu );

	void delete( MenuModel menu );
	 
	List<MenuModel> findAll( );
	 
	MenuModel findById(Integer id);

}
