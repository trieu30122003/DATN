package com.example.datn.service;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.model.ManHinh;

import java.util.ArrayList;
import java.util.UUID;

public interface ManHinhService {
    ArrayList<ManHinh> getAll();
    void delete(UUID id);
    ManHinh add(ManHinh mh);
    ManHinh detail(UUID id);
}
