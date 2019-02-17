function savePassivoCirculante(event) {
	
    var gerenciadorPassivoCirculanteFavorecido = document.getElementById('gerenciadorPassivoCirculanteFavorecidoView').value;
    var gerenciadorPassivoCirculanteDataAquisicao = document.getElementById('gerenciadorPassivoCirculanteDataAquisicaoView').value;
    var gerenciadorPassivoCirculanteDataPagamento = document.getElementById('gerenciadorPassivoCirculanteDataPagamentoView').value;
    var gerenciadorPassivoCirculanteProdutoServico = document.getElementById('gerenciadorPassivoCirculanteProdutoServicoView').value;
    var gerenciadorPassivoCirculanteNotaFiscal = document.getElementById('gerenciadorPassivoCirculanteNotaFiscalView').value;
    var gerenciadorPassivoCirculanteValorDespesa = document.getElementById('gerenciadorPassivoCirculanteValorDespesaView').value;
    var gerenciadorPassivoCirculanteTipoPassivo = document.getElementById('gerenciadorPassivoCirculanteTipoPassivoView').value;
    var gerenciadorPassivoCirculanteFontePagamento = document.getElementById('gerenciadorPassivoCirculanteFontePagamentoView').value;
    var gerenciadorPassivoCirculanteCanalPagamento = document.getElementById('gerenciadorPassivoCirculanteCanalPagamentoView').value;
    var gerenciadorPassivoCirculanteResponsavelPagamento = document.getElementById('gerenciadorPassivoCirculanteResponsavelPagamentoView').value;

    gerenciadorPassivoCirculanteModel = {
        gerenciadorPassivoCirculanteFavorecidoModelModel: gerenciadorPassivoCirculanteFavorecido,
        gerenciadorPassivoCirculanteDataAquisicaoModel: gerenciadorPassivoCirculanteDataAquisicao,
        gerenciadorPassivoCirculanteDataPagamentoModel: gerenciadorPassivoCirculanteDataPagamento,
        gerenciadorPassivoCirculanteProdutoServicoModel: gerenciadorPassivoCirculanteProdutoServico,
        gerenciadorPassivoCirculanteNotaFiscalModel: gerenciadorPassivoCirculanteNotaFiscal,
        gerenciadorPassivoCirculanteValorDespesaModel: gerenciadorPassivoCirculanteValorDespesa,
        gerenciadorPassivoCirculanteTipoPassivoModel: gerenciadorPassivoCirculanteTipoPassivo,
        gerenciadorPassivoCirculanteFontePagamentoModel: gerenciadorPassivoCirculanteFontePagamento,
        gerenciadorPassivoCirculanteCanalPagamentoModel: gerenciadorPassivoCirculanteCanalPagamento,
        gerenciadorPassivoCirculanteResponsavelPagamentoModel: gerenciadorPassivoCirculanteResponsavelPagamento,
    }
    
    if(localStorage.getItem('modulePassivoCirculante') === null) {
    	var passivoCirculanteList = [];
    		passivoCirculanteList.push(gerenciadorPassivoCirculanteModel);
    		localStorage.setItem('modulePassivoCirculante', JSON.stringify(passivoCirculanteList));
    } else {
    	var passivoCirculanteList = JSON.parse(localStorage.getItem('modulePassivoCirculante'));
	    	passivoCirculanteList.push(gerenciadorPassivoCirculanteModel);
			localStorage.setItem('modulePassivoCirculante', JSON.stringify(passivoCirculanteList));
    }

//    console.log(gerenciadorPassivoCirculanteModel);

    event.preventDefault();
}

function findAllPassivoCirculante() {
    
   if(typeof(Storage) != undefined) {
	   if(localStorage.getItem('modulePassivoCirculante') === null) {
	    	var passivoCirculanteList = [];
	    		passivoCirculanteList.push(gerenciadorPassivoCirculanteModel);
	    		localStorage.setItem('modulePassivoCirculante', JSON.stringify(passivoCirculanteList));
	    } else {
	    	var passivoCirculanteList = JSON.parse(localStorage.getItem('modulePassivoCirculante'));
		    	passivoCirculanteList.push(gerenciadorPassivoCirculanteModel);
				localStorage.setItem('modulePassivoCirculante', JSON.stringify(passivoCirculanteList));
	    }
   } else {
	   document.write("Browser sem Suporte para Storage!");
   }    
    
//    var passivoCirculanteList = JSON.parse(localStorage.getItem('modulePassivoCirculante'));
//    var passivoCirculanteResult = document.getElementById('consultarPassivoCirculanteTable');

    // passivoCirculanteResult.innerHTML = '';

    // if (passivoCirculanteList.length == 0 && passivoCirculanteList.length == null) {

    //     console.log(passivoCirculanteList);

    //     for (let i = 0; i < passivoCirculanteList.length; i++) {
    //         var gerenciadorPassivoCirculanteFavorecidoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteFavorecido;
    //         var gerenciadorPassivoCirculanteDataAquisicaoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteDataAquisicao,
    //         var gerenciadorPassivoCirculanteDataPagamentoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteDataPagamento,
    //         var gerenciadorPassivoCirculanteProdutoServicoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteProdutoServico,
    //         var gerenciadorPassivoCirculanteNotaFiscalView = passivoCirculanteList[i].gerenciadorPassivoCirculanteNotaFiscal,
    //         var gerenciadorPassivoCirculanteValorDespesaView = passivoCirculanteList[i].gerenciadorPassivoCirculanteValorDespesa,
    //         var gerenciadorPassivoCirculanteTipoPassivoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteTipoPassivo,
    //         var gerenciadorPassivoCirculanteFontePagamentoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteFontePagamento,
    //         var gerenciadorPassivoCirculanteCanalPagamentoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteCanalPagamento,
    //         var gerenciadorPassivoCirculanteResponsavelPagamentoView = passivoCirculanteList[i].gerenciadorPassivoCirculanteResponsavelPagamento,
    //     }

    //     passivoCirculanteResult.innerHTML += '<tr><td>' + gerenciadorPassivoCirculanteFavorecidoView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteDataAquisicaoView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteDataPagamentoView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteProdutoServicoView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteNotaFiscalView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteValorDespesaView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteTipoPassivoView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteFontePagamentoView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteCanalPagamentoView +
    //         '<tr><td>' + gerenciadorPassivoCirculanteResponsavelPagamentoView +
    //         '</tr>';
    // }

}

function updatePassivoCirculante(event) {
	
}

function deletePassivoCirculante(event) {
	
}

function clearPassivoCirculante(event) {
	
}
