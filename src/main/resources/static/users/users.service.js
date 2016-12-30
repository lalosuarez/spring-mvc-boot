'use strict';

angular.module('app.users')

.service('UsersService', function($http) {
	
	this.getAll = function() {
		return $http({
			method: 'GET',
			url: 'http://localhost:8080/restapi/users'
		});
	};
	
	this.add = function(user) {
		return $http({
			method: 'POST',
			url: 'http://localhost:8080/restapi/users',
			headers: {
				'Content-Type':'application/json'
			},
			data: user
		});
	}	
	
});