package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_MUSICA")
@SequenceGenerator(name="musica", sequenceName = "SQ_TB_MUSICA",allocationSize = 1)
public class Musica {

	@Id
	@Column(name="CD_Musica")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "musica")
	private Integer ID;
	
	@Column(name="NM_Musica", nullable = false, length = 50)
	private String NomeMusica;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_GeneroMusica", length = 20)
	private GeneroMusica Genero;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_Lancamento")
	private Calendar DataLancamento;
	
	@Column(name="DS_Duracao", length = 4)
	private String Duracao;
	
	@Column(name="NM_Artista", nullable = false, length = 50)
	private String NomeArtista;
	
	@Column(name="DS_Tamanho")
	private Integer Tamanho;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return NomeMusica;
	}

	public void setNome(String nome) {
		this.NomeMusica = nome;
	}

	public GeneroMusica getGenero() {
		return Genero;
	}

	public void setGenero(GeneroMusica Genero) {
		this.Genero = Genero;
	}

	public Calendar getDataLancamento() {
		return DataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		DataLancamento = dataLancamento;
	}

	public String getDuracao() {
		return Duracao;
	}

	public void setDuracao(String duracao) {
		Duracao = duracao;
	}

	public String getNomeArtista() {
		return NomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		NomeArtista = nomeArtista;
	}

	public Integer getTamanho() {
		return Tamanho;
	}

	public void setTamanho(Integer tamanho) {
		Tamanho = tamanho;
	}

	// Construtores
	
	public Musica() {
		
	}

	public Musica(String nomeMusica, GeneroMusica genero, Calendar dataLancamento, String duracao, String nomeArtista,
			Integer tamanho) {
		super();
		NomeMusica = nomeMusica;
		Genero = genero;
		DataLancamento = dataLancamento;
		Duracao = duracao;
		NomeArtista = nomeArtista;
		Tamanho = tamanho;
	}

	
	
	
	
}


//TB_MUSICA
//
//cd_musica number PK not null
//nm_musica varchar2(50) not null
//ds_genero varchar2(20), Enum no java
//dt_lancamento date
//ds_duracao varchar2(4)
//nm_artista varchar2(50) not null
//ds_tamanho number (tamanho do arquivo bytes)
//
//Sequence: SQ_TB_MUSICA