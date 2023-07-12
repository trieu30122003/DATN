package com.example.datn.service.impl;

import com.example.datn.model.ManHinh;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.repository.ManHinhRepository;
import com.example.datn.service.ManHinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ManHinhServiceImpl implements ManHinhService {
    @Autowired
    ManHinhRepository manHinhRepository;
    @Override
    public ArrayList<ManHinh> getAll() {
            return (ArrayList<ManHinh>) manHinhRepository.findAll();
    }
}
