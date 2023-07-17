package com.example.datn.repository;

import com.example.datn.model.ChucVu;
import com.example.datn.model.Loai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, UUID> {
}
