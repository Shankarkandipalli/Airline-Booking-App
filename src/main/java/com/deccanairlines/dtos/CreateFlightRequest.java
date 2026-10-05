package com.deccanairlines.dtos;

import com.deccanairlines.enums.FlightStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CreateFlightRequest {

    private Long id;

    private FlightStatus status;

    @NotBlank(message = "Flight number is required")
    private String flightNumber;

    @NotNull(message = "Departure airport IATA code is required")
    private String departureAirportIataCode;


    @NotNull(message = "Arrival airport IATA code is required")
    private String arrivalAirportIataCode;

    @NotNull(message = "Departure date and time is required")
    private LocalDateTime departureDateTime;

    @NotNull(message = "Arrival date and time is required")
    private LocalDateTime arrivalDateTime;

    @NotNull(message = "Price is required")
    private BigDecimal price;

    private Long pilotId;






}
