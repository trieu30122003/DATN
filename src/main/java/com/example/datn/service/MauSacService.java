package com.example.datn.service;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.model.MauSac;

import java.util.ArrayList;
import java.util.UUID;

public interface MauSacService {
    ArrayList<MauSac> getAll();
    void delete(UUID id);
    MauSac add(MauSac ms);
    MauSac detail(UUID id);
}
