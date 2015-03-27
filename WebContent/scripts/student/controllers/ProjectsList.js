angular.module('student').controller('ProjectsListController', ['$scope','StudentRepository',function(scope,StudentRepository){
scope.test  = "This is for testing student ctrl";
// Calling the below function by loading this controller
readAllProjectsFromDB();
scope.deleteProject = function(id){
StudentRepository.deleteProject(id).then(readAllProjectsFromDB);
};

function readAllProjectsFromDB(){
	StudentRepository.getAllProjects().then(function(result){
		scope.projects = result;
	});

}
}]);