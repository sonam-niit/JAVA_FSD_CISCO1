export class User{

    id:number;
    firstname:string;
    lastname:string;
    email:string;
    country:string;

    constructor(id:number,firstname:string,lastname:string,email:string,country:string){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.country=country;
    }
}