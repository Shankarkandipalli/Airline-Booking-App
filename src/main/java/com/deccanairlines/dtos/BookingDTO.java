package com.deccanairlines.dtos;

import com.deccanairlines.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingDTO {

    private Long id;
    private String bookingReference;
    private FlightDTO flight;
    private UserDTO user;
    private LocalDateTime createdAt;
    private BookingStatus status;
    private List<PassengerDTO> passengers;
}
