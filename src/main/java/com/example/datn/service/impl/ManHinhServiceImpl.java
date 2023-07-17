package com.example.datn.service.impl;

import com.example.datn.model.ManHinh;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.repository.ManHinhRepository;
import com.example.datn.service.ManHinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ManHinhServiceImpl implements ManHinhService {
    @Autowired
    ManHinhRepository manHinhRepository;
    @Override
    public ArrayList<ManHinh> getAll() {
            return (ArrayList<ManHinh>) manHinhRepository.findAll();
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public ManHinh add(ManHinh mh) {
        return null;
    }

    @Override
    public ManHinh detail(UUID id) {
        return null;
    }
}
