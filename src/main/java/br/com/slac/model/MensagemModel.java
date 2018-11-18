package br.com.slac.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="mensagem")
@Entity
public class MensagemModel {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name="id" )
	private Integer id;
	
	@Column( name="texto" )
	private String texto;
	
	@Column( name="usuario_id" )
	private Integer usuario_id;
	
	@Column( name="responsavel_id" )
	private Integer responsavel_id;
	
	@Column( name="data" )
	private Instant data;
	
	@Column( name="solicitante" )
	private String solicitante;

	@Column( name="responsavel" )
	String responsavel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}

	public Integer getResponsavel_id() {
		return responsavel_id;
	}

	public void setResponsavel_id(Integer responsavel_id) {
		this.responsavel_id = responsavel_id;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
}


