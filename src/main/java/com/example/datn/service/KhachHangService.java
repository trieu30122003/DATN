package com.example.datn.service;

import com.example.datn.model.KhachHang;


import java.util.List;
import java.util.UUID;

public interface KhachHangService {
    List<KhachHang> getAll();
    void add(KhachHang khachHang);
    KhachHang getOne(UUID id);
    void delete(UUID id);
}
