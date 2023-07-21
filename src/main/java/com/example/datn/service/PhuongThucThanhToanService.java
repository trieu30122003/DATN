package com.example.datn.service;

import com.example.datn.model.KhachHang;
import com.example.datn.model.PhuongThucThanhToan;

import java.util.List;
import java.util.UUID;

public interface PhuongThucThanhToanService {
    List<PhuongThucThanhToan> getAll();
    PhuongThucThanhToan add(PhuongThucThanhToan phuongThucThanhToan);
    PhuongThucThanhToan getOne(UUID id);
    void delete(UUID id);
}
