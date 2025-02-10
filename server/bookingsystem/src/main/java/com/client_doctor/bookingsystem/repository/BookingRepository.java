package com.client_doctor.bookingsystem.repository;

import com.client_doctor.bookingsystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByStatus(String status);
}
