import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../models/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseURL:string= "http://localhost:3000/products";
  constructor(private http:HttpClient) { }

  getAllProducts():Observable<Product[]>{
    return this.http.get<Product[]>(this.baseURL);
  }
  getProductById(id:number):Observable<Product>{
    return this.http.get<Product>(this.baseURL+"/"+id)
  }
  addProduct(product:Product){
    //console.log(product);
    return this.http.post(this.baseURL,product);
    //POst API call for creating new Record
  }
  editProduct(product:Product,id:number){
    return this.http.put(this.baseURL+"/"+id,product)
    //update the perticular Id with Given Product Object
  }
  deleteById(id:number){
    return this.http.delete(this.baseURL+"/"+id);
  }
}
