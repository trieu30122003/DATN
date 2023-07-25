package com.example.datn.service.impl;

import com.example.datn.model.Loai;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.service.LoaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class LoaiServiceImpl implements LoaiService {
    @Autowired
    LoaiRepository loaiRepository;
    @Override
    public ArrayList<Loai> getAll() {
        return (ArrayList<Loai>) loaiRepository.findAll();
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Loai add(Loai loai) {
        return loaiRepository.save(loai);
    }

    @Override
    public Loai detail(UUID id) {
        return null;
    }
}
