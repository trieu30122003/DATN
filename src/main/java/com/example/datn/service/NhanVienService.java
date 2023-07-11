package com.example.datn.service;

import com.example.datn.model.KhachHang;
import com.example.datn.model.NhanVien;

import java.util.List;
import java.util.UUID;

public interface NhanVienService {
    List<NhanVien> getAll();

    NhanVien add(NhanVien nhanVien);

    NhanVien getOne(UUID id);

    void delete(UUID id);
}
