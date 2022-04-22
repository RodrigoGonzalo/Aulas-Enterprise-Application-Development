package br.com.java.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
	
	// Declaração dos Atributos
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "Nome_Produto", nullable = false)
	private String nomeProduto;
	
	@Column(name = "Preco", nullable = false)
	private double preco;
	
	// Construtores
	public Produto(){
		
	}
	
	public Produto(String nomeProduto, double preco) {
		super();
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}
	
	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", preco=" + preco + "]";
	}
	
	
	
	
	
}
