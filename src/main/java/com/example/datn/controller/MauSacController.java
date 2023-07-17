package com.example.datn.controller;

import com.example.datn.model.ManHinh;
import com.example.datn.model.MauSac;
import com.example.datn.service.impl.ManHinhServiceImpl;
import com.example.datn.service.impl.MauSacServiceIpml;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@Controller
@RequestMapping("/mau-sac")
@CrossOrigin(origins = "http://localhost:3000/")
public class MauSacController {
    @Autowired
    MauSacServiceIpml mauSacServiceIpml;
    @RequestMapping(value = "/hien-thi/", method = RequestMethod.GET)
    public ResponseEntity<List<MauSac>> listAll() {
        List<MauSac> list = mauSacServiceIpml.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<MauSac>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public MauSac save(@Valid @RequestBody MauSac mh) {
        return mauSacServiceIpml.add(mh);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<MauSac> deleteContact(@PathVariable(value = "id") UUID id) {
        mauSacServiceIpml.delete(id);
        return ResponseEntity.ok().build();
    }
}
