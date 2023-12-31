package com.example.datn.service.impl;

import com.example.datn.model.KhachHang;
import com.example.datn.model.NhanVien;
import com.example.datn.repository.KhachHangRepository;
import com.example.datn.repository.NhanVienRepository;
import com.example.datn.service.KhachHangService;
import com.example.datn.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    NhanVienRepository  nhanVienRepository;
    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien add(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }


    @Override
    public NhanVien getOne(UUID id) throws Exception {
        return nhanVienRepository.findById(id).orElseThrow(() -> new Exception("id not found"));
    }

    @Override
    public void delete(UUID id) {
        nhanVienRepository.deleteById(id);
    }
}
