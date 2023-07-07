package com.example.datn.service;

import com.example.datn.model.HoaDonCt;

import java.util.ArrayList;
import java.util.UUID;

public interface HoaDonChitietService {
    ArrayList<HoaDonCt>getAll();
    void delete(UUID id);
    void add(HoaDonCt hdct);
    HoaDonCt detail(UUID id);

}
