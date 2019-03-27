package br.com.plataformalancamentofinanceiro.test;

import org.jboss.logging.Logger;

import br.com.plataformalancamentofinanceiro.connection.EntityManagerConnection;

public class EntityManagerConnectionTest {
	
	private static final Logger LOGGER = Logger.getLogger(EntityManagerConnectionTest.class);
	
	public static void main(String[] args) {
		entityManagerConnection();
	}
	
	public static void entityManagerConnection() {
		EntityManagerConnection entityManagerConnection = new EntityManagerConnection();
			getLogger().info(entityManagerConnection.entityManagerConnection());
			getLogger().info("Conexão realizada com Sucesso!");
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}
