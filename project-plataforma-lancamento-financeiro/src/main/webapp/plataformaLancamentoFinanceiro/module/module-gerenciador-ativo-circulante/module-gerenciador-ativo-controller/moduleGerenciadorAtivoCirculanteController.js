var gerenciadorAtivoCirculanteModulo = angular.module('gerenciadorAtivoCirculanteModulo',[]);

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
    
    $scope.gerenciadorAtivoCirculanteModelResult = gerenciadorAtivoCirculanteModelList;
    // console.log($scope.gerenciadorAtivoCirculanteModelResult);

    // save
    $scope.save = function(gerenciadorAtivoCirculanteModel) {
        // console.log(gerenciadorAtivoCirculanteModel);
        $scope.gerenciadorAtivoCirculanteModelResult.push(gerenciadorAtivoCirculanteModel);
        clear();
    };

    // delete
    $scope.delete = function(gerenciadorAtivoCirculanteModel) {
        console.log('Excluir: ' + gerenciadorAtivoCirculanteModel.fontePagamento);
        for( var i = 0, length = $scope.gerenciadorAtivoCirculanteModelResult.length ; i < length ; i++ ) {
            if($scope.gerenciadorAtivoCirculanteModelResult[i].codigo == gerenciadorAtivoCirculanteModel.codigo) {
                $scope.gerenciadorAtivoCirculanteModelResult.splice(i, 1);
            }
        }
    }

    // clear
    function clear() {
        $scope.gerenciadorAtivoCirculanteModel = {};
    }

});