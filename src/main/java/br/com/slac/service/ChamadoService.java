package br.com.slac.service;

import java.util.List;

import br.com.slac.model.ChamadoModel;
import br.com.slac.model.ResponseModel;

public interface ChamadoService {
	
	public  ResponseModel salvarChamado( ChamadoModel chamado );
	
	public ResponseModel atualizarChamado( ChamadoModel chamado );
	
	public List<ChamadoModel> consultarChamados( );	
	
	public ChamadoModel buscaChamadoPeloId( Integer id );
	
	public ResponseModel excluirChamadoPeloId( Integer id );
	
}