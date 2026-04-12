package com.example.clinica_backend.model.entity;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Doctor {

    @Id
    private UUID id;

    @Column(name = "specialty", length = 200)
    private String specialty;

    @OneToOne
    @MapsId // Usa el mismo ID de Person
    @JoinColumn(name = "id") // FK hacia persons(id)
    private Person person;

}
