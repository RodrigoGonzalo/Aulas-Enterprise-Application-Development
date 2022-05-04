package br.com.fiap.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	//@Column(name = "Codigo")
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
	
	@Transient
	private String descricaoCompleta;
	
	//Construtores
	public Veiculo() {
		
	}
	
	public Veiculo(Long codigo, String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo,
			BigDecimal valor, TipoCombustivel tipoCombustivel, LocalDate dataCadastro, String descricaoCompleta) {
		super();
		this.codigo = codigo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.tipoCombustivel = tipoCombustivel;
		this.dataCadastro = dataCadastro;
		this.descricaoCompleta = descricaoCompleta;
	}
	
	
	
	//Getters and Setters
	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the anoFabricacao
	 */
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	/**
	 * @param anoFabricacao the anoFabricacao to set
	 */
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	/**
	 * @return the anoModelo
	 */
	public Integer getAnoModelo() {
		return anoModelo;
	}

	/**
	 * @param anoModelo the anoModelo to set
	 */
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	/**
	 * @return the tipoCombustivel
	 */
	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	/**
	 * @param tipoCombustivel the tipoCombustivel to set
	 */
	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	
	/**
	 * @return the dataCadastro
	 */
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	

	/**
	 * @return the descricaoCompleta
	 */
	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}

	/**
	 * @param descricaoCompleta the descricaoCompleta to set
	 */
	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}


	// Gerando o ToString
	@Override
	public String toString() {
		return "Veiculo [codigo=" + codigo + ", fabricante=" + fabricante + ", modelo=" + modelo + ", anoFabricacao="
				+ anoFabricacao + ", anoModelo=" + anoModelo + ", valor=" + valor + ", tipoCombustivel="
				+ tipoCombustivel + ", dataCadastro=" + dataCadastro + ", descricaoCompleta=" + descricaoCompleta + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result + ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((descricaoCompleta == null) ? 0 : descricaoCompleta.hashCode());
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((tipoCombustivel == null) ? 0 : tipoCombustivel.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.anoFabricacao))
			return false;
		if (anoModelo == null) {
			if (other.anoModelo != null)
				return false;
		} else if (!anoModelo.equals(other.anoModelo))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (descricaoCompleta == null) {
			if (other.descricaoCompleta != null)
				return false;
		} else if (!descricaoCompleta.equals(other.descricaoCompleta))
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (tipoCombustivel != other.tipoCombustivel)
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
