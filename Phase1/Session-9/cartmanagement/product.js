"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Product = void 0;
var Product = /** @class */ (function () {
    function Product(id, name1, price) {
        this.id = id;
        this.name1 = name1;
        this.price = price;
    }
    Product.prototype.display = function () {
        console.log("Details:".concat(this.id, " - ").concat(this.name1, " - ").concat(this.price));
    };
    return Product;
}());
exports.Product = Product;
