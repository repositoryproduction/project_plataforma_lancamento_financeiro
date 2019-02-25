package br.com.plataformalancamentofinanceiro.factory;

import java.io.Serializable;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;
import br.com.plataformalancamentofinanceiro.enumeration.TipoCategoriaPessoaEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

public class PessoaFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public PessoaFactory() { }
	
	public static PessoaDomain getFavorecidoSinagogaKeterTorah() {
		PessoaDomain pessoaDomain = new PessoaDomain();
			pessoaDomain.setIsAtivo(Boolean.FALSE);
			pessoaDomain.setIsFontePagamento(Boolean.FALSE);
			pessoaDomain.setNome("Sinagoga Keter Torah");
			pessoaDomain.setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration.ASSOCIACAO_RELIGIOSA);
			pessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_JURIDICA);
		return pessoaDomain;
	}
	
	public static PessoaDomain getBancoFontePagamentoBancoSantander() {
		PessoaDomain fontePagamentoDomain = new PessoaDomain();
			fontePagamentoDomain.setIsAtivo(Boolean.TRUE);
			fontePagamentoDomain.setIsFontePagamento(Boolean.FALSE);
			fontePagamentoDomain.setNome("Banco Santander");
			fontePagamentoDomain.setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration.INSTITUICAO_FINANCEIRA);
			fontePagamentoDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_JURIDICA);
		return fontePagamentoDomain;
	}
	
	public static PessoaDomain getResponsavelPagamentoJamileBatistaAlves() {
		PessoaDomain fontePagamentoDomain = new PessoaDomain();
			fontePagamentoDomain.setIsAtivo(Boolean.TRUE);
			fontePagamentoDomain.setIsFontePagamento(Boolean.TRUE);
			fontePagamentoDomain.setNome("Jamile Batista Alves");
			fontePagamentoDomain.setTipoCategoriaPessoaEnumeration(null);
			fontePagamentoDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return fontePagamentoDomain;
	}
	
}
