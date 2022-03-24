package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.model.Carro;

public class TesteColecoes {

	public static void main(String[] args) {
		//Criar uma lista de Carro
		//Lista -> os elementos possuem uma posição e permite valores repetidos
		List<Carro> lista = new ArrayList<>();
		
		//Adicionar dois carros na lista
		Carro uno = new Carro("FIAT", 2000, 10000);
		lista.add(uno);
		
		lista.add(uno); //item repetido
		
		//Criar o objeto e adiciona na lista
		lista.add(new Carro("Toyota", 2020, 1900));
		
		//Exibir os carros da lista
		System.out.println("FOR");
		for (int i = 0; i < lista.size() ; i++ ) {
			System.out.println(lista.get(i));//recupera um elemento da lista pela posição
		}
		
		System.out.println("FOREACH");
		for (Carro carro : lista) {
			System.out.println(carro);
		}
		
		//Criar um conjunto de carro
		//Conjunto -> os elementos não possuem posição e não permite valores repetidos
		Set<Carro> conjunto = new HashSet<Carro>();
		
		//Adicionar 3 carros no conjunto, sendo 1 repetido
		conjunto.add(uno);
		conjunto.add(new Carro("Ford", 2019, 55000));
		conjunto.add(uno); //item repetido, foi ignorado
		
		//Exibir os carros do conjunto
		System.out.println("CONJUNTO:");
		for (Carro carro : conjunto) {
			System.out.println(carro);
		}
		
		//Criar um mapa com a chave do tipo Integer e o valor do tipo carro
		Map<Integer, Carro> mapa = new HashMap<Integer,Carro>();
		
		//Adicionar 2 carros no mapeamento
		mapa.put(123, uno);
		mapa.put(321, new Carro("Hyundai", 2021, 1500));
		
		//mapa.put(321, uno); //adiciona um elemento na chave que já existe, ele substitiu o valor
		
		//Recuperar o carro informando a chave
		System.out.println("Recuperando um valor do mapa pela chave:");
		System.out.println(mapa.get(321));
		
		//Recuperar todas as chaves mapeadas
		Set<Integer> chaves = mapa.keySet();
		
		//Exibir a chave e o valor
		for (Integer chave : chaves) {
			System.out.println(chave + " - " + mapa.get(chave));
		}
		
	}//main
}//class