package com.example.datn.service.impl;

import com.example.datn.model.KhachHang;
import com.example.datn.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.datn.service.KhachHangService;

import java.util.List;
import java.util.UUID;

@Service
public class KhachHangServiceImpl implements KhachHangService{
    @Autowired
    KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void add(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang getOne(UUID id) {
        return khachHangRepository.findById(id).get();
    }

    @Override
    public void delete(UUID id) {
        khachHangRepository.deleteById(id);
    }
}
