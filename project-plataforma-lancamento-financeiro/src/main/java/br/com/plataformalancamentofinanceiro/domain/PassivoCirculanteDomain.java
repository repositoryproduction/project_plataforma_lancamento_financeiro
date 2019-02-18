package br.com.plataformalancamentofinanceiro.domain;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.plataformalancamentofinanceiro.enumeration.TipoCanalPagamentoEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPassivoCirculanteEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;

public class PassivoCirculanteDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	
	private PessoaDomain favorecido;
	
	private LocalDate dataPagamento;
	
	private ProdutoServicoDomain produtoServicoDomain;
	
	private String notaFiscal;
	
	private Double valorAquisicao;
	
	private PessoaDomain fontePagamentoDomain;
	
	private TipoCanalPagamentoEnumeration tipoCanalPagamentoEnumeration;
	
	private PessoaDomain resposavelPagamentoDomain;
	
	private TipoPassivoCirculanteEnumeration tipoPassivoCirculanteEnumeration;
	
	private TipoSituacaoPagamentoEnumeration tipoSituacaoPagamentoEnumeration;
	
	public PassivoCirculanteDomain() { }

	public PessoaDomain getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(PessoaDomain favorecido) {
		this.favorecido = favorecido;
	}

	public Long getCodigo() {
		return codigo;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public ProdutoServicoDomain getProdutoServicoDomain() {
		return produtoServicoDomain;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public Double getValorAquisicao() {
		return valorAquisicao;
	}

	public PessoaDomain getResposavelPagamentoDomain() {
		return resposavelPagamentoDomain;
	}

	public TipoSituacaoPagamentoEnumeration getTipoSituacaoPagamentoEnumeration() {
		return tipoSituacaoPagamentoEnumeration;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void setProdutoServicoDomain(ProdutoServicoDomain produtoServicoDomain) {
		this.produtoServicoDomain = produtoServicoDomain;
	}

	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public void setValorAquisicao(Double valorAquisicao) {
		this.valorAquisicao = valorAquisicao;
	}

	public void setResposavelPagamentoDomain(PessoaDomain resposavelPagamentoDomain) {
		this.resposavelPagamentoDomain = resposavelPagamentoDomain;
	}

	public void setTipoSituacaoPagamentoEnumeration(TipoSituacaoPagamentoEnumeration tipoSituacaoPagamentoEnumeration) {
		this.tipoSituacaoPagamentoEnumeration = tipoSituacaoPagamentoEnumeration;
	}

	public PessoaDomain getFontePagamentoDomain() {
		return fontePagamentoDomain;
	}

	public void setFontePagamentoDomain(PessoaDomain fontePagamentoDomain) {
		this.fontePagamentoDomain = fontePagamentoDomain;
	}

	public TipoPassivoCirculanteEnumeration getTipoPassivoCirculanteEnumeration() {
		return tipoPassivoCirculanteEnumeration;
	}

	public void setTipoPassivoCirculanteEnumeration(TipoPassivoCirculanteEnumeration tipoPassivoCirculanteEnumeration) {
		this.tipoPassivoCirculanteEnumeration = tipoPassivoCirculanteEnumeration;
	}

	public TipoCanalPagamentoEnumeration getTipoCanalPagamentoEnumeration() {
		return tipoCanalPagamentoEnumeration;
	}

	public void setTipoCanalPagamentoEnumeration(TipoCanalPagamentoEnumeration tipoCanalPagamentoEnumeration) {
		this.tipoCanalPagamentoEnumeration = tipoCanalPagamentoEnumeration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassivoCirculanteDomain other = (PassivoCirculanteDomain) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PassivoCirculanteDomain [codigo=" + codigo + "]";
	}
	
}
