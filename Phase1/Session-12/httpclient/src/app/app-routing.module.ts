import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserdetailsComponent } from './users/userdetails/userdetails.component';
import { UserlistComponent } from './users/userlist/userlist.component';
import { ProductlistComponent } from './products/productlist/productlist.component';
import { ProductformComponent } from './products/productform/productform.component';
import { ProducteditComponent } from './products/productedit/productedit.component';

const routes: Routes = [
  {path:"userlist",component:UserlistComponent},
  {path:"userlist/details/:id",component:UserdetailsComponent},
  {path:'productlist',component:ProductlistComponent},
  {path:'productform',component:ProductformComponent},
  {path:'productlist/editproduct/:id',component:ProducteditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
