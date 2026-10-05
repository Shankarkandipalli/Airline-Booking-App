package com.deccanairlines.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public enum City {

    DELHI(Country.INDIA),

    CHENNAI(Country.INDIA),

    MIAMI(Country.USA),

    DALLAS(Country.USA),

    LONDON(Country.UK),

    LEEDS(Country.UK),

    ZURICH(Country.SWITZERLAND),

    GENEVA(Country.SWITZERLAND);


    private final Country country;

    City(Country country) {
        this.country = country;
    }
}
