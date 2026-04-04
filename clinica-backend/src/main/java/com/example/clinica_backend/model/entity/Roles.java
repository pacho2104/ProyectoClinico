package com.example.clinica_backend.model.entity;

import jakarta.persistence.*;
import java.util.UUID;

import java.time.LocalDateTime;

@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // Auditoria o Doft Delete:
    @Column(name = "role_name", length = 50, nullable = false)
    private String roleName;

    // Trazabilidad
    @Column(name="create_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_by", nullable = false)
    private UUID createdBy;

    // Auditoria
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "update_by")
    private UUID updateBy;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "deleted_by")
    private UUID deletedBy;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}
