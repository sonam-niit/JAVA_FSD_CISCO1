"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var cart_1 = require("./cart");
var product_1 = require("./product");
var user_1 = require("./user");
var sonam = new cart_1.Cart(new user_1.User(1, 'Sonam Soni', 'sonam@gmail.com'));
sonam.addProductToCart(new product_1.Product(1, 'Shirt', 999));
sonam.addProductToCart(new product_1.Product(2, 'Stattionary', 499));
sonam.getCartDetails();
console.log("Total Amount of Sonam's Cart: ".concat(sonam.totalAmount()));
