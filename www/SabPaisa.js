var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'SabPaisa', 'coolMethod', [arg0]);
};

module.exports.makePayment = function(arg0,success,error){
    exec(success, error, 'SabPaisa','makePayment',[arg0]);
}