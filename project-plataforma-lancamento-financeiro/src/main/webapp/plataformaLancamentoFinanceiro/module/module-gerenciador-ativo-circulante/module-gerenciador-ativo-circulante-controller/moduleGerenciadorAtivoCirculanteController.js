var gerenciadorAtivoCirculanteModulo = angular.module('GerenciadorAtivoCirculanteModulo',[]);

gerenciadorAtivoCirculanteModulo.controller('gerenciadorAtivoCirculanteController', function($scope, $http) {

    $scope.gerenciadorAtivoCirculanteModel = {};

    recuperarAtivoCirculanteJson();

    // Responsavel por recuperar dados de arquivo no disco no formato JSON
    function recuperarAtivoCirculanteJson() {
        $http.get('module-gerenciador-ativo-circulante-document/GerenciadorAtivoCirculanteConsolidado.json').then(function(response) {
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