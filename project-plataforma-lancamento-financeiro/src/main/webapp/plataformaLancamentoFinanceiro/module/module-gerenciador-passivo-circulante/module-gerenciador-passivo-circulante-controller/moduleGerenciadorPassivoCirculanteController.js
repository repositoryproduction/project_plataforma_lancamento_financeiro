var gerenciadorPassivoCirculanteModulo = angular.module('gerenciadorPassivoCirculanteModulo', []);

gerenciadorPassivoCirculanteModulo.controller("gerenciadorPassivoCirculanteController", function($scope, $http) {

    $scope.passivoCirculanteModel = "";

    $scope.passivoCirculanteList = [];

    urlGerenciadorPassivoCirculanteURL = 'http://localhost:8080/project-plataforma-lancamento-financeiro-0.0.1-SNAPSHOT/plataformaLancamentoFinanceiroRest/gerenciadorPassivoCirculanteResource';
   
    $scope.findAll = function() {
    	$http.get(urlGerenciadorPassivoCirculanteURL).then(findAllSuccessCallback, findAllErrorCallback);
    }

    function findAllSuccessCallback(recuperarGerenciadorPassivoCirculanteResult) {
        $scope.recuperarGerenciadorPassivoCirculanteList = recuperarGerenciadorPassivoCirculanteResult.data;
        $scope.passivoCirculanteList = $scope.recuperarGerenciadorPassivoCirculanteList;
    }

    $scope.save = function() {
    	$http.post(urlGerenciadorPassivoCirculanteURL).then(saveSuccessCallback, saveErrorCallback);
    }

    function saveSuccessCallback(passivoCirculanteModelResult) {
        console.log(passivoCirculanteModelResult);
        $scope.passivoCirculanteModel = passivoCirculanteModelResult;
        $scope.passivoCirculanteList.push($scope.passivoCirculanteModel);
    }

    function saveErrorCallback(error) {
    	window.alert('ERRO: A URL esta indisponivel!');
    }

    function findAllErrorCallback(error) {
    	window.alert('ERRO: A URL esta indisponivel!');
    }

    $scope.findAll();

});
