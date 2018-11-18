package br.com.slac.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.slac.model.MensagemModel;
import br.com.slac.model.ResponseModel;
import br.com.slac.repository.MensagemRepository;
import br.com.slac.service.MensagemService;

@Service
public class MensagemImplementation implements MensagemService {
	
	@Autowired
	private MensagemRepository mensagemRepository;
	
	@Override
	public ResponseModel salvarMensagem( MensagemModel mensagem ) {
		try {
			 
			mensagemRepository.save( mensagem );
 
			return new ResponseModel( 1,"Mensagem salva com sucesso!" );
 
		}catch( Exception e ) {
 
			return new ResponseModel( 0,e.getMessage( ) );			
		}
	}

	@Override
	public List<MensagemModel> consultarMensagensUsuario( Integer usuario_id ) 
	{
		return mensagemRepository.consultaMensagensUsuario( usuario_id );
	}

	@Override
	public List<MensagemModel> consultarMensagensResponsavel( Integer responsavel_id ) {
		return mensagemRepository.consultaMensagensResponsavel( responsavel_id );
	}


}
