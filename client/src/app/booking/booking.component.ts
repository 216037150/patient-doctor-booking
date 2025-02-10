import { Component } from '@angular/core';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css'],
})
export class BookingComponent {
  booking = { name: '', email: '', phone: '', date: '', time: '' };

  constructor(private bookingService: BookingService) { }

  submitBooking() {
    this.bookingService.createBooking(this.booking).subscribe(
      (response) => {
        alert('Booking successful!');
      },
      (error) => {
        alert('An error occurred while making the booking.');
        console.error('Booking error:', error);
      }
    );
  }
}
