package com.example.datn.service.impl;

import com.example.datn.model.HoaDon;
import com.example.datn.repository.HoaDonRepository;
import com.example.datn.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    HoaDonRepository hoaDonRepository;
    @Override
    public ArrayList<HoaDon> getAll() {
        return (ArrayList<HoaDon>) hoaDonRepository.findAll();
    }
}
