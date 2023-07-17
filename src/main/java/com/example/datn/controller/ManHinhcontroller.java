package com.example.datn.controller;

import com.example.datn.model.Loai;
import com.example.datn.model.ManHinh;
import com.example.datn.service.impl.LoaiServiceImpl;
import com.example.datn.service.impl.ManHinhServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/man-hinh")
@CrossOrigin(origins = "http://localhost:3000/")
public class ManHinhcontroller {
    @Autowired
    ManHinhServiceImpl manHinhService;
    @RequestMapping(value = "/hien-thi/", method = RequestMethod.GET)
    public ResponseEntity<List<ManHinh>> listAll() {
        List<ManHinh> list = manHinhService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<ManHinh>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public ManHinh save(@Valid @RequestBody ManHinh mh) {
        return manHinhService.add(mh);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<ManHinh> deleteContact(@PathVariable(value = "id") UUID id) {
        manHinhService.delete(id);
        return ResponseEntity.ok().build();
    }
}
