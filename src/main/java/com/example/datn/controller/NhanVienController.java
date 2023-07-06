package com.example.datn.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/nhan-vien")
public class NhanVienController {
    @GetMapping("/hien-thi")
    public String add(Model model){
        return null;
    }
}
