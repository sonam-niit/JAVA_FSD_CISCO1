import { Component } from '@angular/core';
import { Product } from 'src/app/models/product.model';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent {

  products:Product[];
  constructor(private service:ProductService){}
  ngOnInit(){
    this.service.getAllProducts().subscribe(ob=>this.products=ob);
  }
  delete(id:number){
    //api to delete from backedn
    this.service.deleteById(id).subscribe(()=>alert("Product Deleted"));
    this.products= this.products.filter((item)=>item.id!==id);
    //refresh products array to show a quick changes
  }
}
