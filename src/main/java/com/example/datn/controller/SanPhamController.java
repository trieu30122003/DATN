package com.example.datn.controller;

import com.example.datn.model.MauSac;
import com.example.datn.model.SanPham;
import com.example.datn.model.SanPhamCt;
import com.example.datn.service.impl.MauSacServiceIpml;
import com.example.datn.service.impl.SanPhamServiceIpml;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/san-pham")
@CrossOrigin(origins = "http://localhost:3000/")
public class SanPhamController {
    @Autowired
    SanPhamServiceIpml sanPhamServiceIpml;
    @RequestMapping(value = "/hien-thi/", method = RequestMethod.GET)
    public ResponseEntity<List<SanPham>> listAll() {
        List<SanPham> list = sanPhamServiceIpml.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<SanPham>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public SanPham save(@Valid @RequestBody SanPham mh) {
        return sanPhamServiceIpml.add(mh);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<SanPham> deleteContact(@PathVariable(value = "id") UUID id) {
        sanPhamServiceIpml.delete(id);
        return ResponseEntity.ok().build();
    }
}
