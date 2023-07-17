package com.example.datn.service;

import com.example.datn.model.DayDeo;
import com.example.datn.model.Loai;
import com.example.datn.model.Serial;

import java.util.ArrayList;
import java.util.UUID;

public interface SerialService {
    ArrayList<Serial> getAll();
    void delete(UUID id);
    Serial add(Serial serial);
    Serial detail(UUID id);
}
