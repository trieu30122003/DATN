package com.example.datn.service;

import com.example.datn.model.Loai;
import com.example.datn.repository.LoaiRepository;

import java.util.ArrayList;
import java.util.List;

public interface LoaiService {
    ArrayList<Loai> getAll();
}
