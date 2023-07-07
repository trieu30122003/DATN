package com.example.datn.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "hoa_don_ct")
public class HoaDonCt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_ctsp")
    private SanPhamCt idCtsp;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    private HoaDon idHoaDon;

    @Column(name = "don_gia", precision = 18)
    private BigDecimal donGia;

    @Column(name = "trang_thai")
    private Integer trangThai;

}