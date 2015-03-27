

module = angular.module('app', []);

module.controller('NewUserController', function($scope) {
  $scope.save = function() {
    if ($scope.userForm.$valid) {
      alert('User saved');
      $scope.reset();
    } else {
      alert("There are invalid fields");
    }
  };
  
  $scope.reset = function() {
    $scope.user = { name: '', email: '' };
  }
});
			
			
function toggler(divId) {
    $("#" + divId).toggle();
}


$(document).ready(function(){
    $('.filterable .btn-filter').click(function(){
        var $panel = $(this).parents('.filterable'),
        $filters = $panel.find('.filters input'),
        $tbody = $panel.find('.table tbody');
        if ($filters.prop('disabled') == true) {
            $filters.prop('disabled', false);
            $filters.first().focus();
        } else {
            $filters.val('').prop('disabled', true);
            $tbody.find('.no-result').remove();
            $tbody.find('tr').show();
        }
    });


			
