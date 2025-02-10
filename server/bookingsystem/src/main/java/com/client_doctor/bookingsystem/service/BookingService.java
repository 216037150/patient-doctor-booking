package com.client_doctor.bookingsystem.service;

import com.client_doctor.bookingsystem.model.Booking;
import com.client_doctor.bookingsystem.repository.BookingRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;


    public Booking cancelBooking(Long id) {
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Booking not found"));
        booking.cancelBooking();
        return bookingRepository.save(booking);
    }


    public List<Booking> getUpcomingBookings() {
        return bookingRepository.findByStatus("upcoming");
    }


    public List<Booking> getCompletedBookings() {
        return bookingRepository.findByStatus("completed");
    }


    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}

