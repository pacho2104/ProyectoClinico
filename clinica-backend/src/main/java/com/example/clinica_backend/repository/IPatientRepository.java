package com.example.clinica_backend.repository;

import com.example.clinica_backend.model.entity.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IPatientRepository extends CrudRepository<Patient,UUID> {
}
