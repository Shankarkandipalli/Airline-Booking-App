package com.deccanairlines.dtos;

import lombok.Data;

@Data
public class LoginResponse {

    private String token;
    private String username;
    private String role;

}
