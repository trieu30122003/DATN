package com.example.datn.service.impl;

import com.example.datn.model.Serial;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.repository.SerialRepository;
import com.example.datn.service.SerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class SerialServiceIpml implements SerialService {
    @Autowired
    SerialRepository serialRepository;
    @Override
    public ArrayList<Serial> getAll() {
        return (ArrayList<Serial>) serialRepository.findAll();
    }
}
