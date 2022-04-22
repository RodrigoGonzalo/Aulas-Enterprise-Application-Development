package br.com.fiap.dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String Nome;
	private String Email;
	
	public Pessoa(){
		
	}
	
	public Pessoa(Integer Id, String Nome, String Email) {
		this.Id = Id;
		this.Nome = Nome;
		this.Email = Email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	@Override
	public String toString() {
		return "Pessoa [Id=" + Id + ", Nome=" + Nome + ", Email=" + Email + "]";
	}
	
	
	
}
