'use strict';

angular.module('app.users', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
	
	$routeProvider.when('/users', {
      templateUrl: '/users/users.html',
      controller: 'UsersCtrl'
	});

	console.log('Users config loaded');
}])

.controller('UsersCtrl', ['$scope', 'UsersService', function($scope, UsersService) {

	$scope.headingTitle = "Users List";
	
	UsersService.getAll().then(
		function success(response) {
			$scope.users = response.data;
		},
		function error(response) {
			console.log('error response', response);
		}
	);
}]);