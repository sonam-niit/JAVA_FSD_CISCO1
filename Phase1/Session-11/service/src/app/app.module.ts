import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserService } from './services/user.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserformComponent } from './users/userform/userform.component';
import { ListComponent } from './users/list/list.component';
import { UserdetailComponent } from './users/userdetail/userdetail.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    UserformComponent,
    UserdetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
