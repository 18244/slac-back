package br.com.slac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name="usuario" ) 
@Entity
public class UsuarioModel {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name="id" )
	private Integer id;
	
	@Column( name ="nome" )
	private String nome;
	
	@Column( name="login" )
	private String login;
	
	@Column( name="email" )
	private String email;
	
	public String getEmail( ) {
		return email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	@Column( name="senha" )
	private String senha;
	
	
	@Column( name="ativo", columnDefinition ="BIT" )
	private boolean ativo;
	
	@Column( name="tipo" )
	private String tipo;
	
	@Column( name ="administrador", columnDefinition = "BIT" )
	private boolean administrador;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	public Integer getId( ) {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getLogin( ) {
		return login;
	}

	public void setLogin( String login ) {
		this.login = login;
	}

	public boolean isAtivo( ) {
		return ativo;
	}

	public void setAtivo( boolean ativo ) {
		this.ativo = ativo;
	}
	
	public String getSenha( ) {
		return senha;
	}
	
	public void setSenha( String senha ) {
		this.senha = senha;
	}

}
