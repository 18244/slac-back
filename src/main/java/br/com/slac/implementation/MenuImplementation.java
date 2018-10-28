package br.com.slac.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.slac.model.MenuModel;
import br.com.slac.repository.MenuRepository;
import br.com.slac.service.MenuService;

@Service
public class MenuImplementation implements MenuService {
	
	@Autowired
	private MenuRepository menuRepository;

	@Override
	public List<MenuModel> buscaMenus() {
		
		return menuRepository.findAll();
	}

	@Override
	public MenuModel buscaMenuPeloId(Integer id) {
		return menuRepository.findById(id);
	}
}
