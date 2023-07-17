package com.example.datn.service;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.model.SanPham;

import java.util.ArrayList;
import java.util.UUID;

public interface SanPhamService {
    ArrayList<SanPham> getAll();
    void delete(UUID id);
    SanPham add(SanPham sanPham);
    SanPham detail(UUID id);
}
