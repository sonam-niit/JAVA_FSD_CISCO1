class User {
    private _id: number;
    private _name1: string;
    private _email: string;

    constructor(id: number, name1: string, email: string) {
        this._id = id;
        this._name1 = name1;
        this._email = email;
    }
    set id(id:number){
        this._id=id;
    }
    get id(): number {
        return this._id;
    }
    set name1(name1:string){
        this._name1=name1;
    }
    get name1(): string {
        return this._name1;
    }
    get email(): string {
        return this._email;
    }
    display(): void {
        console.log(`Name: ${this.name1}`);
        console.log(`Id: ${this.id}`);
        console.log(`Email: ${this.email}`);
    }
}

let u1: User = new User(1, 'Alex', 'alex@gmail.com');
let u2: User = new User(2, 'Bob', 'bob@gmail.com');
u1.display();
u2.display();
console.log(`User2 Email: ${u2.email}`);
u2.name1="Sonam Soni"; //call setter method
console.log(`User2 Name: ${u2.name1}`); //calling setter method


