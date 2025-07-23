package com.solar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Queries {
    private String firstName;
    private String lastName;
    private String connectionType;
    private String phoneNumber;
    private String email;
    private String country;
    private String city;
    private String message;
}
