package com.example.datn.repository;

import com.example.datn.model.Serial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SerialRepository extends JpaRepository<Serial, UUID> {
}
