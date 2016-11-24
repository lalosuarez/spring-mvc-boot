'use strict'

angular.module('app', [
    'ngRoute',
	'ngResource',
	'app.users',
	'app.roles'
])

.config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {

  // Estas 2 líneas deberían de ir dentro de receivedEvent: function(id) 
  $locationProvider.hashPrefix('!');
  $routeProvider.otherwise({redirectTo: '/users'});

  console.log('App config loaded');
}])