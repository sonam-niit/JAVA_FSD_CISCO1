export interface User{
    id:number;
    name:string;
    username:string;
    email:string;
    address:Address;
    company:Company;
    phone:string;
    website:string;
}
interface Address{
    street:string;
    suite:string;
    city:string;
    zipcode:string;
}
interface Company{
    name:string;
    catchPhrase:string;
    bs:string;
}