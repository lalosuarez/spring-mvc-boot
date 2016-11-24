'use strict';

angular.module('app.users', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
	
	$routeProvider.when('/users', {
      templateUrl: '/users/users.html',
      controller: 'UsersCtrl'
	});

	console.log('Users config loaded');
}])

.controller('UsersCtrl', function($scope) {
    $scope.headingTitle = "User List";
});