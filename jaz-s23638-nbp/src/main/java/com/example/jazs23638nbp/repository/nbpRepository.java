package com.example.jazs23638nbp.repository;

import com.example.jazs23638nbp.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface nbpRepository extends JpaRepository<Entity, Long> {
}
