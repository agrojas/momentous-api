'use strict';

angular.module('momentous-app.menu', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/menu', {
            templateUrl: 'js/menu/menu.html',
            controller: 'MenuCtrl as vm'
        });
    }])
    .service('MenuService', ['$http','$q', function ($http, $q) {
        var url = "http://localhost:8080/menus";

        
        this.getMenus = function () {
            var deferred  = $q.defer();
            $http.get(url)
                .success(function (data) {
                    deferred.resolve(data);
                })
                .error(function (data) {
                    deferred.reject(data);
                    console.log('login failed...');
                });
            return deferred.promise;
        }

    }])
    .controller('MenuCtrl', ['MenuService',function (MenuService) {
        var vm = this;
        vm.menus = {};
        vm.filterMenu = "";
        init();

        function init() {
            MenuService.getMenus().then(
                function(data){
                    vm.menus = data.results;
                },
                function(data){
                    alert("Error");
                }
            );
        }
        
        function edit() {
        	alert("In construction")
        }
        
        function delet() {
        	alert("In construction")
        }
        
        vm.init = init;
        vm.edit = edit;
        vm.delet = delet;
    }]);