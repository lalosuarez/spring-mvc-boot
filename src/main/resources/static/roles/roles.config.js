'use strict';

angular.module('app.roles', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
	
	$routeProvider.when('/roles', {
      templateUrl: '/roles/roles.html',
      controller: 'RolesCtrl'
	});

	console.log('Roles config loaded');
}])

.controller('RolesCtrl', function($scope) {
    $scope.headingTitle = "Roles List";
});