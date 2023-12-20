export class Product{
    pid:number;
    name:string;
    price:number;
    rating:number;

    constructor(pid:number,name:string,price:number,rating:number){
        this.pid=pid;
        this.name=name;
        this.price=price;
        this.rating=rating;
    }

    showProducts(){
        console.log(this.pid+" "+this.name+" "+this.price);
        
    }
}