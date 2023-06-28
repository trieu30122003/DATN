package com.example.datn.controller;

import com.example.datn.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.ArrayList;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {

    @Autowired
    KhachHangService khachHangService;

    @Autowired
    HangKhachHangService hangKhachHangService;

    @GetMapping("/hien-thi")
    public String hienthi(Model model,
                          @RequestParam(value = "p", defaultValue = "0") Integer p
                          ){
        if(p<0) p=0;
        Pageable pageable = PageRequest.of(p,2);
        Page<KhachHang> khachHang = khachHangService.getAll(pageable);
        ArrayList<HangKhachHang> list = hangKhachHangService.getAll();
        model.addAttribute("khachHang",khachHang);
        model.addAttribute("hkh",list);
        return "KhachHang";
    }

    @GetMapping("/delete")
    public String delete(Model model, @RequestParam("maKhachHang") Long maKhachHang){
        khachHangService.delete(maKhachHang);
        return "redirect:/khach-hang/hien-thi";
    }

    @PostMapping("/add")
    public String add(@RequestParam("ten") String ten,
                       @RequestParam("sinhNhat") Date sinhNhat,
                       @RequestParam("diaChi") String diaChi,
                       @RequestParam("sdt") String sdt,
                       @RequestParam("email") String email,
                       @RequestParam("gioiTinh") Integer gioiTinh,
                       @RequestParam("cmt") String cmt,
                       @RequestParam("scc") String scc,
                       @RequestParam("anh") String anh,
                       @RequestParam("trangThai") Integer trangThai,
                       @RequestParam("diemTichLuy") Integer diemTichLuy,
                       @RequestParam("hangKhachHang") HangKhachHang hangKhachHang

    ){
        KhachHang kh = new KhachHang();
        kh.setTen(ten);
        kh.setSinhNhat(sinhNhat);
        kh.setDiaChi(diaChi);
        kh.setSdt(sdt);
        kh.setEmail(email);
        kh.setGioiTinh(gioiTinh);
        kh.setCmt(cmt);
        kh.setScc(scc);
        kh.setAnh(anh);
        kh.setTrangThai(trangThai);
        kh.setDiemTichLuy(diemTichLuy);
        kh.setHangKhachHang(hangKhachHang);
        khachHangService.add(kh);
        return "redirect:/khach-hang/hien-thi";
    }
}
