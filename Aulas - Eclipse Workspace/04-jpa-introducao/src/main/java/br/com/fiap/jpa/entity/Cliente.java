package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)
public class Cliente {

	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private Integer codigo;
	
	@Column(name="nm_cliente", nullable = false, length = 80)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
	@CreationTimestamp //Criar a data de cadastro automaticamente
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_cadastro", nullable = false, updatable = false)
	private Calendar dataCadastro;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", nullable = false, length = 20)
	private Genero genero;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Column(name="ds_email", length = 60, unique = true)
	private String email;
	
	@Column(name="ds_telefone", length = 20)
	private String telefone;
	
	@Column(name="ds_endereco", length = 60)
	private String endereco;
	
	@Column(name="nr_cpf", nullable = false, length = 15)
	private String cpf;
	
	@Column(name="st_ativo")
	private Boolean ativo;
	
	@Transient
	private Integer idade;
	
	//Construtor necessÃ¡rio para a pesquisa
	public Cliente() {}

	//Construtor sem o cÃ³digo para o cadastro
	public Cliente(String nome, Calendar dataNascimento, Genero genero, byte[] foto, 
							String email, String telefone, String endereco, String cpf, Boolean ativo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.foto = foto;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.ativo = ativo;
	}
	
	//Construtor com o cÃ³digo para a atualizaÃ§Ã£o
	public Cliente(Integer codigo, String nome, Calendar dataNascimento, Genero genero, byte[] foto, 
							String email, String telefone, String endereco, String cpf, Boolean ativo) {
		this(nome, dataNascimento, genero, foto, email, telefone, endereco, cpf, ativo);
		this.codigo = codigo;
	}

	//Método que será executado em algum momento pré-definido
	@PostPersist //Método executado automáticamente após o persist
	@PrePersist //Método executado antes do persist
	private void executar() {
		System.out.println("Executando algum código...");
	}
	
	@PostLoad //Método executado automáticamente após a pesquisa
	private void carregar() {
		System.out.println("Executando após o carregamento do objeto");
		idade = 10;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}