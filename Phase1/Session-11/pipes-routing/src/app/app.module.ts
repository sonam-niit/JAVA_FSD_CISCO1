import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PipesComponent } from './pipes/pipes.component';
import { AllSpaceConversion } from './CustomPipes/AllSpaceConversion';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AboutComponent } from './abouts/about/about.component';
import { HistoryComponent } from './abouts/history/history.component';
import { FinanceComponent } from './abouts/finance/finance.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { ProductdetailComponent } from './productdetail/productdetail.component';




@NgModule({
  declarations: [
    AppComponent,
    PipesComponent,
    AllSpaceConversion,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    PagenotfoundComponent,
    AboutComponent,
    HistoryComponent,
    FinanceComponent,
    ProductlistComponent,
    ProductdetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
