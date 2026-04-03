package com.example.clinica_backend.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {


    private UUID ID;
}
