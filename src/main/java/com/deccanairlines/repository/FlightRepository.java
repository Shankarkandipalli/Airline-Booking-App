package com.deccanairlines.repository;

import com.deccanairlines.entity.Airport;
import com.deccanairlines.entity.Flight;
import com.deccanairlines.enums.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    boolean existsByFlightNumber(String flightNumber);

    List<Flight> findByDepartureAirportCodeAndArrivalAirportCodeAndStatusAndDepartureTimeBetween(
            String departureAirportCode,
            String arrivalAirportCode,
            FlightStatus status,
            LocalDateTime startDateTime,
            LocalDateTime endDateTime
    );
}
