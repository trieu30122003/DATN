package com.example.datn.controller;

import com.example.datn.model.*;
import com.example.datn.service.HoaDonService;
import com.example.datn.service.VoucherCTService;
import com.example.datn.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/voucherct")
public class VoucherCTController {
    @Autowired
    HoaDonService hoaDonService;
    @Autowired
    VoucherService voucherService;
    @Autowired
    VoucherCTService voucherCTService;
    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public ResponseEntity<List<VoucherCt>> listAllContact(){
        List<VoucherCt> list = voucherCTService.getAll();
        if(list.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<HoaDon> list1 = hoaDonService.getAll();
        if(list.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<Voucher> list2 = voucherService.getAll();
        if(list.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<VoucherCt>>(list,HttpStatus.OK);
    }
}
