angular.module('student').controller('AddProjectController', ['$scope','StudentRepository','$stateParams','$state',
	function(scope,StudentRepository,stateParams,state){
	
scope.createProject  = function(project){
	StudentRepository.addProject(project).then(function (){
		alert("Project Saved...");
		state.go("projectsList");
	});
};
	
}]);