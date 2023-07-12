package com.example.datn.repository;

import com.example.datn.model.ManHinh;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ManHinhRepository extends JpaRepository<ManHinh, UUID> {
}
