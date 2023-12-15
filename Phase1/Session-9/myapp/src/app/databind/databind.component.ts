import { Component } from '@angular/core';

@Component({
  selector: 'app-databind',
  templateUrl: './databind.component.html',
  styleUrls: ['./databind.component.css']
})
export class DatabindComponent {
    name:string = "Sonam Soni";
    url:string="https://www.google.com";
    imgURL:string="https://img.freepik.com/premium-vector/pencil-cartoon-style-vector-illustration_484148-216.jpg";
    logoUrl:string='../assets/images/logo.jpg';
    flag:boolean=false;
    clickMe():void{
        this.flag=!this.flag
        alert("Clicked")
    }
}
