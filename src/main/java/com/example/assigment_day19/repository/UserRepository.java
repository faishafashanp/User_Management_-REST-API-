package com.example.assigment_day19.repository;

import com.example.assigment_day19.model.RegisterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<RegisterModel, Long> {
}

