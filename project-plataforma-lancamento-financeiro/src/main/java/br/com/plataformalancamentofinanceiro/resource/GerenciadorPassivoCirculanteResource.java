package br.com.plataformalancamentofinanceiro.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("gerenciadorPassivoCirculanteResource")
public class GerenciadorPassivoCirculanteResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String mensagem() {
		return "REST - Plataforma de Lançamento Financeiro";
	}
	
}
