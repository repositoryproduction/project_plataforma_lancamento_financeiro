package br.com.plataformalancamentofinanceiro.service;

import org.jboss.logging.Logger;

import br.com.plataformalancamentofinanceiro.domain.AtivoCirculanteDomain;
import br.com.plataformalancamentofinanceiro.repository.AtivoCirculanteRepository;

public class AtivoCirculanteService {
	
	private static final Logger LOGGER = Logger.getLogger(AtivoCirculanteService.class);
	
	private AtivoCirculanteRepository ativoCirculanteRepository;
	
	public AtivoCirculanteService() {
		ativoCirculanteRepository = new AtivoCirculanteRepository();
	}
	
	public boolean persist(AtivoCirculanteDomain ativoCirculanteDomain) {
		if(ativoCirculanteRepository.persist(ativoCirculanteDomain)) {
			getLogger().info("Transação realizada com Sucesso!");
			return Boolean.TRUE;
		}
		getLogger().error("A transação falhou...");
		return Boolean.FALSE;
	}

	public AtivoCirculanteRepository getAtivoCirculanteRepository() {
		return ativoCirculanteRepository;
	}

	public void setAtivoCirculanteRepository(AtivoCirculanteRepository ativoCirculanteRepository) {
		this.ativoCirculanteRepository = ativoCirculanteRepository;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}
