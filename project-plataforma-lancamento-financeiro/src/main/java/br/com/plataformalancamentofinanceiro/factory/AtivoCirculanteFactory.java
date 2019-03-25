package br.com.plataformalancamentofinanceiro.factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.plataformalancamentofinanceiro.domain.AtivoCirculanteDomain;
import br.com.plataformalancamentofinanceiro.enumeration.TipoAtivoCirculanteEnumeration;

public class AtivoCirculanteFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public AtivoCirculanteFactory() { }
	
	public static AtivoCirculanteDomain getAtivoCirculanteDomainIndraCompanyBrazil() {
		AtivoCirculanteDomain ativoCirculanteDomain = new AtivoCirculanteDomain();
			ativoCirculanteDomain.setCodigo(null);
			ativoCirculanteDomain.setContaDestinoPagamento(PessoaFactory.getBancoFontePagamentoBancoSantander());
			ativoCirculanteDomain.setDataRecebimento(new Date());
			ativoCirculanteDomain.setFontePagamento(PessoaFactory.getFontePagamentoAtivoCirculanteIndraCompanyBrazil());
			ativoCirculanteDomain.setNumeroParcela("1");
			ativoCirculanteDomain.setObservacao(null);
			ativoCirculanteDomain.setTipoAtivoCirculanteEnumeration(TipoAtivoCirculanteEnumeration.ATIVO_CIRCULANTE_A);
			ativoCirculanteDomain.setValorParcela(8784D);
		return ativoCirculanteDomain;
	}
	
	public static AtivoCirculanteDomain getAtivoCirculanteDomainCaixaEconomicaFederal() {
		AtivoCirculanteDomain ativoCirculanteDomain = new AtivoCirculanteDomain();
			ativoCirculanteDomain.setCodigo(null);
			ativoCirculanteDomain.setContaDestinoPagamento(PessoaFactory.getBancoFontePagamentoBancoSantander());
			ativoCirculanteDomain.setDataRecebimento(new Date());
			ativoCirculanteDomain.setFontePagamento(PessoaFactory.getBancoCaixaEconomicaFederal());
			ativoCirculanteDomain.setNumeroParcela("1");
			ativoCirculanteDomain.setObservacao(null);
			ativoCirculanteDomain.setTipoAtivoCirculanteEnumeration(TipoAtivoCirculanteEnumeration.ATIVO_CIRCULANTE_D);
			ativoCirculanteDomain.setValorParcela(10000D);
		return ativoCirculanteDomain;
	}
	
	public static List<AtivoCirculanteDomain> getAtivoCirculanteDomainList() {
		List<AtivoCirculanteDomain> ativoCirculanteDomainList = new ArrayList<AtivoCirculanteDomain>();
			ativoCirculanteDomainList.add(getAtivoCirculanteDomainIndraCompanyBrazil());
			ativoCirculanteDomainList.add(getAtivoCirculanteDomainCaixaEconomicaFederal());
		return ativoCirculanteDomainList;
	}
	
}
