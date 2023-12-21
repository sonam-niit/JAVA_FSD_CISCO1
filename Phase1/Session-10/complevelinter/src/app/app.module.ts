import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { ProductsComponent } from './products/products.component';
import { TwowayComponent } from './twoway/twoway.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TemplatedrivenformComponent } from './templatedrivenform/templatedrivenform.component';
import { HighlightDirective } from './CustomerCodes/HighlightDirective';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserdetailsComponent } from './userdetails/userdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    ProductsComponent,
    TwowayComponent,
    TemplatedrivenformComponent,
    HighlightDirective,
    ReactiveformComponent,
    UserListComponent,
    UserdetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
