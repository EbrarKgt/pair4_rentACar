package com.example.pair4.repositories;

import com.example.pair4.entities.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementRepository extends JpaRepository<Requirement, Integer> {
}
