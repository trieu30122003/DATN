package com.example.datn;

import com.example.datn.repository.ChucVuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class TemplateJava5ApplicationTests {
    @Autowired
    ChucVuRepository chucVuRepository;
    @Test
    void contextLoads() {
        System.out.println(chucVuRepository.findById(UUID.fromString("6e79acde-faf4-418e-b541-14fa51f97563")).get());
    }

}
