package br.com.fiap.model;

import java.time.LocalDate;
import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome = "TAB_DOG")
public class Cachorro {

	@Coluna(nome = "cd_cachorro", chave = true, obrigatorio = true)
	private int codigo;
	
	@Coluna(nome = "nm_cachorro", tamanho = 30, obrigatorio = true)
	private String nome;
	
	@Coluna(nome = "ds_raca", tamanho = 20)
	private String raca;
	
	@Coluna(nome = "dt_nascimento", obrigatorio = true)
	private LocalDate dataNascimento;

	@Coluna(nome = "")
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}