package br.com.fiap.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;
	
	@Column(name = "Nome", nullable = false)
	private String Nome;
	
	@Column(name = "Email", nullable = false)
	private String Email;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String Nome, String Email) {
		super();
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
