import { Component } from '@angular/core';
import { Product } from '../modals/Product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {

  textColor:string='red';
  fontSize:number=20;
  userRole:string="admin";
  isInStock:boolean=true;

  showProducts:boolean=true;

  products:Product[]=[
    new Product(101,"Adidas Shoe",3000,4.5),
    new Product(201,"Samsung LED TV",30400,4.8),
    new Product(305,"Amul Milk 500ml",20,4.9),
    new Product(501,"BOAT Headphone",899,4.3),
    new Product(601,"Samsung Fold",73000,4.1),
  ]
}
