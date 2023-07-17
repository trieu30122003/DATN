package com.example.datn.controller;

import com.example.datn.model.*;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.service.impl.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@CrossOrigin(origins = "http://localhost:3000/")
@Controller
@RequestMapping("/san-pham-ct")
public class ChiTietSanPhamController {
    @Autowired
    ChiTietSanPhamServiceImpl ctspServiceIpml;
    @Autowired
    DayDeoServiceIpml dayDeoServiceIpml;
    @Autowired
    LoaiServiceImpl loaiService;
    @Autowired
    ManHinhServiceImpl manHinhService;
    @Autowired
    SanPhamServiceIpml sanPhamServiceIpml;
    @Autowired
    MauSacServiceIpml mauSacServiceIpml;
    @Autowired
    SerialServiceIpml serialServiceIpml;
    @Autowired
    NSXServiceIpml nsxServiceIpml;
    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    public ResponseEntity<List<SanPhamCt>> listAllContact(){
        List<SanPhamCt> list= ctspServiceIpml.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<MauSac> ms= mauSacServiceIpml.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<ManHinh> manHinhs= manHinhService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<DayDeo> dayDeos= dayDeoServiceIpml.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<Nsx> nsx= nsxServiceIpml.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<SanPham> sp= sanPhamServiceIpml.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<Serial> sr= serialServiceIpml.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        List<Loai> loai= loaiService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<SanPhamCt>>(list, HttpStatus.OK);
    }
    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public SanPhamCt saveContact(@Valid @RequestBody SanPhamCt spct) {
       return ctspServiceIpml.add(spct);
    }
    @RequestMapping(value = "/new/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<SanPhamCt> deleteContact(@PathVariable(value = "id") UUID id) {
        ctspServiceIpml.delete(id);
        return ResponseEntity.ok().build();
    }
//    @RequestMapping(value = "/loaiAll/", method = RequestMethod.GET)
//    public ResponseEntity<List<Loai>> lstLoai() {
//        List<Loai> list = loaiService.getAll();
//        if(list.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<Loai>>(list, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/man-hinh/", method = RequestMethod.GET)
//    public ResponseEntity<List<ManHinh>> lstManHinh() {
//        List<ManHinh> manhinh = manHinhService.getAll();
//        if(manhinh.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<ManHinh>>(manhinh, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/mau-sac/", method = RequestMethod.GET)
//    public ResponseEntity<List<MauSac>> lstMauSac() {
//        List<MauSac> list = mauSacServiceIpml.getAll();
//        if(list.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<MauSac>>(list, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/day-deo/", method = RequestMethod.GET)
//    public ResponseEntity<List<DayDeo>> lstDaydeo() {
//        List<DayDeo> list = dayDeoServiceIpml.getAll();
//        if(list.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<DayDeo>>(list, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/nsx/", method = RequestMethod.GET)
//    public ResponseEntity<List<Nsx>> lstNSX() {
//        List<Nsx> list = nsxServiceIpml.getAll();
//        if(list.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<Nsx>>(list, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/san-pham/", method = RequestMethod.GET)
//    public ResponseEntity<List<SanPham>> lstSP() {
//        List<SanPham> list = sanPhamServiceIpml.getAll();
//        if(list.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<SanPham>>(list, HttpStatus.OK);
//    }
}
