package br.com.plataformalancamentofinanceiro.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.plataformalancamentofinanceiro.domain.PassivoCirculanteDomain;
import br.com.plataformalancamentofinanceiro.factory.PassivoCirculanteFactory;

@Path("gerenciadorPassivoCirculanteResource")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class PassivoCirculanteResource {

	@GET
	public List<PassivoCirculanteDomain> findAll() {
		return PassivoCirculanteFactory.getPassivoCirculanteDomainList();
	}
	
}
