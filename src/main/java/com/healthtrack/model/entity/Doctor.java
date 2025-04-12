package com.healthtrack.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "doctors")
@EqualsAndHashCode(callSuper = true)
public class Doctor extends User {
    
    @Column(nullable = false)
    private String specialization;
    
    @Column(nullable = false)
    private String licenseNumber;
    
    private String department;
    
    private String qualifications;
    
    private Integer yearsOfExperience;
    
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments = new ArrayList<>();
    
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Prescription> prescriptions = new ArrayList<>();
    
    @PrePersist
    public void prePersist() {
        this.role = Role.ROLE_DOCTOR;
    }
} 