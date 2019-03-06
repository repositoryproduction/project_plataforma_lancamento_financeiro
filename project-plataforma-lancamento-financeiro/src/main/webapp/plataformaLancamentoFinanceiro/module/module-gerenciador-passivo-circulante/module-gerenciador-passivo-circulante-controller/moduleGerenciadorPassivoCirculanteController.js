var gerenciadorPassivoCirculanteModulo = angular.module('gerenciadorPassivoCirculanteModulo', []);

gerenciadorPassivoCirculanteModulo.controller("gerenciadorPassivoCirculanteController", function($scope, $http) {

    $scope.passivoCirculanteModel = {
            "codigo": null,
            "favorecido": {
                "codigo": null,
                "tipoPessoaEnumeration": null,
                "tipoCategoriaPessoaEnumeration": null,
                "nome": null,
                "isAtivo": null,
                "isFontePagamento": null
            },
            "dataPagamento": null,
            "produtoServicoDomain": {
                "codigo": null,
                "nome": null,
                "descricao": null
            },
            "notaFiscal": null,
            "valorPagamento": null,
            "fontePagamentoDomain": {
                "codigo": null,
                "tipoPessoaEnumeration": null,
                "tipoCategoriaPessoaEnumeration": null,
                "nome": null,
                "isAtivo": null,
                "isFontePagamento": false
            },
            "tipoCanalPagamentoEnumeration": null,
            "resposavelPagamentoDomain": {
                "codigo": null,
                "tipoPessoaEnumeration": null,
                "tipoCategoriaPessoaEnumeration": null,
                "nome": null,
                "isAtivo": null,
                "isFontePagamento": null
            },
            "tipoPassivoCirculanteEnumeration": null,
            "tipoSituacaoPagamentoEnumeration": null
        };

    $scope.passivoCirculanteList = [];

    urlGerenciadorPassivoCirculanteURL = 'http://localhost:8080/project-plataforma-lancamento-financeiro-0.0.1-SNAPSHOT/plataformaLancamentoFinanceiroRest/gerenciadorPassivoCirculanteResource';
    
    /**
     * [Salvar Passivo Circulante]
     */
    $scope.save = function() {
    	console.log($scope.passivoCirculanteModel);
    	saveSuccessCallback($scope.passivoCirculanteModel);
    }
    
    /**
     * [Recuperar Passivo Circulante]
     */
    $scope.findAll = function() {
    	$http.get(urlGerenciadorPassivoCirculanteURL).then(findAllSuccessCallback, findAllErrorCallback);
    }

    function findAllSuccessCallback(recuperarGerenciadorPassivoCirculanteResult) {
    	console.log(recuperarGerenciadorPassivoCirculanteResult.data);
        $scope.recuperarGerenciadorPassivoCirculanteList = recuperarGerenciadorPassivoCirculanteResult.data;
        $scope.passivoCirculanteList = $scope.recuperarGerenciadorPassivoCirculanteList;
    }

    function saveSuccessCallback(passivoCirculanteModelResult) {
        console.log(passivoCirculanteModelResult);
        $scope.passivoCirculanteModel = passivoCirculanteModelResult;
        $scope.passivoCirculanteList.push($scope.passivoCirculanteModel);
        $http.post(urlGerenciadorPassivoCirculanteURL, $scope.passivoCirculanteModel).then(saveSuccessCallback, saveErrorCallback);
    }

    function saveErrorCallback(error) {
    	window.alert('ERRO: Não Foi Possível realizar o cadastro do ' + $scope.passivoCirculanteModelResult.favorecido.nome + ' no momento!');
    }

    function findAllErrorCallback(error) {
    	window.alert('ERRO: A URL esta indisponivel!');
    }

    $scope.findAll();

});
