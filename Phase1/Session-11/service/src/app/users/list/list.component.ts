import { Component } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/models/users';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {

  users:User[];

  constructor(private uservice:UserService){}

  ngOnInit(){
      this.users= this.uservice.getAllUsers();
      console.log(this.users);
      
      //alert("Fetched all Users")
  }
}
