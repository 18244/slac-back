package br.com.slac.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.slac.model.ResponseModel;
import br.com.slac.model.UsuarioModel;
import br.com.slac.repository.UsuarioRepository;

@RestController
@RequestMapping("/service")
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	/**
	 * SALVAR UM NOVO USUÁRIO
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody UsuarioModel usuario){
 
		try {
 
			this.usuarioRepository.save(usuario);
 
			return new ResponseModel(1,"Usuário salvo com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());			
		}
	}
 
	/**
	 * ATUALIZAR O REGISTRO DE UM USUÁRIO
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody UsuarioModel usuario){
 
		try {
 
			this.usuarioRepository.save(usuario);		
 
			return new ResponseModel(1,"Usuário atualizado com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());
		}
	}
 
	/**
	 * CONSULTAR TODOS OS USUÁRIOS
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<UsuarioModel> consultar(){
 
		return this.usuarioRepository.findAll();
	}
 
	/**
	 * BUSCAR UM USUÁRIO PELO ID
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/usuario/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody UsuarioModel buscar(@PathVariable("id") Integer id){
 
		return this.usuarioRepository.findById(id);
	}
 
	/***
	 * EXCLUIR UM USUÁRIO PELO ID
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/usuario/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel excluir(@PathVariable("id") Integer id){
 
		UsuarioModel usuario = usuarioRepository.findById(id);
 
		try {
 
			usuarioRepository.delete(usuario);
 
			return new ResponseModel(1, "Usuário excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}

}
