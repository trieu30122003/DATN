package com.example.datn.service.impl;

import com.example.datn.model.Voucher;
import com.example.datn.repository.VoucherRepository;
import com.example.datn.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoucherServiceimpl implements VoucherService {
    @Autowired
    VoucherRepository voucherRepository;

    @Override
    public List<Voucher> getAll() {
        return voucherRepository.findAll();
    }
}
