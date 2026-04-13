package com.example.clinica_backend.dto.request.Doctor;

import com.example.clinica_backend.model.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequest {

    private String specialty;
    private Person person;

}
