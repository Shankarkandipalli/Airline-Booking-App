package com.deccanairlines.repository;

import com.deccanairlines.entity.EmailNotification;
import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailNotification, Long> {
}
