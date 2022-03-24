package br.com.fiap.revisao.main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.revisao.model.Carro;
import br.com.fiap.revisao.model.Combustivel;
import br.com.fiap.revisao.model.Revisao;
import br.com.fiap.revisao.model.Van;

public class Teste {

	//Criar o método main: main -> CTRL + espaço
	public static void main(String[] args) {
		
		//Instanciar um Carro
		Carro gol = new Carro("Volks", 2000, 50000, "Gol Bola", false);
		
		//Setar as informações no objeto do tipo Carro
//		gol.setModelo("Gol Bola");
//		gol.setMarca("Volks");
//		gol.setAno(2000);
//		gol.setArCondicionado(false);
//		gol.setKm(50000);
		
		//Chamar os métodos e exibir o resultado
		gol.darPartida();
		System.out.println(gol.validarZeroKm()?"Novo":"Usado");
		System.out.println(gol); //Exibindo os dados do objeto
		
		//Instanciar uma Van
		Van van = new Van("Mercedes-Benz", 2020, 0, "Sprinter", true, false);
		
		//Chamar os métodos e exibir o resultado
		van.darPartida();
		System.out.println(van.validarZeroKm()?"Novo":"Usado");
		System.out.println(van);
		
		//Van van2 = new Carro("Fiat", 2010, 40000); //Não compila!
		Carro carro = new Van("Fiat", 2010, 40000);
		carro.darPartida(); //Executa a implementação da classe Van!
		System.out.println(carro);
		
		//Criar a lista de revisão
		List<Revisao> revisoes = new ArrayList<>();
		
		//Adicionar 2 revisões
		revisoes.add(new Revisao(LocalDate.of(2020, Month.AUGUST, 20), 499, 10000));
		revisoes.add(new Revisao(LocalDate.now(), 1999, 400000));
		
		//Criar um carro com todos os atributos
		Carro palio = new Carro("FIAT", 1999, 400000, "Palio", true,
				Combustivel.ETANOL, revisoes);
		
		//Exibir os dados do carro
		System.out.println(palio);
		
		//Exibir as revisões do carro
		System.out.println("Revisões");
		for (Revisao revisao : palio.getRevisoes()) {
			System.out.println(revisao);
		}
		
	}//main
}//class
