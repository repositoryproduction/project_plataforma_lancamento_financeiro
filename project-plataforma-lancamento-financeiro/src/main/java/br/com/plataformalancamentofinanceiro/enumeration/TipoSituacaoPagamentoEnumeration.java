package br.com.plataformalancamentofinanceiro.enumeration;

public enum TipoSituacaoPagamentoEnumeration {

	PAGO(1L, "Pago"), 
	PENDENTE(2L, "Pendente"), 
	CANCELADO(3L, "Cancelado"), 
	ANISTIADO(4L, "Anistiado"), 
	EM_PROCESSAMENTO(5L, "Em Processamento"), 
	EM_ATRASO(6L, "Em Atraso");

	private final Long codigo;
	private final String descricao;

	private TipoSituacaoPagamentoEnumeration(Long codigo, String descricao) {
		this.codigo = codigo;
	    this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
