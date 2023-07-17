package com.example.datn.service.impl;

import com.example.datn.model.SanPhamCt;
import com.example.datn.repository.ChitietSanPhamRepository;
import com.example.datn.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {
    @Autowired
    ChitietSanPhamRepository chitietSanPhamRepository;
    @Override
    public ArrayList<SanPhamCt> getAll() {
        return (ArrayList<SanPhamCt>) chitietSanPhamRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        chitietSanPhamRepository.deleteById(id);
    }

    @Override
    public SanPhamCt add(SanPhamCt spct) {
        return chitietSanPhamRepository.save(spct);
    }

    @Override
    public SanPhamCt detail(UUID id) {
        return null;
    }
}
