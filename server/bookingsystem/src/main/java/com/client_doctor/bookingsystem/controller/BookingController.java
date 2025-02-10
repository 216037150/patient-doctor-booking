package com.client_doctor.bookingsystem.controller;

import com.client_doctor.bookingsystem.model.Booking;
import com.client_doctor.bookingsystem.repository.BookingRepository;
import com.client_doctor.bookingsystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PutMapping("/cancel/{id}")
    public Booking cancelBooking(@PathVariable Long id) {
        return bookingService.cancelBooking(id);  // Delegate to service
    }

    @GetMapping("/upcoming")
    public List<Booking> getUpcomingBookings() {
        return bookingService.getUpcomingBookings();  // Delegate to service
    }

    @GetMapping("/completed")
    public List<Booking> getCompletedBookings() {
        return bookingService.getCompletedBookings();  // Delegate to service
    }

    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();  // Delegate to service
    }
}
