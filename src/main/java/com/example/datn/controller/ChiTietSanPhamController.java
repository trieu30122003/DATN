package com.example.datn.controller;

import com.example.datn.model.*;
import com.example.datn.repository.LoaiRepository;
import com.example.datn.service.impl.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ctsp")
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
    @RequestMapping(value = "/new/", method = RequestMethod.GET)
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
    @RequestMapping(value = "/new/", method = RequestMethod.POST)
    public void saveContact(@Valid @RequestBody SanPhamCt spct) {
        ctspServiceIpml.add(spct);
    }
    @RequestMapping(value = "/new/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<SanPhamCt> deleteContact(@PathVariable(value = "id") UUID id) {
        ctspServiceIpml.delete(id);
        return ResponseEntity.ok().build();
    }
}
