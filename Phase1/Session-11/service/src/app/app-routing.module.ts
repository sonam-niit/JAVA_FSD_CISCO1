import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserformComponent } from './users/userform/userform.component';
import { ListComponent } from './users/list/list.component';
import { UserdetailComponent } from './users/userdetail/userdetail.component';

const routes: Routes = [
  {path:'adduser',component:UserformComponent},
  {path:'showusers',component:ListComponent},
  {path:'showusers/details/:id',component:UserdetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
