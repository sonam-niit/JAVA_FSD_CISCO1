import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-productdetail',
  templateUrl: './productdetail.component.html',
  styleUrls: ['./productdetail.component.css']
})
export class ProductdetailComponent {

  id:number=0
  constructor(private route:ActivatedRoute){}

  ngOnInit(){
    this.id=Number(this.route.snapshot.paramMap.get('id'));
  }
}
