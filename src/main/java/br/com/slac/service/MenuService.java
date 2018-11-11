package br.com.slac.service;

import java.util.List;

import br.com.slac.model.MenuModel;

public interface MenuService {

	public List<MenuModel> buscaMenus( );

	public List<MenuModel> buscaMenusAdministrador( boolean administrador );

	public List<MenuModel> buscarMenusUsuario( String tipo );

	public MenuModel buscaMenuPeloId( Integer id );

}
