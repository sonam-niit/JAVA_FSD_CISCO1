import { Component } from '@angular/core';

@Component({
  selector: 'app-templatedrivenform',
  templateUrl: './templatedrivenform.component.html',
  styleUrls: ['./templatedrivenform.component.css']
})
export class TemplatedrivenformComponent {

  user={email:'',password:''}

  handler(){
    
    //submission Logic
    alert(`Form Submitted ${this.user.email} ${this.user.password}`)
    //Later you can pass these values to server
  }
}
