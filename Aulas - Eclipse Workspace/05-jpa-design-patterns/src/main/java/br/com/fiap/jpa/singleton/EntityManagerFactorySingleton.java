package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//1-Atributo estático que armazena a única instância
	private static EntityManagerFactory Factory;
	
	//2-Construtor privado
	private EntityManagerFactorySingleton() {}
	
	//3-Método estático que cria e retorna a única instância
	public static EntityManagerFactory getInstance() {
		if (Factory == null) {
			Factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return Factory;
	}
}



