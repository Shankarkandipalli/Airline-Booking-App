package com.deccanairlines.dtos;

import com.deccanairlines.entity.Airport;
import com.deccanairlines.entity.User;
import com.deccanairlines.enums.FlightStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightDTO {

    private Long id;

    private String flightNumber;

    private FlightStatus status;

    private AirportDTO departureAirport;

    private AirportDTO arrivalAirport;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;

    private UserDTO AssignedPilot;

    private List<BookingDTO> bookings;

    private String departureAirportCode;

    private String arrivalAirportCode;


}
