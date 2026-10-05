package com.deccanairlines.entity;

import com.deccanairlines.enums.FlightStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String flightNumber;

    @Enumerated(EnumType.STRING)
    private FlightStatus status;

    @ManyToOne()
    @JoinColumn(name = "departure_airport_id", referencedColumnName = "id")
    private Airport departureAirport;
    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", referencedColumnName = "id")
    private Airport arrivalAirport;


    private LocalDateTime departureTime = LocalDateTime.now();

    private LocalDateTime arrivalTime = LocalDateTime.now();


    @Column(nullable = false)
    private BigDecimal basePrice;

    @ManyToOne
    private User AssignedPilot;

    @OneToMany(mappedBy = "flight")
    private List<Booking> bookings = new ArrayList<>();


}
