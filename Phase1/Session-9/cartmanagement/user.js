"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.User = void 0;
var User = /** @class */ (function () {
    function User(id, name1, email) {
        this.id = id;
        this.name1 = name1;
        this.email = email;
    }
    User.prototype.display = function () {
        console.log("Name: ".concat(this.name1));
        console.log("Id: ".concat(this.id));
        console.log("Email: ".concat(this.email));
    };
    return User;
}());
exports.User = User;
