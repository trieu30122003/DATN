package com.example.datn.repository;

import com.example.datn.model.Loai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoaiRepository extends JpaRepository<Loai, UUID> {
}
