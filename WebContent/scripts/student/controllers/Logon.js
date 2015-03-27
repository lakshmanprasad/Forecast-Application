angular.module('student').controller('LogonController', ['$scope','StudentRepository','$stateParams','$state',
	function(scope,StudentRepository,stateParams,state){
	
scope.loginCheck  = function(){
	StudentRepository.loginCheck(scope.member.psaId,scope.member.pwd).then(function (response){
		if(response.data == "true")
		{
			state.go("addStudent");
		}
		else if(response.data == "false")
		{
			alert("PSA ID/Password is Invalid...");
			state.go("logon");
		}
		
	});
};
	
scope.getCalendarData = function(){
StudentRepository.getAllQtrData(scope.student.year).then(function(result){
	scope.getAllQutarData = result;
});
};

}]);