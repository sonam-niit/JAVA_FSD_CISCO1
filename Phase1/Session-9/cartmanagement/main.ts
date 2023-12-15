import { Cart } from "./cart";
import { Product } from "./product";
import { User } from "./user";

const sonam= new Cart(new User(1,'Sonam Soni','sonam@gmail.com'));
sonam.addProductToCart(new Product(1,'Shirt',999));
sonam.addProductToCart(new Product(2,'Stattionary',499));

sonam.getCartDetails();
console.log(`Total Amount of Sonam's Cart: ${sonam.totalAmount()}`);
