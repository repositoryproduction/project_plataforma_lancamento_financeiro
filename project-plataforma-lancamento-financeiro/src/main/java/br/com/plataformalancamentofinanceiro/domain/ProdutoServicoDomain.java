package br.com.plataformalancamentofinanceiro.domain;

import java.io.Serializable;

public class ProdutoServicoDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	
	private String nome;
	
	private String descricao;
	
	public ProdutoServicoDomain() { }
	
	public ProdutoServicoDomain(Long codigo, String nome, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		ProdutoServicoDomain other = (ProdutoServicoDomain) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProdutoServicoDomain [codigo=" + codigo + "]";
	}

}
