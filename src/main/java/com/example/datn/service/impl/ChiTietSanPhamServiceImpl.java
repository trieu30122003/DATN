package com.example.datn.service.impl;

import com.example.datn.model.SanPhamCt;
import com.example.datn.repository.ChitietSanPhamRepository;
import com.example.datn.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {
    @Autowired
    ChitietSanPhamRepository chitietSanPhamRepository;
    @Override
    public ArrayList<SanPhamCt> getAll() {
        return (ArrayList<SanPhamCt>) chitietSanPhamRepository.findAll();
    }
}