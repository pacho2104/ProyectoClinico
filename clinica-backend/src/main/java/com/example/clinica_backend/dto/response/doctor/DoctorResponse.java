package com.example.clinica_backend.dto.response.doctor;

import com.example.clinica_backend.model.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorResponse {

    private UUID id;
    private String specialty;
    private Person person;

}
