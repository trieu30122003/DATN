package com.example.datn.service;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.model.SanPhamCt;

import java.util.ArrayList;
import java.util.UUID;

public interface DayDeoService {
    ArrayList<DayDeo> getAll();
    void delete(UUID id);
    DayDeo add(DayDeo dayDeo);
    DayDeo detail(UUID id);
}
