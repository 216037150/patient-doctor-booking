import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-booking',
  standalone: true,
  imports: [FormsModule, HttpClientModule],
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent {
  booking = { name: '', email: '', phone: '', date: '', time: '' };

  constructor(private bookingService: BookingService) { }

  submitBooking() {
    this.bookingService.createBooking(this.booking).subscribe(response => {
      alert('Booking successful!');
    });
  }
}
