angular.module('student').controller('EditStudentController', ['$scope','StudentRepository','$stateParams','$state',
	function(scope,StudentRepository,stateParams,state){
scope.student = StudentRepository.getStudent(stateParams.studentId);
scope.updateStudent  = function(student){
	StudentRepository.updateStudents(student.id,student).then(function (){
		state.go("studentList");
	}, function(){
		alert("Data error");
		state.go("studentList");
	});
	
};

scope.studentListScn = function(){
	state.go("studentList");
};
}]);