package com.example.datn.repository;

import com.example.datn.model.Loai;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LoaiRepository extends JpaRepository<Loai, UUID> {
}
