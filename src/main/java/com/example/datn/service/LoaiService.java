package com.example.datn.service;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.repository.LoaiRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface LoaiService {
    ArrayList<Loai> getAll();
    void delete(UUID id);
    Loai add(Loai loai);
    Loai detail(UUID id);
}
