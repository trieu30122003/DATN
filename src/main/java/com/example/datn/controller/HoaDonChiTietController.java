package com.example.datn.controller;

import com.example.datn.model.HoaDon;
import com.example.datn.model.HoaDonCt;
import com.example.datn.model.KhachHang;
import com.example.datn.model.SanPhamCt;
import com.example.datn.service.ChiTietSanPhamService;
import com.example.datn.service.HoaDonChitietService;
import com.example.datn.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/hdct")
public class HoaDonChiTietController {
    @Autowired
    HoaDonService hoaDonService;
    @Autowired
    ChiTietSanPhamService chiTietSanPhamService;
    @Autowired
    HoaDonChitietService hoaDonChitietService;

    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public ResponseEntity<List<HoaDonCt>> listAllContact(){
        List<HoaDonCt> list= hoaDonChitietService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<SanPhamCt> list1= chiTietSanPhamService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<HoaDon> list2= hoaDonService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HoaDonCt>>(list, HttpStatus.OK);
    }
}
