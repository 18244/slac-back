package br.com.slac.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.slac.model.ChamadoModel;
import br.com.slac.model.ResponseModel;
import br.com.slac.repository.ChamadoRepository;
import br.com.slac.service.ChamadoService;

@Service
public class ChamadoImplementation  implements ChamadoService{
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	@Override
	public ResponseModel salvarChamado( ChamadoModel chamado )
	{
		try {
			 
			chamadoRepository.save( chamado );
 
			return new ResponseModel( 1,"Chamado salvo com sucesso!" );
 
		}catch( Exception e ) {
 
			return new ResponseModel( 0,e.getMessage( ) );			
		}
	}

	@Override
	public ResponseModel atualizarChamado( ChamadoModel chamado ) 
	{
		try {
			 
			chamadoRepository.save( chamado );		
 
			return new ResponseModel( 1,"Chamado atualizado com sucesso!" );
 
		}catch( Exception e ) {
 
			return new ResponseModel( 0,e.getMessage( ) );
		}
	}

	@Override
	public List<ChamadoModel> consultarChamados( ) 
	{
		return chamadoRepository.findAll( );
	}

	@Override
	public ChamadoModel buscaChamadoPeloId( Integer id ) 
	{
		return chamadoRepository.findById( id );
	}

	@Override
	public ResponseModel excluirChamadoPeloId( Integer id ) 
	{
		ChamadoModel chamado = chamadoRepository.findById( id );
		 
		try {
 
			chamadoRepository.delete( chamado );
 
			return new ResponseModel( 1, "Chamado excluido com sucesso!" );
 
		}catch( Exception e ) {
			return new ResponseModel( 0, e.getMessage( ) );
		}
	}
}











