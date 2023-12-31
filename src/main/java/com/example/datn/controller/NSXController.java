package com.example.datn.controller;

import com.example.datn.model.MauSac;
import com.example.datn.model.Nsx;
import com.example.datn.service.impl.MauSacServiceIpml;
import com.example.datn.service.impl.NSXServiceIpml;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/api/nsx")
@CrossOrigin(origins = "http://localhost:3000/")
public class NSXController {
    @Autowired
    NSXServiceIpml nsxServiceIpml;
    @RequestMapping( value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Nsx>> listAll() {
        List<Nsx> list = nsxServiceIpml.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Nsx>>(list, HttpStatus.OK);
    }

    @PostMapping( "/all")
    public Nsx save(@RequestBody Nsx nsx) {
        return nsxServiceIpml.add(nsx);
    }
    @RequestMapping(value = "/all/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Nsx> deleteContact(@PathVariable(value = "id") UUID id) {
        nsxServiceIpml.delete(id);
        return ResponseEntity.ok().build();
    }

}
