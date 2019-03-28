package br.com.plataformalancamentofinanceiro.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.plataformalancamentofinanceiro.enumeration.TipoCategoriaPessoaEnumeration;
import br.com.plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

@Entity
@Table(name = "TB_PESSOA")
public class PessoaDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "TIPO_PESSOA")
	private TipoPessoaEnumeration tipoPessoaEnumeration;
	
	@Column(name = "TIPO_CATEGORIA_PESSOA")
	private TipoCategoriaPessoaEnumeration tipoCategoriaPessoaEnumeration;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "IS_ATIVO")
	private Boolean isAtivo;
	 
	@Column(name = "IS_FONTE_PAGAMENTO")
	private Boolean isFontePagamento;

	public PessoaDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public TipoPessoaEnumeration getTipoPessoaEnumeration() {
		return tipoPessoaEnumeration;
	}

	public void setTipoPessoaEnumeration(TipoPessoaEnumeration tipoPessoaEnumeration) {
		this.tipoPessoaEnumeration = tipoPessoaEnumeration;
	}

	public TipoCategoriaPessoaEnumeration getTipoCategoriaPessoaEnumeration() {
		return tipoCategoriaPessoaEnumeration;
	}

	public void setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration tipoCategoriaPessoaEnumeration) {
		this.tipoCategoriaPessoaEnumeration = tipoCategoriaPessoaEnumeration;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	public Boolean getIsFontePagamento() {
		return isFontePagamento;
	}

	public void setIsFontePagamento(Boolean isFontePagamento) {
		this.isFontePagamento = isFontePagamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		PessoaDomain other = (PessoaDomain) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GerenciadorPessoaDomain [nome=" + nome + "]";
	}
	
}
