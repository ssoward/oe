angular.module('myApp').config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/main');

    $stateProvider
        .state('main', {
            url: '/main',
            templateUrl: 'partials/home.html',
            controller: 'HomeController'
        })
        .state('store', {
            url: '/store',
            templateUrl: 'partials/store.html',
            controller: 'StoreController'
        });

});
