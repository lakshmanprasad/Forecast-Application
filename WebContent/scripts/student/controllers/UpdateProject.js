angular.module('student').controller('UpdateProjectController', ['$scope','StudentRepository','$stateParams','$state',
	function(scope,StudentRepository,stateParams,state){
//scope.student = StudentRepository.getStudent(stateParams.studentId);
scope.newprojects = StudentRepository.getProject(stateParams.projectId);

scope.updateProject  = function(student){
	StudentRepository.updateProject(student).then(function (){
		state.go("projectsList");
	}, function(){
		alert("Data error");
		state.go("projectsList");
	});
	
};

scope.studentListScn = function(){
	state.go("projectsList");
};
}]);