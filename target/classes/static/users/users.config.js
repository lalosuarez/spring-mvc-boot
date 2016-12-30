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
		
	$scope.getAll = function() {
		UsersService.getAll().then(
			function success(response) {
				$scope.users = response.data;
			},
			function error(response) {
				console.log('error response', response);
			}
		);
	};
	
	$scope.add = function() {

		UsersService.add($scope.user).then(
			function success(response) {
				//console.log('success response', response);
				if (response.status === 200) {
					$scope.users.push(response.data);
					$scope.user = null;
				}
			},
			function error(response) {
				console.log('error response', response);
			}
		);
	};
	
	$scope.getAll();
}]);