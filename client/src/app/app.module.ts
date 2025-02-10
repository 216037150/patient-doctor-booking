import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// Don't declare the components here. Only import AppComponent.
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [],
  imports: [
    BrowserModule,
    AppComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
