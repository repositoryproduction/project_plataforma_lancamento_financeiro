package br.com.plataformalancamentofinanceiro.domain;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.plataformalancamentofinanceiro.enumeration.TipoAtivoCirculanteEnumeration;

@XmlRootElement
public class AtivoCirculanteDomain implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long codigo;
	
	private PessoaDomain fontePagamento;
	
	private TipoAtivoCirculanteEnumeration tipoAtivoCirculanteEnumeration;
	
	private String numeroParcela;
	
	private Double valorParcela;
	
	private Date dataRecebimento;
	
	private PessoaDomain contaDestinoPagamento;
	
	private String observacao;
	
	public AtivoCirculanteDomain() { }
	
	public AtivoCirculanteDomain(Long codigo, PessoaDomain fontePagamento,
			TipoAtivoCirculanteEnumeration tipoAtivoCirculanteEnumeration, String numeroParcela, Double valorParcela,
			Date dataRecebimento, PessoaDomain contaDestinoPagamento, String observacao) {
		super();
		this.codigo = codigo;
		this.fontePagamento = fontePagamento;
		this.tipoAtivoCirculanteEnumeration = tipoAtivoCirculanteEnumeration;
		this.numeroParcela = numeroParcela;
		this.valorParcela = valorParcela;
		this.dataRecebimento = dataRecebimento;
		this.contaDestinoPagamento = contaDestinoPagamento;
		this.observacao = observacao;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public PessoaDomain getFontePagamento() {
		return fontePagamento;
	}

	public void setFontePagamento(PessoaDomain fontePagamento) {
		this.fontePagamento = fontePagamento;
	}

	public TipoAtivoCirculanteEnumeration getTipoAtivoCirculanteEnumeration() {
		return tipoAtivoCirculanteEnumeration;
	}

	public void setTipoAtivoCirculanteEnumeration(TipoAtivoCirculanteEnumeration tipoAtivoCirculanteEnumeration) {
		this.tipoAtivoCirculanteEnumeration = tipoAtivoCirculanteEnumeration;
	}

	public String getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public PessoaDomain getContaDestinoPagamento() {
		return contaDestinoPagamento;
	}

	public void setContaDestinoPagamento(PessoaDomain contaDestinoPagamento) {
		this.contaDestinoPagamento = contaDestinoPagamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
