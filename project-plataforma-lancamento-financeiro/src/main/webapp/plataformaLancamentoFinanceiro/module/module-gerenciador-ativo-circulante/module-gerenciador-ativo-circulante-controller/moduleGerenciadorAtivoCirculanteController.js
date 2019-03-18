var gerenciadorAtivoCirculanteModulo = angular.module('GerenciadorAtivoCirculanteModulo',[]);

gerenciadorAtivoCirculanteModulo.controller('gerenciadorAtivoCirculanteController', function($scope, $http) {

    var URL_FILE = 'module-gerenciador-ativo-circulante-document/GerenciadorAtivoCirculanteConsolidado.json';
    var URL_SERVICE = 'http://localhost:8080/project-plataforma-lancamento-financeiro-0.0.1-SNAPSHOT/plataformaLancamentoFinanceiro/module/module-gerenciador-ativo-circulante/module-gerenciador-ativo-circulante-document/GerenciadorAtivoCirculanteConsolidado.json';

    $scope.gerenciadorAtivoCirculanteModel = {};

    recuperarAtivoCirculanteJson();
    // recuperarAtivoCirculanteService();

    // Responsavel por recuperar dados de arquivo no disco no formato JSON
    function recuperarAtivoCirculanteJson() {
        $http.get(URL_FILE).then(function(response) {
            $scope.gerenciadorAtivoCirculanteModelResultList = response.data.gerenciadorAtivoCirculanteModelList; 
        });
    };

    // Responsavel por recuperar dados do servico
    function recuperarAtivoCirculanteService() {
        $http.get(URL_SERVICE).then(function(response) {
            $scope.gerenciadorAtivoCirculanteModelResultList = response.data.gerenciadorAtivoCirculanteModelList;
        });
    };
    
    // verificador
    $scope.verificador = function (gerenciadorAtivoCirculanteModel) {
        isRegistroEncontrado = false;
        $scope.delete(gerenciadorAtivoCirculanteModel);
        for( var i = 0, length = $scope.gerenciadorAtivoCirculanteModelResultList.length ; i < length ; i++ ) {
            if($scope.gerenciadorAtivoCirculanteModelResultList[i].codigo == gerenciadorAtivoCirculanteModel.codigo) {
                $scope.edit(gerenciadorAtivoCirculanteModel);
                isRegistroEncontrado = true;
                $scope.clear();               
                break;
            } 
        }
        if(!isRegistroEncontrado) {
            $scope.save(gerenciadorAtivoCirculanteModel);
        }
    }

    // save
    $scope.save = function(gerenciadorAtivoCirculanteModel) {
        // Deve gerar codigo automaticamente
        $scope.gerenciadorAtivoCirculanteModelResultList.push(gerenciadorAtivoCirculanteModel);
        $scope.clear();
    };

    // edit
    $scope.edit = function(gerenciadorAtivoCirculanteModel) {
        $scope.gerenciadorAtivoCirculanteModel = angular.copy(gerenciadorAtivoCirculanteModel);
    };

    // delete
    $scope.delete = function(gerenciadorAtivoCirculanteModel) {
        for( var i = 0, length = $scope.gerenciadorAtivoCirculanteModelResultList.length ; i < length ; i++ ) {
            if($scope.gerenciadorAtivoCirculanteModelResultList[i].codigo == gerenciadorAtivoCirculanteModel.codigo) {
                $scope.gerenciadorAtivoCirculanteModelResultList.splice(i, 1);
            }
        }
    }

    // clear
    $scope.clear = function() {
        $scope.gerenciadorAtivoCirculanteModel = {};
    }

});