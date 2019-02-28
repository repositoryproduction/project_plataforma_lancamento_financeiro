package br.com.plataformalancamentofinanceiro.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.plataformalancamentofinanceiro.enumeration.TipoCanalPagamentoEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPassivoCirculanteEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;

@XmlRootElement
public class PassivoCirculanteDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	
	private PessoaDomain favorecido;
	
	private LocalDate dataPagamento;
	
	private ProdutoServicoDomain produtoServicoDomain;
	
	private String notaFiscal;
	
	private Double valorPagamento;
	
	private PessoaDomain fontePagamentoDomain;
	
	private TipoCanalPagamentoEnumeration tipoCanalPagamentoEnumeration;
	
	private PessoaDomain resposavelPagamentoDomain;
	
	private TipoPassivoCirculanteEnumeration tipoPassivoCirculanteEnumeration;
	
	private TipoSituacaoPagamentoEnumeration tipoSituacaoPagamentoEnumeration;
	
	public PassivoCirculanteDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public PessoaDomain getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(PessoaDomain favorecido) {
		this.favorecido = favorecido;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public ProdutoServicoDomain getProdutoServicoDomain() {
		return produtoServicoDomain;
	}

	public void setProdutoServicoDomain(ProdutoServicoDomain produtoServicoDomain) {
		this.produtoServicoDomain = produtoServicoDomain;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	
	public PessoaDomain getFontePagamentoDomain() {
		return fontePagamentoDomain;
	}

	public void setFontePagamentoDomain(PessoaDomain fontePagamentoDomain) {
		this.fontePagamentoDomain = fontePagamentoDomain;
	}

	public TipoCanalPagamentoEnumeration getTipoCanalPagamentoEnumeration() {
		return tipoCanalPagamentoEnumeration;
	}

	public void setTipoCanalPagamentoEnumeration(TipoCanalPagamentoEnumeration tipoCanalPagamentoEnumeration) {
		this.tipoCanalPagamentoEnumeration = tipoCanalPagamentoEnumeration;
	}

	public PessoaDomain getResposavelPagamentoDomain() {
		return resposavelPagamentoDomain;
	}

	public void setResposavelPagamentoDomain(PessoaDomain resposavelPagamentoDomain) {
		this.resposavelPagamentoDomain = resposavelPagamentoDomain;
	}

	public TipoPassivoCirculanteEnumeration getTipoPassivoCirculanteEnumeration() {
		return tipoPassivoCirculanteEnumeration;
	}

	public void setTipoPassivoCirculanteEnumeration(TipoPassivoCirculanteEnumeration tipoPassivoCirculanteEnumeration) {
		this.tipoPassivoCirculanteEnumeration = tipoPassivoCirculanteEnumeration;
	}

	public TipoSituacaoPagamentoEnumeration getTipoSituacaoPagamentoEnumeration() {
		return tipoSituacaoPagamentoEnumeration;
	}

	public void setTipoSituacaoPagamentoEnumeration(TipoSituacaoPagamentoEnumeration tipoSituacaoPagamentoEnumeration) {
		this.tipoSituacaoPagamentoEnumeration = tipoSituacaoPagamentoEnumeration;
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
