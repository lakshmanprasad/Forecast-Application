angular.module('student').controller('AddStudentController', ['$scope','StudentRepository','$state',
	function(scope,StudentRepository,state){
	
scope.createStudent  = function(student){
	StudentRepository.addStudent(student).then(function (){
		state.go("studentList");
	});
};

scope.studentListScreen = function(){
	state.go("studentList");
};
}]);