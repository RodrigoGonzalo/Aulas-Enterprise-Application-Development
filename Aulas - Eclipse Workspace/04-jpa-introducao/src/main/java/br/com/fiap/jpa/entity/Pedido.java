package br.com.fiap.jpa.entity;

import java.time.LocalDateTime;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_PEDIDO")
						//nome no java, nome no banco, incremento
@SequenceGenerator(name = "pedido", sequenceName = "SQ_TB_PEDIDO", allocationSize = 1)
public class Pedido {

	@Id
	@Column(name="cd_pedido")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
	private Integer codigo;
	
	//nullable -> pode ser nulo? , updatable -> pode ser atualizado?
	@Temporal(TemporalType.TIMESTAMP) //Define o campo de data e hora no banco
	@Column(name="dt_pedido", nullable = false, updatable = false) 
	private Calendar data;
	
	@Column(name="dt_pagamento")
	private LocalDateTime dataPagamento;
	
	@Column(name="nm_cliente", nullable = false, length = 50)
	private String nomeCliente;
	
	@Column(name="ds_pedido", length = 100)
	private String descricao;

	@Column(name="vl_pedido", nullable = false)
	private Double valor;
	
	//Atributo que não será uma coluna no banco
	@Transient
	private Integer diasRealizado;
	
	@Lob
	@Column(name="fl_nota_fiscal")
	private byte[] notaFiscal;
	
	@Enumerated(EnumType.STRING) //grava o texto da constante
	@Column(name="ds_status", nullable = false, length = 30)
	private StatusPedido status;
	
	//Construtores com todos atributos e o padrão
	public Pedido() {}
	
	public Pedido(Integer codigo, Calendar data, LocalDateTime dataPagamento, String nomeCliente, String descricao,
			Double valor, Integer diasRealizado, byte[] notaFiscal, StatusPedido status) {
		this.codigo = codigo;
		this.data = data;
		this.dataPagamento = dataPagamento;
		this.nomeCliente = nomeCliente;
		this.descricao = descricao;
		this.valor = valor;
		this.diasRealizado = diasRealizado;
		this.notaFiscal = notaFiscal;
		this.status = status;
	}

	//Getters e Setters
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDateTime dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getDiasRealizado() {
		return diasRealizado;
	}

	public void setDiasRealizado(Integer diasRealizado) {
		this.diasRealizado = diasRealizado;
	}

	public byte[] getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(byte[] notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

}