package br.com.plataformalancamentofinanceiro.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jboss.logging.Logger;

import br.com.plataformalancamentofinanceiro.connection.EntityManagerConnection;

public class BaseRepository<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(BaseRepository.class);
	
	private EntityManagerConnection entityManagerConnection;
	
	private static EntityManager entityManager;
	
	private EntityTransaction entityTransaction;
	
	public BaseRepository() {
		entityManager = EntityManagerConnection.entityManagerConnection();
		this.entityTransaction = entityManager.getTransaction();
	}
	
	public T findOne(Class<T> object, Long codigo) {
		return getEntityManager().find(object, codigo);
	}
	
	public boolean persist(T object) {
		try {
			getBeginTransaction();
				getEntityManager().persist(object);
			getCommitTransaction();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public void remove(Class<T> object, Long codigo) {
		T objectResult = findOne(object, codigo);
		try {
			getBeginTransaction();
				getEntityManager().remove(objectResult);
				getEntityManager().flush();
			getCommitTransaction();
		}catch(Exception e) {
			getRollbackTransaction();
		}
	}
	
	public void merge(T object) {
		try {
			getBeginTransaction();
				getEntityManager().merge(object);
			getCommitTransaction();
		}catch(Exception e) {
			getRollbackTransaction();
		}
	}
	
	// TODO IMPLEMENTAR METODO ABSTRATO PARA RETORNAR UMA LISTA DE DADOS PARA UMA DETERMINADA ENTIDADE PARA UMA DETERMINADA PESQUISA.
	public List<T> findAll() {
		return null;
	}
	
	public void getBeginTransaction() {
		if(entityManager.getTransaction().isActive() == false) {
			entityManager.getTransaction().begin();
			getLogger().info("Transação iniciada...");
		}
	}

	public void getCommitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	public void getRollbackTransaction() {
		entityManager.getTransaction().rollback();
	}
	
	public void getCloseEntityManager() {
		entityManager.close();
	}
	
	public void getCleanEntityManager() {
		entityManager.clear();
	}
	
	public void getFlushEntityManager() {
		entityManager.flush();
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		BaseRepository.entityManager = entityManager;
	}
	
	public EntityTransaction getEntityTransaction() {
		return entityTransaction;
	}
	
	public void setEntityTransaction(EntityTransaction entityTransaction) {
		this.entityTransaction = entityTransaction;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public EntityManagerConnection getEntityManagerConnection() {
		return entityManagerConnection;
	}

	public void setEntityManagerConnection(EntityManagerConnection entityManagerConnection) {
		this.entityManagerConnection = entityManagerConnection;
	}
	
}
