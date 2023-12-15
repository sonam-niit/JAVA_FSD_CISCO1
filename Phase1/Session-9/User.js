var User = /** @class */ (function () {
    function User(id, name1, email) {
        this._id = id;
        this._name1 = name1;
        this._email = email;
    }
    Object.defineProperty(User.prototype, "id", {
        get: function () {
            return this._id;
        },
        set: function (id) {
            this._id = id;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "name1", {
        get: function () {
            return this._name1;
        },
        set: function (name1) {
            this._name1 = name1;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "email", {
        get: function () {
            return this._email;
        },
        enumerable: false,
        configurable: true
    });
    User.prototype.display = function () {
        console.log("Name: ".concat(this.name1));
        console.log("Id: ".concat(this.id));
        console.log("Email: ".concat(this.email));
    };
    return User;
}());
var u1 = new User(1, 'Alex', 'alex@gmail.com');
var u2 = new User(2, 'Bob', 'bob@gmail.com');
u1.display();
u2.display();
console.log("User2 Email: ".concat(u2.email));
u2.name1 = "Sonam Soni"; //call setter method
console.log("User2 Name: ".concat(u2.name1)); //calling setter method
