package com.example.datn.controller;

import com.example.datn.model.KhachHang;
import com.example.datn.model.LichSuHoaDon;
import com.example.datn.service.LichSuHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@Controller
@RequestMapping("/lshd")
public class LichSuHoaDonController {
    @Autowired
    LichSuHoaDonService lichSuHoaDonService;

    @RequestMapping(value = "/hien-/", method = RequestMethod.GET)
    public ResponseEntity<List<LichSuHoaDon>> listAll() {
        List<LichSuHoaDon> list = lichSuHoaDonService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<LichSuHoaDon>>(list, HttpStatus.OK);
    }
}
