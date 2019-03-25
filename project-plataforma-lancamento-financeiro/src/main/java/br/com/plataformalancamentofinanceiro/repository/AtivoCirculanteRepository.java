package br.com.plataformalancamentofinanceiro.repository;

import br.com.plataformalancamentofinanceiro.domain.AtivoCirculanteDomain;

@SuppressWarnings("rawtypes")
public class AtivoCirculanteRepository extends BaseRepository {

	private static final long serialVersionUID = 1L;
	
	public boolean persist(AtivoCirculanteDomain ativoCirculanteDomain) {
		try {
			getBeginTransaction();
				getEntityManager().persist(ativoCirculanteDomain);
			getCommitTransaction();
			return Boolean.TRUE;
		} catch (Exception e) {
			getLogger().error(e.getMessage());
		}
		return Boolean.FALSE;
	}
	
}
