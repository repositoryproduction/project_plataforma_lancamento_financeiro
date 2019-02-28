package br.com.plataformalancamentofinanceiro.factory;

import java.time.LocalDate;

import br.com.plataformalancamentofinanceiro.domain.PassivoCirculanteDomain;
import br.com.plataformalancamentofinanceiro.enumeration.TipoCanalPagamentoEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPassivoCirculanteEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;

public class PassivoCirculanteFactory {
	
	public static PassivoCirculanteDomain getPassivoCirculanteSinagogaKeterTorahDomain() {
		PassivoCirculanteDomain passivoCirculanteDomain = new PassivoCirculanteDomain();
			passivoCirculanteDomain.setDataPagamento(LocalDate.now());
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
	
}
