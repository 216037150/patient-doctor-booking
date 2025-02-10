import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { BookingComponent } from './booking/booking.component';  // Ensure the path is correct

const routes: Routes = [
  { path: '', component: AppComponent },  // Default route
  { path: 'booking', component: BookingComponent },  // Route for BookingComponent
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
