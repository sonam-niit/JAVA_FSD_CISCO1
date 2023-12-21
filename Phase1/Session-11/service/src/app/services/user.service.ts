import { Injectable } from '@angular/core';
import { User } from 'src/models/users';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  users:User[]=[];//Empty User Array

  constructor() { }

  addUser(user:User){
    user.id=Date.now();
    this.users.push(user);
  }
  getAllUsers():User[]{
    return this.users;
  }
  getUserById(id:number): User | undefined{
    return this.users.find((item)=>item.id===id);
  }
  deleteUser(id:number){
    this.users=this.users.filter((item)=>item.id!==id);
  }
}
