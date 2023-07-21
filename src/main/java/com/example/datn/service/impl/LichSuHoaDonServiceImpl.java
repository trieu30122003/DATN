package com.example.datn.service.impl;

import com.example.datn.model.LichSuHoaDon;
import com.example.datn.repository.LichSuHoaDonRepository;
import com.example.datn.service.LichSuHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LichSuHoaDonServiceImpl implements LichSuHoaDonService {
    @Autowired
    LichSuHoaDonRepository lichSuHoaDonRepository;
    @Override
    public List<LichSuHoaDon> getAll() {
        return lichSuHoaDonRepository.findAll();
    }

    @Override
    public LichSuHoaDon add(LichSuHoaDon lichsuhoadon) {
        return lichSuHoaDonRepository.save(lichsuhoadon);
    }

    @Override
    public LichSuHoaDon getOne(UUID id) {
        return lichSuHoaDonRepository.findById(id).get();
    }

    @Override
    public void delete(UUID id) {
        lichSuHoaDonRepository.deleteById(id);
    }
}
