package com.example.datn.service;

import com.example.datn.model.KhachHang;
import com.example.datn.model.LichSuHoaDon;

import java.util.List;
import java.util.UUID;

public interface LichSuHoaDonService {
    List<LichSuHoaDon> getAll();
    LichSuHoaDon add(LichSuHoaDon lichsuhoadon);
    LichSuHoaDon getOne(UUID id);
    void delete(UUID id);
}
