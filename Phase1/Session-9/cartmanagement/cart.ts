import { Product } from "./product";
import { User } from "./user";

export class Cart{
    private user:User;
    private products:Product[];

    constructor(user:User){
        this.user=user;
        this.products=[];
    }
    addProductToCart(product:Product):void{
        this.products.push(product);
        console.log("Product Added to the cart");
    }
    removeProductFromCart(id):void{
        this.products= this.products.
        filter((item)=>item.id!=id);
        console.log("Product Removed");
    }
    totalAmount():number{
        let sum=0;
        for(let p of this.products){
            sum+=p.price;
        }
        return sum;

        //return this.products.reduce((acc,curr)=>acc.price+curr);
    }
    getCartDetails(){
        this.user.display();
        this.products.forEach((item)=>item.display())
    }
}