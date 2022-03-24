package br.com.fiap.revisao.main;

import br.com.fiap.revisao.dao.CarroDao;
import br.com.fiap.revisao.dao.CarroMySqlDao;
import br.com.fiap.revisao.model.Carro;

public class TesteInterface {
	
	public static void main(String[] args) {
		//Criar uma variável do tipo CarroDao e instanciar a classe
		CarroDao dao = new CarroMySqlDao();
		
		//Chamar o método cadastrar
		dao.cadastrar(new Carro("Jeep", 2019, 9000));
		
		//Chamar o método listar
		dao.lista();
		
	}
}