package com.example.datn.service.impl;

import com.example.datn.model.DayDeo;
import com.example.datn.repository.DayDeoRepository;
import com.example.datn.service.DayDeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DayDeoServiceIpml implements DayDeoService {
    @Autowired
    DayDeoRepository  dayDeoRepository;
    @Override
    public ArrayList<DayDeo> getAll() {
        return (ArrayList<DayDeo>) dayDeoRepository.findAll();
    }
}
