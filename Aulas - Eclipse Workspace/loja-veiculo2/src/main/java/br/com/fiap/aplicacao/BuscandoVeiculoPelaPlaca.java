package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dominio.Veiculo;
import br.com.fiap.dominio.VeiculoId;

public class BuscandoVeiculoPelaPlaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaVeiculo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		VeiculoId codigo = new VeiculoId("ABC-1234", "Montes Claros");
		Veiculo veiculo = em.find(Veiculo.class, codigo);
		System.out.println("Placa: " + veiculo.getCodigo().getPlaca());
		System.out.println("Cidade: " + veiculo.getCodigo().getCidade());
		System.out.println("Fabricante: " + veiculo.getFabricante());
		System.out.println("Modelo: " + veiculo.getModelo());
		
		System.out.println("Commit realizado com sucesso");
		em.close();
		emf.close();
	}

}
