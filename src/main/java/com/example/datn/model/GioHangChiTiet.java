package com.example.datn.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "gio_hang_ct")
public class GioHangChiTiet {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_ctsp")
    private SanPhamCt idCtsp;

    @ManyToOne
    @JoinColumn(name = "id_gio_hang")
    private GioHang idGioHang;

    @Column(name = "don_gia", precision = 18)
    private BigDecimal donGia;

}