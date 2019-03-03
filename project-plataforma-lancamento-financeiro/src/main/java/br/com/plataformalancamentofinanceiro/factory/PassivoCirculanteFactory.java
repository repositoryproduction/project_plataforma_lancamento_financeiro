package br.com.plataformalancamentofinanceiro.factory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.plataformalancamentofinanceiro.domain.PassivoCirculanteDomain;
import br.com.plataformalancamentofinanceiro.enumeration.TipoCanalPagamentoEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPassivoCirculanteEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;

public class PassivoCirculanteFactory {
	
	private static PassivoCirculanteDomain getPassivoCirculanteSinagogaKeterTorahDomain() {
		PassivoCirculanteDomain passivoCirculanteDomain = new PassivoCirculanteDomain();
			passivoCirculanteDomain.setCodigo(1L);
			passivoCirculanteDomain.setDataPagamento(new Date());
			passivoCirculanteDomain.setValorPagamento(500D);
			passivoCirculanteDomain.setFavorecido(PessoaFactory.getFavorecidoSinagogaKeterTorah());
			passivoCirculanteDomain.setFontePagamentoDomain(PessoaFactory.getBancoFontePagamentoBancoSantander());
			passivoCirculanteDomain.setNotaFiscal(null);
			passivoCirculanteDomain.setProdutoServicoDomain(ProdutoServicoFactory.getProdutoServicoMensalidade());
			passivoCirculanteDomain.setResposavelPagamentoDomain(PessoaFactory.getResponsavelPagamentoJamileBatistaAlves());
			passivoCirculanteDomain.setTipoCanalPagamentoEnumeration(TipoCanalPagamentoEnumeration.PAGAMENTO_INTERNET_BANKING);
			passivoCirculanteDomain.setTipoPassivoCirculanteEnumeration(TipoPassivoCirculanteEnumeration.PASSIVO_CIRCULANTE_EXIGIVEL_LONGO_PRAZO);
			passivoCirculanteDomain.setTipoSituacaoPagamentoEnumeration(TipoSituacaoPagamentoEnumeration.PAGO);
		return passivoCirculanteDomain;
	}
	
	private static PassivoCirculanteDomain getPassivoCirculanteSupermerdadoPraVoceDomain() {
		PassivoCirculanteDomain passivoCirculanteDomain = new PassivoCirculanteDomain();
			passivoCirculanteDomain.setCodigo(2L);
			passivoCirculanteDomain.setDataPagamento(new Date());
			passivoCirculanteDomain.setValorPagamento(850D);
			passivoCirculanteDomain.setFavorecido(PessoaFactory.getSupermercadoPraVoce());
			passivoCirculanteDomain.setFontePagamentoDomain(PessoaFactory.getBancoFontePagamentoBancoSantander());
			passivoCirculanteDomain.setNotaFiscal("5454785412");
			passivoCirculanteDomain.setProdutoServicoDomain(ProdutoServicoFactory.getProdutoSupermercado());
			passivoCirculanteDomain.setResposavelPagamentoDomain(PessoaFactory.getResponsavelPagamentoJoseQuintin());
			passivoCirculanteDomain.setTipoCanalPagamentoEnumeration(TipoCanalPagamentoEnumeration.PAGAMENTO_INTERNET_BANKING);
			passivoCirculanteDomain.setTipoPassivoCirculanteEnumeration(TipoPassivoCirculanteEnumeration.PASSIVO_CIRCULANTE_EXIGIVEL_LONGO_PRAZO);
			passivoCirculanteDomain.setTipoSituacaoPagamentoEnumeration(TipoSituacaoPagamentoEnumeration.PAGO);
		return passivoCirculanteDomain;
	}
	
	public static List<PassivoCirculanteDomain> getPassivoCirculanteDomainList() {
		List<PassivoCirculanteDomain> passivoCirculanteDomainListResultado = new ArrayList<PassivoCirculanteDomain>();
			passivoCirculanteDomainListResultado.add(getPassivoCirculanteSinagogaKeterTorahDomain());
			passivoCirculanteDomainListResultado.add(getPassivoCirculanteSupermerdadoPraVoceDomain());
		return passivoCirculanteDomainListResultado;
	}
	
}
