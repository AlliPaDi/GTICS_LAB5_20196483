package com.example.gtics_lab5_20196483.repository;


import com.example.gtics_lab5_20196483.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Integer> {

}

