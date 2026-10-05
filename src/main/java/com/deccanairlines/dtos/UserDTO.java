package com.deccanairlines.dtos;

import com.deccanairlines.entity.Role;
import com.deccanairlines.enums.AuthMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    private String email;
    private String phoneNumber;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private boolean emailVerified;
    private AuthMethod authMethod;
    private String providerId;
    private List<Role> roles;
    private boolean active;
    private LocalDateTime creationAt;
    private LocalDateTime updatedAt;


}
