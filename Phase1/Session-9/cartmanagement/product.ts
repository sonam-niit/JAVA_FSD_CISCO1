export class Product {
    id: number;
    name1: string;
    price: number;

    constructor(id: number, name1: string, price: number) {
        this.id = id;
        this.name1 = name1;
        this.price = price;
    }

    display(): void {
        console.log(`Details:${this.id} - ${this.name1} - ${this.price}`);
    }
}