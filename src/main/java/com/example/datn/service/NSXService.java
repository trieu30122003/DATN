package com.example.datn.service;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.model.Nsx;

import java.util.ArrayList;
import java.util.UUID;

public interface NSXService {
    ArrayList<Nsx> getAll();
    void delete(UUID id);
    Nsx add(Nsx nsx);
    Nsx detail(UUID id);
}
