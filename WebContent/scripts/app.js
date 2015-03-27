angular.module('firstApp',['student','ui.router','ui.bootstrap']).config(['$stateProvider', '$urlRouterProvider', '$locationProvider', 
	function ($stateProvider, $urlRouterProvider, $locationProvider) {
		$stateProvider
		    .state('studentList', {
		      url: '/studentList',
		      templateUrl: 'scripts/partials/forcasteditemployee.html',
		      controller: 'StudentListController'
		    })
		    .state('updateStudent', {
		      url: '/updateStudent/:studentId',
		      templateUrl: 'scripts/partials/forcastupdateemployee.html',
		      controller: 'UpdateStudentController'
		    })
		    .state('addCalendar', {
		      url: '/addCalendar',
		      templateUrl: 'scripts/partials/forecastaddcalender.html',
		      controller: 'AddCalendarController'
		    })
		    .state('addProject', {
		      url: '/addProject',
		      templateUrl: 'scripts/partials/addProject.html',
		      controller: 'AddProjectController'
		    })
		    .state('projectsList', {
		      url: '/projectsList',
		      templateUrl: 'scripts/partials/forcasteditprojects.html',
		      controller: 'ProjectsListController'
		    })
		    .state('updateProject', {
		      url: '/updateProject/:projectId',
		      templateUrl: 'scripts/partials/forcastupdateproject.html',
		      controller: 'UpdateProjectController'
		    })
		    .state('updateForecast', {
		      url: '/updateForecast',
		      templateUrl: 'scripts/partials/forecastupdatecalender.html',
		      controller: 'UpdateForecastController'
		    })
		    .state('getCalendar', {
		      url: '/getCalendar/:year',
		      templateUrl: 'scripts/partials/forecastaddcalender.html',
		      controller: 'AddCalendarController'
		    })
		    .state('logon', {
		      url: '/logon',
		      templateUrl: 'scripts/partials/forecastlogin.html',
		      controller: 'LogonController'
		    })
		    .state('viewForeCast', {
		      url: '/viewForeCast',
		      templateUrl: 'scripts/partials/viewforcast.html',
		      controller: 'ViewForeCastController'
		    })
		    .state('utilizationHours', {
		      url: '/utilizationHours',
		      templateUrl: 'scripts/partials/utilizehours.html',
		      controller: 'ViewForeCastController'
		    })
		    .state('addStudent', {
		      url: '/addStudent',
		      templateUrl: 'scripts/partials/forcastaddemployee.html',
		      controller: 'AddStudentController'
		    });
		$urlRouterProvider.otherwise('/logon');
}]);