package com.deccanairlines.dtos;

import com.deccanairlines.enums.BookingStatus;
import com.deccanairlines.enums.PassengerType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PassengerDTO {

    private Long id;

    private BookingDTO booking;
    @NotBlank(message = "firstName reference is required")
    private String firstName;
    @NotBlank(message = "lastName reference is required")
    private String lastName;
    @NotBlank(message = "passportNumber reference is required")
    private String passportNumber;

    @NotBlank(message = "email reference is required")
    private String email;

    @NotBlank(message = "passengerType reference is required")
    private PassengerType passengerType;

    @NotBlank(message = "seatNumber reference is required")
    private String seatNumber;

    private String specialRequests;
}
