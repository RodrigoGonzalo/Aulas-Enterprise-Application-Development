package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//1-Atributo est�tico que armazena a �nica inst�ncia
	private static EntityManagerFactory Factory;
	
	//2-Construtor privado
	private EntityManagerFactorySingleton() {}
	
	//3-M�todo est�tico que cria e retorna a �nica inst�ncia
	public static EntityManagerFactory getInstance() {
		if (Factory == null) {
			Factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return Factory;
	}
}



