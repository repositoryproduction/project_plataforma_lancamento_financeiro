package br.com.plataformalancamentofinanceiro.service;

import org.jboss.logging.Logger;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;
import br.com.plataformalancamentofinanceiro.repository.PessoaRepository;

public class PessoaService {

	private static final Logger LOGGER = Logger.getLogger(PessoaService.class);
	
	private PessoaRepository pessoaRepository;
	
	public PessoaService() { 
		pessoaRepository = new PessoaRepository();
	}
	
	public boolean persist(PessoaDomain pessoaDomain) {
		if (pessoaRepository.persist(pessoaDomain)) {
			getLogger().info("Transação realizada com Sucesso!");
			return Boolean.TRUE;
		}
		getLogger().error("A transação falhou...");
		return Boolean.FALSE;
	}

	public PessoaRepository getPessoaRepository() {
		return pessoaRepository;
	}

	public void setPessoaRepository(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}
