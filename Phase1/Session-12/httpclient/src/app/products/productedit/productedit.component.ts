import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from 'src/app/models/product.model';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-productedit',
  templateUrl: './productedit.component.html',
  styleUrls: ['./productedit.component.css']
})
export class ProducteditComponent {

  id:number;
  product:Product;
  constructor(private service:ProductService,private route:ActivatedRoute,
    private router:Router){}

  ngOnInit(){
     this.id= Number(this.route.snapshot.paramMap.get('id'));
    this.service.getProductById(this.id).subscribe(ob=>this.product=ob);
  }
  onSubmit(){
    this.service.editProduct(this.product,this.id).subscribe((ob)=>alert("Product updated"));
    this.router.navigate(['productlist'])
  }
}
