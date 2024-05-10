package com.example.gtics_lab5_20196483.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "technician")
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technicianid")
    private int technicianID;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "age", nullable = false)
    private int age;

}
