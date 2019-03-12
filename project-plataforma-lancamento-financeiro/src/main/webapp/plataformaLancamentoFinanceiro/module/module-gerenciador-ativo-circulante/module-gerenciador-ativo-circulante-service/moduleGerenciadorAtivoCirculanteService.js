angular.service('GerenciadorAtivoCirculanteService', function() {

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
            valorParcela: 'R$ 5.000,00',
            dataRecebimento: '05/03/2019',
            contaDestino: 'Banco Santander',
            observacao: null,
        },
        {
            codigo: 3,
            fontePagamento: 'Tesouro Direto',
            categoria: 'Retorno de Investimento (01/05)',
            numeroParcela: null,
            valorParcela: 'R$ 2.000,00',
            dataRecebimento: '14/05/2019',
            contaDestino: 'Banco Caixa Econômica Federal',
            observacao: null,
        }
    ];

    // FindAll
    this.findAll = function() {
        console.log("Find All Service...");
        return gerenciadorAtivoCirculanteModelList;
    };

    // verificador
    this.verificador = function (gerenciadorAtivoCirculanteModel) {
        console.log('Verificador Service...');
        isRegistroEncontrado = false;
        $scope.delete(gerenciadorAtivoCirculanteModel);
        console.log(gerenciadorAtivoCirculanteModel);
        for( var i = 0, length = $scope.gerenciadorAtivoCirculanteModelResultList.length ; i < length ; i++ ) {
            if($scope.gerenciadorAtivoCirculanteModelResultList[i].codigo == gerenciadorAtivoCirculanteModel.codigo) {
                $scope.edit(gerenciadorAtivoCirculanteModel);
                console.log('Edit...');
                isRegistroEncontrado = true;
                $scope.clear();               
                break;
            } 
        }
        if(!isRegistroEncontrado) {
            console.log('Save...');
            this.save(gerenciadorAtivoCirculanteModel);
        }
    }

    // save
    this.save = function(gerenciadorAtivoCirculanteModel) {
        $scope.gerenciadorAtivoCirculanteModelResultList.push(gerenciadorAtivoCirculanteModel);
        $scope.clear();
    };

    // clear
    $scope.clear = function() {
        $scope.gerenciadorAtivoCirculanteModel = {};
    }

});