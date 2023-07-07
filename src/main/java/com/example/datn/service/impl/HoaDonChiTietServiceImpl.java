package com.example.datn.service.impl;

import com.example.datn.model.HoaDonCt;
import com.example.datn.repository.HoaDonChiTietRepository;
import com.example.datn.service.HoaDonChitietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
@Service
public class HoaDonChiTietServiceImpl implements HoaDonChitietService {
    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;
    @Override
    public ArrayList<HoaDonCt> getAll() {
        return (ArrayList<HoaDonCt>) hoaDonChiTietRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        hoaDonChiTietRepository.deleteById(id);
    }

    @Override
    public void add(HoaDonCt hdct) {
        hoaDonChiTietRepository.save(hdct);
    }

    @Override
    public HoaDonCt detail(UUID id) {
        return hoaDonChiTietRepository.findAllByid(id);
    }
}
