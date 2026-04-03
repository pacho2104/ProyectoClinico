package com.example.clinica_backend.model.dto.request.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonUpdateRequest {

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
