package com.example.datn.repository;

import com.example.datn.model.SanPhamCt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChitietSanPhamRepository extends JpaRepository<SanPhamCt, UUID> {
}
