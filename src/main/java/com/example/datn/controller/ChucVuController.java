package com.example.datn.controller;

import com.example.datn.model.ChucVu;
import com.example.datn.model.NhanVien;
import com.example.datn.service.ChucVuService;
import com.example.datn.service.NhanVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/chuc-vu")
public class ChucVuController {
    @Autowired
    ChucVuService chucVuService;

    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public ResponseEntity<List<ChucVu>> listAll() {
        List<ChucVu> list = chucVuService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<ChucVu>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/new/", method = RequestMethod.POST)
    public ChucVu save(@Valid @RequestBody ChucVu chucVu) {
        return chucVuService.add(chucVu);
    }



    @RequestMapping(value = "/new/{id}", method = RequestMethod.GET)
    public ChucVu find(@PathVariable("id") UUID id) {
        ChucVu cv = chucVuService.getOne(id);
        if (cv == null) {
            ResponseEntity.notFound().build();
        }
        return cv;
    }

    @RequestMapping(value = "/new/", method = RequestMethod.PUT)
    public ResponseEntity<ChucVu> updateContact(@PathVariable(value = "id") UUID id,
                                                @Valid @RequestBody ChucVu contactForm) {
        ChucVu cv = chucVuService.getOne(id);
        if (cv == null) {
            return ResponseEntity.notFound().build();
        }
        cv.setMa(contactForm.getMa());
        cv.setTen(contactForm.getTen());
        cv.setTrangThai(contactForm.getTrangThai());
        ChucVu chucVu = chucVuService.add(cv);
        return ResponseEntity.ok(chucVu);
    }
}
