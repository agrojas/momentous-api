'use strict';

// Declare app level module which depends on views, and components
angular.module('momentous-app', [
  'ngRoute',
  'momentous-app.menu'
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix('!');

  $routeProvider.otherwise({redirectTo: '/menu'});
}]);
