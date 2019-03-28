package br.com.plataformalancamentofinanceiro.test;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;
import br.com.plataformalancamentofinanceiro.factory.PessoaFactory;
import br.com.plataformalancamentofinanceiro.service.PessoaService;

public class PessoaRepositoryTest {
	
	public static void main(String[] args) {
		persist();
	}
	
	public static void persist() {
		PessoaService pessoaService = new PessoaService();
		for(PessoaDomain pessoaDomainResult : PessoaFactory.findAll()) {
			pessoaService.persist(pessoaDomainResult);
		}
	}
	
}
