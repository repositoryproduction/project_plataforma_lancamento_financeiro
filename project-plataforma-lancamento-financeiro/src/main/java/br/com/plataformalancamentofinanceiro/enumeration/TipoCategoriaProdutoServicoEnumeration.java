package br.com.plataformalancamentofinanceiro.enumeration;

/**
 * FIXME [DESENVOLVIMENTO] -- 
 * @Alert Esse <b>Enumeration</b> deve ser substituido por uma classe de dominio futuramente.
 */
public enum TipoCategoriaProdutoServicoEnumeration {

	ASSOCIACAO_RELIGIOSA("Associação Religiosa"),
	ALIMENTOS("Alimentos"),
	TEATRO("Teatro"),
	CINEMA("Cinema"),
	MEDICAMENTOS("Medicamentos"),
	ALUGUEL_RESIDENCIAL("Aluguel"),
	CONSULTA_MEDICA("Consulta Médica");

	private final String nome;

	private TipoCategoriaProdutoServicoEnumeration(String nome) {
	    this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}
