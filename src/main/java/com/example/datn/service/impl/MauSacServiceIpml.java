package com.example.datn.service.impl;

import com.example.datn.model.MauSac;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.repository.MauSacRepository;
import com.example.datn.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class MauSacServiceIpml implements MauSacService {
    @Autowired
    MauSacRepository mauSacRepository;
    @Override
    public ArrayList<MauSac> getAll() {
        return (ArrayList<MauSac>) mauSacRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        mauSacRepository.deleteById(id);
    }

    @Override
    public MauSac add(MauSac ms) {
        return mauSacRepository.save(ms);
    }

    @Override
    public MauSac detail(UUID id) {
        return null;
    }
}
