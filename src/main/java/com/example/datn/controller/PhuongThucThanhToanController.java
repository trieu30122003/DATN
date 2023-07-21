package com.example.datn.controller;

import com.example.datn.model.KhachHang;
import com.example.datn.model.PhuongThucThanhToan;
import com.example.datn.service.KhachHangService;
import com.example.datn.service.PhuongThucThanhToanService;
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
@RequestMapping("/pttt")
public class PhuongThucThanhToanController {
    @Autowired
    PhuongThucThanhToanService phuongThucThanhToanService;

    @RequestMapping(value = "/hien-thi/", method = RequestMethod.GET)
    public ResponseEntity<List<PhuongThucThanhToan>> listAll() {
        List<PhuongThucThanhToan> list = phuongThucThanhToanService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<PhuongThucThanhToan>>(list, HttpStatus.OK);
    }
}
