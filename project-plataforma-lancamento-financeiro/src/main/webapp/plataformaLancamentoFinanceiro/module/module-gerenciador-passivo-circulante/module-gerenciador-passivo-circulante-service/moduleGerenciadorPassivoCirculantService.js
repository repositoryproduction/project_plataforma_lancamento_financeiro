var gerenciadorPassivoCirculanteModulo = angular.module('gerenciadorPassivoCirculanteModulo', []);

gerenciadorPassivoCirculanteModulo.controller("gerenciadorPassivoCirculanteController", function($scope, $http) {

    urlGerenciadorPassivoCirculanteURL = 'http://localhost:8080/project-plataforma-lancamento-financeiro-0.0.1-SNAPSHOT/plataformaLancamentoFinanceiroRest/gerenciadorPassivoCirculanteResource';
    
    $scope.findAll = function() {
    	$http.get(urlGerenciadorPassivoCirculanteURL).then(successCallback, errorCallback);
    }

    function successCallback(recuperarGerenciadorPassivoCirculanteResult) {
    	$scope.recuperarGerenciadorPassivoCirculanteList = recuperarGerenciadorPassivoCirculanteResult.data;
        console.log('RESULTADO:' + $scope.recuperarGerenciadorPassivoCirculanteList);
    }

    function errorCallback(error) {
    	window.alert('ERRO: A URL esta indisponivel!');
    }

    $scope.findAll();

});
