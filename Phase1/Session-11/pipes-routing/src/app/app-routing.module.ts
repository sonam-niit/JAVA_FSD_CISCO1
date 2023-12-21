import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PipesComponent } from './pipes/pipes.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AboutComponent } from './abouts/about/about.component';
import { HistoryComponent } from './abouts/history/history.component';
import { FinanceComponent } from './abouts/finance/finance.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { ProductdetailComponent } from './productdetail/productdetail.component';

const routes: Routes = [
  {path:"pipes",component:PipesComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'about',component:AboutComponent,children:[
    {path:'history',component:HistoryComponent},
    {path:'finance',component:FinanceComponent}
  ]},
  {path:'products',component:ProductlistComponent},
  {path:'products/details/:id',component:ProductdetailComponent},
  {path:'**',component:PagenotfoundComponent} //Always keep this route at last
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
