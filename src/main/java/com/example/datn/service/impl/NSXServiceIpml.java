package com.example.datn.service.impl;

import com.example.datn.model.Nsx;
import com.example.datn.repository.NSXRepository;
import com.example.datn.service.NSXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NSXServiceIpml implements NSXService {
    @Autowired
    NSXRepository nsxRepository;
    @Override
    public ArrayList<Nsx> getAll() {
        return (ArrayList<Nsx>) nsxRepository.findAll();
    }
}
