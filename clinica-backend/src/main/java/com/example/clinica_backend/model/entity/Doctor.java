package com.example.clinica_backend.model.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;


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
