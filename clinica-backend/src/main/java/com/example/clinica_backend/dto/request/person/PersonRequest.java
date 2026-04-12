package com.example.clinica_backend.dto.request.person;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PersonRequest {

    private String documentType;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String sex;
    private LocalDate birthDay;
    private String phoneNumber;
    private String address;
    private String email;
    
}
