package br.com.slac.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name="chamados" ) 
@Entity
public class ChamadoModel {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name="id" )
	private Integer id;

	@Column( name="tipo" )
	private String tipo;

	@Column( name="descricao" )
	private String descricao;

	@Column( name="local" )
	private String local;

	@Column( name="prioridade" )
	private String prioridade;

	@Column( name="data" )
	private Instant data;

	@Column( name="fotos" )
	private byte[] foto;
	
	@Column( name="status" )
	private String status;
	
	@Column(name = "usuario_id")
	private Integer idUsuario;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getId( ) {
		return this.id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getTipo( ) {
		return this.tipo;
	}

	public void setTipo( String tipo ) {
		this.tipo = tipo;
	}
	
	public String getDescricao( ) {
		return this.descricao;
	}
	
	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}
	
	public String getLocal( ) {
		return this.local;
	}
	
	public void setLocal( String local ) {
		this.local = local ;
	}
	
	public String getPrioridade( ) {
		return this.prioridade;
	}
	
	public void setPrioridade( String prioridade ) {
		this.prioridade = prioridade;
	}
	
	public Instant getData( ) {
		return this.data;
	}
	
	public void setData( Instant data ) {
		this.data = data;
	}
	
	public byte[] getFoto( ) {
		return this.foto;
	}
	
	public void setFoto( byte[] foto ) {
		 this.foto = foto;
	}
	
	public String getStatus( ) {
		return this.status;
	}
	
	public void setStatus( String status ) {
		this.status = status;
	}
}



