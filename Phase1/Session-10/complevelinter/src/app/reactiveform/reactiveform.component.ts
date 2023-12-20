import { Component, EventEmitter, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.css']
})
export class ReactiveformComponent {

  @Output()
  userAdded= new EventEmitter();

  user:any={firstname:'',lastname:'',email:'',password:''};
  registerForm : FormGroup;
  submitted:boolean=false;

  constructor(private builder:FormBuilder){}

  ngOnInit(){
    this.registerForm= this.builder.group({
      firstname:['',Validators.required],
      lastname:['',Validators.required],
      email:['',[Validators.required,Validators.email]],
      password:['',[Validators.required,Validators.minLength(8)]]
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
    this.userAdded.emit(this.user);
    this.user={firstname:'',lastname:'',email:'',password:''};
    this.submitted=false;
  }
}
