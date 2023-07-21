package com.example.datn.controller;

import com.example.datn.model.KhachHang;
import com.example.datn.service.KhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000/")
@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Autowired  
    KhachHangService khachHangService;

    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public ResponseEntity<List<KhachHang>> listAll() {
        List<KhachHang> list = khachHangService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<KhachHang>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/new/", method = RequestMethod.POST)
    public KhachHang save(@Valid @RequestBody KhachHang khachHang) {
        return khachHangService.add(khachHang);
    }

    //    @RequestMapping(value = "/new/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<KhachHang> delete(@PathVariable(value = "id") UUID id) {
//        khachHangService.delete(id);
//        return ResponseEntity.ok().build();
//    }
    @RequestMapping(value = "/new/{id}", method = RequestMethod.GET)
    public ResponseEntity<KhachHang> find(@PathVariable("id") UUID id) {
        KhachHang kh = khachHangService.getOne(id);
        if (kh == null) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(kh);
    }

    @RequestMapping(value = "/new/{id}", method = RequestMethod.PUT)
    public ResponseEntity<KhachHang> updateContact(@PathVariable(value = "id") UUID id,
                                                   @Valid @RequestBody KhachHang contactForm) {
        KhachHang kh = khachHangService.getOne(id);
        if (kh == null) {
            return ResponseEntity.notFound().build();
        }
        kh.setMa(contactForm.getMa());
        kh.setHo(contactForm.getHo());
        kh.setTenDem(contactForm.getTenDem());
        kh.setTen(contactForm.getTen());
        kh.setEmail(contactForm.getEmail());
        kh.setNgaySinh(contactForm.getNgaySinh());
        kh.setDiaChi(contactForm.getDiaChi());
        kh.setSdt(contactForm.getSdt());
        kh.setMatKhau(contactForm.getMatKhau());
        kh.setTinhTrang(contactForm.getTinhTrang());

        KhachHang khachHang = khachHangService.add(kh);
        return ResponseEntity.ok(khachHang);
    }
}
