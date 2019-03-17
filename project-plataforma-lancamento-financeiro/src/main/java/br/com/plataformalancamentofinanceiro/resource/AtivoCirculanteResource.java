package br.com.plataformalancamentofinanceiro.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.plataformalancamentofinanceiro.domain.AtivoCirculanteDomain;
import br.com.plataformalancamentofinanceiro.factory.AtivoCirculanteFactory;

@Path("gerenciadorAtivoCirculanteResource")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class AtivoCirculanteResource {

	// FIXME [MGAC4000] -- Esse metodo nao esta salvando
	@POST
	public void save(AtivoCirculanteDomain ativoCirculanteDomain) {
		AtivoCirculanteFactory.getAtivoCirculanteDomainList().add(ativoCirculanteDomain);
	}
	
	@GET
	public List<AtivoCirculanteDomain> findAll() {
		return AtivoCirculanteFactory.getAtivoCirculanteDomainList();
	}
	
	@GET
	@Path("{codigo}")
	public AtivoCirculanteDomain findOne(@PathParam("codigo") Long codigo) {
		for(AtivoCirculanteDomain ativoCirculanteDomainResult : AtivoCirculanteFactory.getAtivoCirculanteDomainList()) {
			if(ativoCirculanteDomainResult.getCodigo().equals(codigo)) {
				return ativoCirculanteDomainResult;
			}
		}
		return null;
	}
	
	// FIXME [MGAC4000] -- Esse metodo nao esta alterando
	@PUT
	@Path("{codigo}")
	public AtivoCirculanteDomain update(AtivoCirculanteDomain ativoCirculanteDomain) {
		AtivoCirculanteFactory.getAtivoCirculanteDomainList().remove(ativoCirculanteDomain);
		AtivoCirculanteFactory.getAtivoCirculanteDomainList().add(ativoCirculanteDomain);
		return ativoCirculanteDomain;
	}
	
	// FIXME [MGAC4000] -- Esse metodo nao esta excluido via Servico
	@DELETE
	@Path("{codigo}")
	public AtivoCirculanteDomain remove(@PathParam("codigo") Long codigo) {
		for(AtivoCirculanteDomain ativoCirculanteDomainResult : AtivoCirculanteFactory.getAtivoCirculanteDomainList()) {
			if(ativoCirculanteDomainResult.getCodigo().equals(codigo)) {
				AtivoCirculanteFactory.getAtivoCirculanteDomainList().remove(ativoCirculanteDomainResult);
				return ativoCirculanteDomainResult;
			}
		}
		return null;
	}

}
