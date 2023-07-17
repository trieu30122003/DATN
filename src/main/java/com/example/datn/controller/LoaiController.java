package com.example.datn.controller;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.service.impl.DayDeoServiceIpml;
import com.example.datn.service.impl.LoaiServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@Controller
@RequestMapping("/loai")
@CrossOrigin(origins = "http://localhost:3000/")
public class LoaiController {
    @Autowired
    LoaiServiceImpl loaiService;
    @RequestMapping(value = "/hien-thi/", method = RequestMethod.GET)
    public ResponseEntity<List<Loai>> listAll() {
        List<Loai> list = loaiService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Loai>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public Loai save(@Valid @RequestBody Loai loai) {
        return loaiService.add(loai);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Loai> deleteContact(@PathVariable(value = "id") UUID id) {
        loaiService.delete(id);
        return ResponseEntity.ok().build();
    }
}
