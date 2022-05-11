package br.com.fiap.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.LongStream;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "TB_Veiculo")
public class Veiculo {
	
	/*
	@EmbeddedId
	private VeiculoId codigo;
	*/
	
	//Atributos e suas variáveis
	@Id
	@Column(name = "Codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "Fabricante" , length = 50, nullable = false)
	private String fabricante;
	
	@Column(name = "Modelo" , length = 50, nullable = false)
	private String modelo;
	
	@Column(name = "Ano_Fabricacao", nullable = false)
	private Integer anoFabricacao;
	
	@Column(name = "Ano_Modelo", nullable = false)
	private Integer anoModelo;
	
	@Column(name = "Valor", nullable = false)
	private BigDecimal valor;
	
	
	@Column(name="Tipo_Combustivel", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoCombustivel tipoCombustivel;
	
	//@Temporal(TemporalType.DATE)
	@Column(name="Data_Cadastro", nullable = false)
	private LocalDate dataCadastro;
	
	@Lob
	private String especificacoes;
	
	@Lob
	private byte[] foto;
	
	//@Transient
	//private String descricaoCompleta;
	
	//Construtores
	public Veiculo() {
		
	}


	public Veiculo(Long codigo, String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo,
			BigDecimal valor, TipoCombustivel tipoCombustivel, LocalDate dataCadastro, String especificacoes, byte[] foto) {
		super();
		this.codigo = codigo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.tipoCombustivel = tipoCombustivel;
		this.dataCadastro = dataCadastro;
		this.especificacoes = especificacoes;
		this.foto = foto;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public Integer getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}


	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}


	public LocalDate getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

	public String getEspecificacoes() {
		return especificacoes;
	}


	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}


	public byte[] getFoto() {
		return foto;
	}


	public void setFoto(byte[] foto) {
		this.foto = foto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result + Objects.hash(anoFabricacao, anoModelo, codigo, dataCadastro, especificacoes,
				fabricante, modelo, tipoCombustivel, valor);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(anoFabricacao, other.anoFabricacao) && Objects.equals(anoModelo, other.anoModelo)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(dataCadastro, other.dataCadastro)
				&& Objects.equals(especificacoes, other.especificacoes) && Objects.equals(fabricante, other.fabricante)
				&& Arrays.equals(foto, other.foto) && Objects.equals(modelo, other.modelo)
				&& tipoCombustivel == other.tipoCombustivel && Objects.equals(valor, other.valor);
	}


	
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
