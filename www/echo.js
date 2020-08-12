var exec = require('cordova/exec');
var utils = require('cordova/utils');

module.exports = {
    threadFunction: function () {
        utils.alert('calling threads');

        var successCallback = function(message) {
            alert('oww');
            utils.alert(message);
        }
    
        var errorCallback = function() {
            utils.alert("Error calling Echo Plugin");
        }

        exec(
            successCallback, 
            errorCallback,
            "Echo",
            "threadFunction",
            []
        );

        utils.alert('finished calling thread');
    },
};

