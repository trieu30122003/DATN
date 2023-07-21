package com.example.datn.service.impl;

import com.example.datn.model.PhuongThucThanhToan;
import com.example.datn.repository.PhuongThucThanhToanRepository;
import com.example.datn.service.PhuongThucThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PhuongThucThanhToanServiceImp implements PhuongThucThanhToanService {
    @Autowired
    PhuongThucThanhToanRepository phuongThucThanhToanRepository;
    @Override
    public List<PhuongThucThanhToan> getAll() {
        return phuongThucThanhToanRepository.findAll();
    }

    @Override
    public PhuongThucThanhToan add(PhuongThucThanhToan phuongThucThanhToan) {
        return phuongThucThanhToanRepository.save(phuongThucThanhToan);
    }

    @Override
    public PhuongThucThanhToan getOne(UUID id) {
        return phuongThucThanhToanRepository.findById(id).get();
    }

    @Override
    public void delete(UUID id) {
        phuongThucThanhToanRepository.deleteById(id);
    }
}
