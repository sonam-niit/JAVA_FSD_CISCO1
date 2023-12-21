import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {

  name:string="Welcome Sonam Soni";
  pi:number=3.1415927;
  today:Date=new Date();
  num1:number=23445.12345;
  num2:number=0.123456789;
  jsonObject={id:1,name:"alex",email:'alex@gmail.com'}
  message:string='Welcome to the World of Angular'
}
