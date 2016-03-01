'use strict';

(function(app) {
    app.example.controller('app', function($scope) {
        $scope.who = 'world';
        $scope.greet = function() {
            Android.showToast('Hello, ' + $scope.who + '!');
        };
    });
})(window.app);
