import { Component, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  inputs:['pdata'],
  outputs:['cevent']
})
export class ChildComponent {

  pdata:string="";
  //Event emitter object for emitting event
  cevent:EventEmitter<string>= new EventEmitter<string>();
  
  //function
  onchange(value:string){
    this.cevent.emit(value); //emit the received value
  }
}
