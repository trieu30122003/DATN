package com.example.datn.repository;

import com.example.datn.model.DayDeo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DayDeoRepository extends JpaRepository<DayDeo, UUID> {
}
