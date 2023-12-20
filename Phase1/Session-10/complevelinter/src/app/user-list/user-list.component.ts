import { Component } from '@angular/core';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent {

  users:any[]=[
    {id:12345678,firstname:"sonam",lastname:"soni",email:"sonam@gmail.com",password:'123456'}
  ];

  onUserAdded(user:any){
    user.id=Date.now();
    this.users.push(user);
  }

  deleteUser(id:number){
    this.users= this.users.filter((item)=>item.id!=id);
  }
}
