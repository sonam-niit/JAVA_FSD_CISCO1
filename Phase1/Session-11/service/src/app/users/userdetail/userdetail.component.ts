import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/models/users';

@Component({
  selector: 'app-userdetail',
  templateUrl: './userdetail.component.html',
  styleUrls: ['./userdetail.component.css']
})
export class UserdetailComponent {

  user:User;
  constructor(private route:ActivatedRoute, private uservice:UserService){}

  ngOnInit(){
    const id= this.route.snapshot.paramMap.get('id');
    const data=this.uservice.getUserById(Number(id)) ;
    if(data!=undefined){
      this.user=data;
    }
  }
}
