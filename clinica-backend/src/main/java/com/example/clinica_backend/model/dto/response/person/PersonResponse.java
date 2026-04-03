package com.example.clinica_backend.model.dto.response.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonResponse {

    private UUID id;
    private String documentType;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String sex;
    private LocalDate birthDay;
    private String phoneNumber;
    private String address;
    private String  email;

}
