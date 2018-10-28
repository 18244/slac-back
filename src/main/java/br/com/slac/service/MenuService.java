package br.com.slac.service;

import java.util.List;

import br.com.slac.model.MenuModel;

public interface MenuService {

	public List<MenuModel> buscaMenus();

	public MenuModel buscaMenuPeloId(Integer id);

}
