package com.example.datn.repository;

import com.example.datn.model.HoaDonCt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface HoaDonChiTietRepository extends JpaRepository<HoaDonCt, UUID> {
HoaDonCt findAllByid(UUID id);
}
