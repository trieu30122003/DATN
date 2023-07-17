package com.example.datn.controller;

import com.example.datn.model.DayDeo;
import com.example.datn.model.NhanVien;
import com.example.datn.model.SanPhamCt;
import com.example.datn.service.NhanVienService;
import com.example.datn.service.impl.DayDeoServiceIpml;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@Controller
@RequestMapping("/day-deo")
@CrossOrigin(origins = "http://localhost:3000/")
public class DayDeoController {
    @Autowired
    DayDeoServiceIpml dayDeoServiceIpml;
    @RequestMapping(value = "/hien-thi/", method = RequestMethod.GET)
    public ResponseEntity<List<DayDeo>> listAll() {
        List<DayDeo> list = dayDeoServiceIpml.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<DayDeo>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public DayDeo save(@Valid @RequestBody DayDeo dayDeo) {
        return dayDeoServiceIpml.add(dayDeo);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DayDeo> deleteContact(@PathVariable(value = "id") UUID id) {
        dayDeoServiceIpml.delete(id);
        return ResponseEntity.ok().build();
    }
//    @RequestMapping(value = "/new/{id}", method = RequestMethod.GET)
//    public NhanVien find(@PathVariable("id") UUID id) {
//        NhanVien nv = nhanVienService.getOne(id);
//        if (nv == null) {
//            ResponseEntity.notFound().build();
//        }
//        return nv;
//    }

//    @RequestMapping(value = "/new/", method = RequestMethod.PUT)
//    public ResponseEntity<NhanVien> updateContact(@PathVariable(value = "id") UUID id,
//                                                  @Valid @RequestBody NhanVien contactForm) {
//        NhanVien nv = nhanVienService.getOne(id);
//        if (nv == null) {
//            return ResponseEntity.notFound().build();
//        }
//        nv.setMa(contactForm.getMa());
//        nv.setHo(contactForm.getHo());
//        nv.setTenDem(contactForm.getTenDem());
//        nv.setTen(contactForm.getTen());
//        nv.setGioiTinh(contactForm.getGioiTinh());
//        nv.setNgaySinh(contactForm.getNgaySinh());
//        nv.setDiaChi(contactForm.getDiaChi());
//        nv.setSdt(contactForm.getSdt());
//        nv.setMatKhau(contactForm.getMatKhau());
//        nv.setIdChucVu(contactForm.getIdChucVu());
//        nv.setTrangThai(contactForm.getTrangThai());
//
//        NhanVien nhanVien = nhanVienService.add(nv);
//        return ResponseEntity.ok(nhanVien);
//    }
}
