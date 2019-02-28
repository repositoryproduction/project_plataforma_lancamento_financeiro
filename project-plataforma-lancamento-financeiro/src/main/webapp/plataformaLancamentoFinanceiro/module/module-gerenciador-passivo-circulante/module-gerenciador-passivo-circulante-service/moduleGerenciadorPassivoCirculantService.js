var gerenciadorPassivoCirculanteModulo = angular.module('gerenciadorPassivoCirculanteModulo', []);

gerenciadorPassivoCirculanteModulo.controller("gerenciadorPassivoCirculanteController", function($scope, $http) {

    urlGerenciadorPassivoCirculanteURL = 'http://localhost:8080/project-plataforma-lancamento-financeiro-0.0.1-SNAPSHOT/plataformaLancamentoFinanceiroRest/gerenciadorPassivoCirculanteResource';

    $scope.findAll = function() {
    	$http.get(urlGerenciadorPassivoCirculanteURL).success(function(recuperarGerenciadorPassivoCirculanteResult) {
    		$scope.recuperarGerenciadorPassivoCirculanteList = recuperarGerenciadorPassivoCirculanteResult;
    	}).error(function (erro) {
    		alert(erro);
    	});
    }
    
    $scope.findAll();

});
