import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/models/users';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent {

  user:User= new User(1,'','','','');
  registerForm : FormGroup;
  submitted:boolean=false;

  constructor(private builder:FormBuilder, private uservice:UserService, 
    private router:Router){}

  ngOnInit(){
    this.registerForm= this.builder.group({
      firstname:['',Validators.required],
      lastname:['',Validators.required],
      email:['',[Validators.required,Validators.email]],
      country:['',Validators.required]
    })
  }
  get form(){
    return this.registerForm.controls;
  }
  onSubmit(){
    this.submitted=true;
    if(!this.registerForm.valid)
      return;
    console.log(this.user);
    this.uservice.addUser(this.user);
    this.router.navigate(['showusers'])
  }
}
