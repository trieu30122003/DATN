package com.example.datn.controller;

import com.example.datn.model.ChucVu;
import com.example.datn.model.DayDeo;
import com.example.datn.model.KhachHang;
import com.example.datn.model.NhanVien;
import com.example.datn.service.ChucVuService;
import com.example.datn.service.NhanVienService;
import com.example.datn.service.impl.ChucVuServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@CrossOrigin(origins = "http://localhost:3000/")
@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    ChucVuService chucVuService;

    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public ResponseEntity<List<NhanVien>> listAll() {
        List<NhanVien> list = nhanVienService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<NhanVien>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/new/", method = RequestMethod.POST)
    public NhanVien save(@Valid @RequestBody NhanVien nhanVien) {
        return nhanVienService.add(nhanVien);
    }

    @RequestMapping(value = "/new/{id}", method = RequestMethod.GET)
    public NhanVien find(@PathVariable("id") UUID id) throws Exception {
        NhanVien nv = nhanVienService.getOne(id);
        if (nv == null) {
            ResponseEntity.notFound().build();
        }
        return nv;
    }

    @RequestMapping(value = "/new/", method = RequestMethod.PUT)
    public ResponseEntity<NhanVien> updateContact(@PathVariable(value = "id") UUID id,
                                                   @Valid @RequestBody NhanVien contactForm) throws Exception {
        NhanVien nv = nhanVienService.getOne(id);
        if (nv == null) {
            return ResponseEntity.notFound().build();
        }
        nv.setMa(contactForm.getMa());
        nv.setHo(contactForm.getHo());
        nv.setTenDem(contactForm.getTenDem());
        nv.setTen(contactForm.getTen());
        nv.setGioiTinh(contactForm.getGioiTinh());
        nv.setNgaySinh(contactForm.getNgaySinh());
        nv.setDiaChi(contactForm.getDiaChi());
        nv.setSdt(contactForm.getSdt());
        nv.setMatKhau(contactForm.getMatKhau());
        nv.setIdChucVu(contactForm.getIdChucVu());
        nv.setTrangThai(contactForm.getTrangThai());

        NhanVien nhanVien = nhanVienService.add(nv);
        return ResponseEntity.ok(nhanVien);
    }
}
