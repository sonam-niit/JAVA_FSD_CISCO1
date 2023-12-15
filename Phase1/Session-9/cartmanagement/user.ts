export class User {
    private id: number;
    private name1: string;
    private email: string;

    constructor(id: number, name1: string, email: string) {
        this.id = id;
        this.name1 = name1;
        this.email = email;
    }

    display(): void {
        console.log(`Name: ${this.name1}`);
        console.log(`Id: ${this.id}`);
        console.log(`Email: ${this.email}`);
    }
}