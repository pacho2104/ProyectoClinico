package com.example.clinica_backend.model.entity;

import jakarta.persistence.*;
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
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "document_type", length = 40, nullable = true)
    private String documentType;

    @Column(name = "document_number",length = 40, nullable = true)
    private String documentNumber;

    @Column(name = "first_name",length = 200, nullable = false)
    private String firstName;

    @Column(name = "last_name",length = 200, nullable = false)
    private String lastName;

    @Column(name = "sex",length = 10, nullable = true)
    private String sex;

    @Column(name = "birth_day")
    private LocalDate birthDay;

    @Column(name = "phone_number", length = 20,  nullable = true)
    private String phoneNumber;

    @Column(name = "address", length = 200,  nullable = true)
    private String address;

    @Column(name = "email", length = 200, nullable = true)
    private String email;

    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @Column(name = "created_by", nullable = false)
    private UUID createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private UUID updatedBy;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "deleted_by")
    private UUID deletedBy;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

}
