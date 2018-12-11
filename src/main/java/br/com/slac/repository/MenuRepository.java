package br.com.slac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.slac.model.MenuModel;

public interface MenuRepository extends Repository<MenuModel, Integer> {
	
	void save( MenuModel menu );

	void delete( MenuModel menu );
	 
	List<MenuModel> findAll( );
	 
	MenuModel findById(Integer id);

	@Query( value = "SELECT * FROM menu m WHERE m.administrador = :administrador OR m.id = 11", nativeQuery = true ) 
	List<MenuModel> buscaMenusAdministrador( @Param( "administrador" ) boolean administrador );

	@Query( value = "SELECT * FROM menu m WHERE m.id IN (4, 5, 6, 7, 11)", nativeQuery = true ) 
	List<MenuModel> buscaMenusFuncionario( );
	
	@Query( value = "SELECT * FROM menu m WHERE m.id IN (4, 5, 6, 10, 11)", nativeQuery = true ) 
	List<MenuModel> buscaMenusUsuarioComum( );

}
