package com.example.datn.repository;

import com.example.datn.model.Nsx;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NSXRepository extends JpaRepository<Nsx, UUID> {
}
