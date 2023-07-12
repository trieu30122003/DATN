package com.example.datn.service;

import com.example.datn.model.SanPhamCt;

import java.util.ArrayList;
import java.util.UUID;

public interface ChiTietSanPhamService {
    ArrayList<SanPhamCt> getAll();
    void delete(UUID id);
    void add(SanPhamCt spct);
    SanPhamCt detail(UUID id);
}
