"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Cart = void 0;
var Cart = /** @class */ (function () {
    function Cart(user) {
        this.user = user;
        this.products = [];
    }
    Cart.prototype.addProductToCart = function (product) {
        this.products.push(product);
        console.log("Product Added to the cart");
    };
    Cart.prototype.removeProductFromCart = function (id) {
        this.products = this.products.filter(function (item) { return item.id != id; });
        console.log("Product Removed");
    };
    Cart.prototype.totalAmount = function () {
        var sum = 0;
        for (var _i = 0, _a = this.products; _i < _a.length; _i++) {
            var p = _a[_i];
            sum += p.price;
        }
        return sum;
        //return this.products.reduce((acc,curr)=>acc.price+curr);
    };
    Cart.prototype.getCartDetails = function () {
        this.user.display();
        this.products.forEach(function (item) { return item.display(); });
    };
    return Cart;
}());
exports.Cart = Cart;
