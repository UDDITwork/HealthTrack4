package com.healthtrack.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "prescriptions")
public class Prescription {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;
    
    @Column(nullable = false)
    private LocalDateTime issueDate;
    
    private LocalDateTime expiryDate;
    
    @Column(nullable = false)
    private String diagnosis;
    
    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    private List<Medication> medications = new ArrayList<>();
    
    private String instructions;
    
    private String notes;
    
    @Embeddable
    @Data
    public static class Medication {
        private String name;
        private String dosage;
        private String frequency;
        private String duration;
        private String route;
        private String specialInstructions;
    }
} 