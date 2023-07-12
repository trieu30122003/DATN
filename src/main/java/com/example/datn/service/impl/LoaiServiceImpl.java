package com.example.datn.service.impl;

import com.example.datn.model.Loai;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.service.LoaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LoaiServiceImpl implements LoaiService {
    @Autowired
    LoaiRepository loaiRepository;
    @Override
    public ArrayList<Loai> getAll() {
        return (ArrayList<Loai>) loaiRepository.findAll();
    }
}
