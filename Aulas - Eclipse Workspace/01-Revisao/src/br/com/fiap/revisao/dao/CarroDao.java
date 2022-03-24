package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Carro;

//Interface -> define as regras que as classes devem implementar (Contrato)
//Interface -> define os métodos que as classes devem implementar

//Objeto é diminuir o acoplamento (dependência) entre os objetos

public interface CarroDao {

	void cadastrar(Carro carro);
	
	List<Carro> lista();
	
}