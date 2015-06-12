angular.module('myApp').controller('HomeController', function ($scope, EntryService){
    $scope.greeting = 'Hello, world';
    $scope.newEntry = {};

    $scope.alerts = [
//        { type: 'danger', msg: 'Oh snap! Change a few things up and try submitting again.' },
//        { type: 'success', msg: 'Well done! You successfully read this important alert message.' }
    ];

    $scope.closeAlert = function(index) {
        $scope.alerts.splice(index, 1);
    };

    $scope.clearMessage = function(){
        $scope.alerts = [];
    };

    $scope.showMessage = function(typee, msgg){
        $scope.alerts = [];
        $scope.alerts.push({type: typee, msg: msgg});
    };

    $scope.saveEntry = function(){
        EntryService.saveEntry($scope.newEntry);
    };

    function init(){
    }

    init();

});
