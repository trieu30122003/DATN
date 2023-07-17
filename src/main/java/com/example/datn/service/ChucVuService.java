package com.example.datn.service;

import com.example.datn.model.ChucVu;
import com.example.datn.model.Loai;
import com.example.datn.model.NhanVien;

import java.util.ArrayList;
import java.util.UUID;

public interface ChucVuService {
    ArrayList<ChucVu> getAll();

    ChucVu add(ChucVu chucVu);

    ChucVu getOne(UUID id);

    void delete(UUID id);
}
