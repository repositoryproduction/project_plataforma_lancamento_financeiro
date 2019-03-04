package br.com.plataformalancamentofinanceiro.factory;

import br.com.plataformalancamentofinanceiro.domain.ProdutoServicoDomain;

public class ProdutoServicoFactory {
	
	public static ProdutoServicoDomain getProdutoServicoMensalidade() {
		ProdutoServicoDomain produtoServicoDomain = new ProdutoServicoDomain();
			produtoServicoDomain.setNome("Mensalidade");
			produtoServicoDomain.setDescricao(null);
		return produtoServicoDomain;
	}
	
	public static ProdutoServicoDomain getProdutoSupermercado() {
		ProdutoServicoDomain produtoServicoDomain = new ProdutoServicoDomain();
			produtoServicoDomain.setNome("Supermercado");
			produtoServicoDomain.setDescricao(null);
		return produtoServicoDomain;
	}
	
}
