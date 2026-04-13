package com.example.clinica_backend.dto.response.patient;

import com.example.clinica_backend.model.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponse {

    private UUID id;
    private Person person;

}
