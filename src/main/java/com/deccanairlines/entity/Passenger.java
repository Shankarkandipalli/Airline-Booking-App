package com.deccanairlines.entity;

import com.deccanairlines.enums.PassengerType;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private String firstName;
    private String lastName;
    private String passportNumber;

    private String email;

    @Enumerated(EnumType.STRING)
    private PassengerType passengerType;

    private String seatNumber;

    private String specialRequests;


}
