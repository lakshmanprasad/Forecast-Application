angular.module('student').service('StudentRepository',['$http','$q', function(http, $q){
var students=[];
var projects=[];
var calendar=[];
var group=[];
this.getAllStudents = function(){
	var defer = $q.defer();
		var studentPromise =  http.get('/SpringMVCWithJSON/membersList');
		studentPromise.then(function(result){ 
			students = result.data;
			defer.resolve(students);
		});
	return defer.promise;
}

this.getAllProjects = function(){
	var defer = $q.defer();
		var projectsPromise =  http.get('/SpringMVCWithJSON/projectsList');
		projectsPromise.then(function(result){ 
			projects = result.data;
			defer.resolve(projects);
		});
	return defer.promise;
}


this.addStudent = function(student)
{
	return http.post('/SpringMVCWithJSON/addMember/',student);
}

this.addCalendar = function(calendar)
{
	return http.post('/SpringMVCWithJSON/addCalendar/',calendar);
}

this.addProject = function(project)
{
	return http.post('/SpringMVCWithJSON/addProjects/',project);
}

this.deleteStudent = function(id)
{
	return http.put('/SpringMVCWithJSON/deleteUser/'+id);
}

this.deleteProject = function(id)
{
	return http.put('/SpringMVCWithJSON/deleteProject/'+id);
}


this.getStudent = function(id){
	var validStudent = students.filter(function(item){ return item.psaId == id;
	});
	return validStudent.length>0? validStudent[0]: [];
}

this.getProject = function(id){
	var validProject = projects.filter(function(item){ 
		return item.projectId == id;
	});
	return validProject.length>0? validProject[0]: [];
}


this.updateStudents = function(studentInfo){
	return http.put('/SpringMVCWithJSON/updateMember/',studentInfo);
}

this.updateProject = function(studentInfo){
	return http.put('/SpringMVCWithJSON/updateProject/',studentInfo);
}

this.getAllQtrData = function(year){
	var defer = $q.defer();
	var studentPromise =  http.put('/SpringMVCWithJSON/getAllQtrData/',year);
	studentPromise.then(function(result){ 
		calendar = result.data;
		defer.resolve(calendar);
	});
    return defer.promise;
}


this.getMemberForecastData = function(year){
	var defer = $q.defer();
	var studentPromise =  http.put('/SpringMVCWithJSON/getMemeberForecastData/',year);
	studentPromise.then(function(result){ 
		calendar = result.data;
		defer.resolve(calendar);
	});
    return defer.promise;
}

this.updateForecastUserData = function(calendar,year)
{
	calendar.year = year;
	return http.post('/SpringMVCWithJSON/updateForecastCalendar/', calendar);

}

this.loginCheck = function(pasId,pwd)
{
	var testVar  = pasId + ","+pwd;
	return http.post('/SpringMVCWithJSON/loginValidate/',testVar);
}


this.getGroupAndProjectsData = function(){
	var defer = $q.defer();
	var studentPromise =  http.put('/SpringMVCWithJSON/getGroupsData/');
	studentPromise.then(function(result){ 
		group = result.data;
		defer.resolve(group);
	});
    return defer.promise;
}

}]);