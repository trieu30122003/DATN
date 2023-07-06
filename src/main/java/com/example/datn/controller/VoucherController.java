package com.example.datn.controller;

import com.example.datn.model.KhachHang;
import com.example.datn.model.Voucher;
import com.example.datn.repository.VoucherRepository;
import com.example.datn.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/voucher")
public class VoucherController {
    @Autowired
    VoucherService voucherService;

    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public ResponseEntity<List<Voucher>> listAllContact() {
        List<Voucher> list = voucherService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Voucher>>(list, HttpStatus.OK);
    }

}
