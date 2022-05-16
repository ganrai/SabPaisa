var exec = require('cordova/exec');


module.exports.makePayment = function(arg0,success,error){
    exec(success, error, 'SabPaisa','makePayment',[arg0]);
}