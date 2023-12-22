import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from 'src/app/models/user.model';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-userdetails',
  templateUrl: './userdetails.component.html',
  styleUrls: ['./userdetails.component.css']
})
export class UserdetailsComponent {

  user:User; 

  constructor(private service:UserService,private route:ActivatedRoute){}
  ngOnInit(){
    const id=Number(this.route.snapshot.paramMap.get('id'));
    this.service.getUserById(id).subscribe(ob=>this.user=ob);
    console.log(this.user);
    
  }
}
