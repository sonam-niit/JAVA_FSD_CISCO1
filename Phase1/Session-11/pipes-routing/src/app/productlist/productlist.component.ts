import { Component } from '@angular/core';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent {

  products=[
    {id:1,name:'Pencil',price:10},
    {id:2,name:'Pen',price:20},
    {id:3,name:'Scale',price:25},
    {id:4,name:'Eraser Set of 3',price:35}
  ]
}
