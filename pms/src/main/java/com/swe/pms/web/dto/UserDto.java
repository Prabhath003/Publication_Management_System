package com.swe.pms.web.dto;

public class UserDto {
    private Long id;
    private String username;
    private String email;

    public UserDto() {

    }

    public UserDto(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    // Getter and setters (consider immutability for security)
}
