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
@CrossOrigin(origins = "http://localhost:3000")
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
    @RequestMapping(value = "/products", method = RequestMethod.GET)
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
    @PostMapping( "/products")
    public SanPhamCt saveContact(@RequestBody SanPhamCt ctsp) {
       return ctspServiceIpml.add(ctsp);
    }
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<SanPhamCt> deleteContact(@PathVariable(value = "id") UUID id) {
        ctspServiceIpml.delete(id);
        return ResponseEntity.ok().build();
    }
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ResponseEntity<SanPhamCt> getSanPhamById(@PathVariable(value = "id") UUID id) {
        SanPhamCt sanPhamCt = ctspServiceIpml.detail(id);
        if (sanPhamCt != null) {
            return new ResponseEntity<>(sanPhamCt, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
