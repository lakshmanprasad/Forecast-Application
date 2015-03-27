angular.module('student').controller('UpdateForecastController', ['$scope','StudentRepository','$stateParams','$state',
	function(scope,StudentRepository,stateParams,state){
	
scope.updateForecastUSerData  = function(calendar){
	StudentRepository.updateForecastUserData(calendar,scope.ss.year).then(function (){
		alert("ForecastUser Calendar Saved...");
		//state.go("getCalendar");
	});
};
	

scope.getMemberForecastData = function(){
    StudentRepository.getMemberForecastData(scope.ss.year).then(function(result){
	scope.getMemberForecastingData = result;
});
};

}]);