angular.module('student').controller('StudentListController', ['$scope','StudentRepository',function(scope,StudentRepository){
scope.test  = "This is for testing student ctrl";
// Calling the below function by loading this controller
readAllStudentsFromDB();
scope.deleteStudent = function(id){
StudentRepository.deleteStudent(id).then(readAllStudentsFromDB);
};

function readAllStudentsFromDB(){
	StudentRepository.getAllStudents().then(function(result){
		scope.students = result;
	});

}
}]);