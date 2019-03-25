package br.com.plataformalancamentofinanceiro.test;

import br.com.plataformalancamentofinanceiro.domain.AtivoCirculanteDomain;
import br.com.plataformalancamentofinanceiro.factory.AtivoCirculanteFactory;
import br.com.plataformalancamentofinanceiro.service.AtivoCirculanteService;

public class AtivoCirculanteRepositoryTest {
	
	public static void main(String[] args) {
		persist();
	}
	
	public static void persist() {
		AtivoCirculanteService ativoCirculanteService = new AtivoCirculanteService();
		for(AtivoCirculanteDomain ativoCirculanteDomainResult : AtivoCirculanteFactory.getAtivoCirculanteDomainList()) {
			ativoCirculanteService.persist(ativoCirculanteDomainResult);
		}
	}
	
}
