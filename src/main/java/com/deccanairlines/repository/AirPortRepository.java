package com.deccanairlines.repository;

import com.deccanairlines.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AirPortRepository extends JpaRepository<Airport, Long> {

    Optional<Airport> findByCode(String code);

}
