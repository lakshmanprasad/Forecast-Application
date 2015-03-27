angular.module('student').controller('AddCalendarController', ['$scope','StudentRepository','$stateParams','$state',
	function(scope,StudentRepository,stateParams,state){
	
scope.createCalendar  = function(calendar){
	StudentRepository.addCalendar(calendar).then(function (){
		alert("Calendar Saved...");
		//state.go("getCalendar");
	});
};
	
scope.getCalendarData = function(){
StudentRepository.getAllQtrData(scope.student.year).then(function(result){
	scope.getAllQutarData = result;
});
};

}]);