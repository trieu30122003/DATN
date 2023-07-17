package com.example.datn.service.impl;

import com.example.datn.model.ChucVu;
import com.example.datn.model.Loai;
import com.example.datn.repository.ChucVuRepository;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.service.ChucVuService;
import com.example.datn.service.LoaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    ChucVuRepository chucVuRepository;

    @Override
    public ArrayList<ChucVu> getAll() {
        return (ArrayList<ChucVu>) chucVuRepository.findAll();
    }

    @Override
    public ChucVu add(ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }

    @Override
    public ChucVu getOne(UUID id) {
        return chucVuRepository.findById(id).get();
    }

    @Override
    public void delete(UUID id) {
        chucVuRepository.deleteById(id);
    }
}
