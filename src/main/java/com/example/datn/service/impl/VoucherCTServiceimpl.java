package com.example.datn.service.impl;

import com.example.datn.model.VoucherCt;
import com.example.datn.repository.VoucherCTRepository;
import com.example.datn.service.VoucherCTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoucherCTServiceimpl implements VoucherCTService {
    @Autowired
    VoucherCTRepository voucherCTRepository;

    @Override
    public List<VoucherCt> getAll() {
        return voucherCTRepository.findAll();
    }
}
