package com.example.datn.controller;

import com.example.datn.model.KhachHang;
import com.example.datn.service.impl.KhachHangServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.datn.service.KhachHangService;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;
    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public ResponseEntity<List<KhachHang>> listAllContact(){
        List<KhachHang> list= khachHangService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        //return ResponseEntity<List<Contact>>(listContact, HttpStatus.OK);
        return new ResponseEntity<List<KhachHang>>(list, HttpStatus.OK);
    }
    @RequestMapping(value = "/new/", method = RequestMethod.POST)
    public void saveContact(@Valid @RequestBody KhachHang khachHang) {
         khachHangService.add(khachHang);
    }
    @RequestMapping(value = "/new/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<KhachHang> deleteContact(@PathVariable(value = "id") UUID id) {
        KhachHang kh = khachHangService.getOne(id);
        if(kh == null) {
            return ResponseEntity.notFound().build();
        }
        khachHangService.delete(id);
        return ResponseEntity.ok().build();
    }
}
