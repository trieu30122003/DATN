package com.example.datn.service.impl;

import com.example.datn.model.SanPham;
import com.example.datn.repository.SanPhamRepository;
import com.example.datn.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SanPhamServiceIpml implements SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;
    @Override
    public ArrayList<SanPham> getAll() {
        return (ArrayList<SanPham>) sanPhamRepository.findAll();
    }
}
