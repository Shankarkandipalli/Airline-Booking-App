package com.deccanairlines.dtos;

import com.deccanairlines.enums.City;
import com.deccanairlines.enums.Country;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AirportDTO {
    private Long id;

    @NotBlank(message = "Airport name is required")
    private String name;

    @NotBlank(message = "Airport code is required")
    private String ArrivalAirportIataCode;

    @NotBlank(message = "City is required")
    private City city;

    @NotBlank(message = "Country is required")
    private Country country;
}
