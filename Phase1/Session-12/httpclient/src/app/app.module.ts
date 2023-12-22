import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserlistComponent } from './users/userlist/userlist.component';
import { UserdetailsComponent } from './users/userdetails/userdetails.component';
import { ProductlistComponent } from './products/productlist/productlist.component';
import { ProductformComponent } from './products/productform/productform.component';
import { FormsModule } from '@angular/forms';
import { ProducteditComponent } from './products/productedit/productedit.component';

@NgModule({
  declarations: [
    AppComponent,
    UserlistComponent,
    UserdetailsComponent,
    ProductlistComponent,
    ProductformComponent,
    ProducteditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
