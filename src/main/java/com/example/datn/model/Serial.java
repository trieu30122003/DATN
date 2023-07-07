package com.example.datn.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "serial")
public class Serial {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id", nullable = false)
    private UUID id;

    @Size(max = 20)
    @Column(name = "ma_seri", length = 20)
    private String maSeri;

    @ManyToOne
    @JoinColumn(name = "id_ctsp")
    private SanPhamCt idCtsp;

    @Column(name = "ngay_ban")
    private LocalDate ngayBan;

    @Column(name = "ngay_nhap")
    private LocalDate ngayNhap;

    @Column(name = "tinh_trang")
    private Integer tinhTrang;

}