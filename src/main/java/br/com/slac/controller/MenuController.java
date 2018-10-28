package br.com.slac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.slac.model.MenuModel;
import br.com.slac.service.MenuService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	/**
	 * BUSCAR TODOS OS MENUS QUE UM USÁRIO TEM ACESSO
	 * @param 
	 * @return List MenuModel
	 */
	@RequestMapping( value="/menu", method = RequestMethod.GET )
	public @ResponseBody List<MenuModel> buscar( )
	{
		return menuService.buscaMenus();
	}
 
	/**
	 * BUSCAR UM MENU PELO ID
	 * @param id
	 * @return MenuModel
	 */
	@RequestMapping( value="/menu/{id}", method = RequestMethod.GET )
	public @ResponseBody MenuModel buscar( @PathVariable( "id" ) Integer id )
	{
		return menuService.buscaMenuPeloId(id);
	}

}
