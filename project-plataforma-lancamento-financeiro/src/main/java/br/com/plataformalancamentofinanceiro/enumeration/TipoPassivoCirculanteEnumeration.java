package br.com.plataformalancamentofinanceiro.enumeration;

public enum TipoPassivoCirculanteEnumeration {
	
	PASSIVO_CIRCULANTE_EXIGIVEL_LONGO_PRAZO(1, "PCELP", "Passivo Circulante Exigível a Logo Prazo"),
	PASSIVO_CIRCULANTE_EXIGIVEL_CURTO_PRAZO(2, "PCECP","Passivo Circulante Exigível a Curto Prazo");
	
	private Integer codigo;
	private String sigla;
	private String descricao;
	
	private TipoPassivoCirculanteEnumeration(Integer codigo, String sigla, String descricao) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
