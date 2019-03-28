package br.com.plataformalancamentofinanceiro.repository;

import br.com.plataformalancamentofinanceiro.domain.PessoaDomain;

@SuppressWarnings("rawtypes")
public class PessoaRepository extends BaseRepository {

	private static final long serialVersionUID = 1L;

	public boolean persist(PessoaDomain pessoaDomain) {
		try {
			getBeginTransaction();
				getEntityManager().persist(pessoaDomain);
			getCommitTransaction();
			return Boolean.TRUE;
		} catch (Exception e) {
			getLogger().error(e.getMessage());
		}
		return Boolean.FALSE;
	}
	
}
