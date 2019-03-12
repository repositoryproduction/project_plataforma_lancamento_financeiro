var gerenciadorAtivoCirculanteModulo = angular.module('GerenciadorAtivoCirculanteModulo',[]);

gerenciadorAtivoCirculanteModulo.controller('gerenciadorAtivoCirculanteController', function($scope) {

    var gerenciadorAtivoCirculanteModelList = [
        {
            codigo: 1,
            fontePagamento: 'Indra Company Brazil',
            categoria: 'Composição de Salário (01/12)',
            numeroParcela: null,
            valorParcela: 'R$ 1.500,00',
            dataRecebimento: '05/03/2019',
            contaDestino: 'Banco Santander',
            observacao: null,
        },
        {
            codigo: 2,
            fontePagamento: 'Basis Tecnologia da Informação',
            categoria: 'Recisão Contratual (01/02)',
            numeroParcela: null,
            valorParcela: 'R$ 500,00',
            dataRecebimento: '05/03/2019',
            contaDestino: 'Banco Santander',
            observacao: null,
        },
        {
            codigo: 3,
            fontePagamento: 'Tesouro Direto',
            categoria: 'Retorno de Investimento (01/05)',
            numeroParcela: null,
            valorParcela: 'R$ 2000,00',
            dataRecebimento: '14/05/2019',
            contaDestino: 'Banco Caixa Econômica Federal',
            observacao: null,
        }
    ];

    $scope.gerenciadorAtivoCirculanteModel = {};
    
    $scope.gerenciadorAtivoCirculanteModelResultList = gerenciadorAtivoCirculanteModelList;

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