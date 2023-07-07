package com.example.datn.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "san_pham_ct")
public class SanPhamCt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id", nullable = false)
    private UUID id;

    @Size(max = 20)
    @Column(name = "ma", length = 20)
    private String ma;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten", length = 50)
    private String ten;

    @Column(name = "gia_ban", precision = 18)
    private BigDecimal giaBan;

    @ManyToOne
    @JoinColumn(name = "id_loai")
    private Loai idLoai;

    @ManyToOne
    @JoinColumn(name = "id_nsx")
    private Nsx idNsx;

    @ManyToOne
    @JoinColumn(name = "id_mau_sac")
    private MauSac idMauSac;

    @ManyToOne
    @JoinColumn(name = "id_san_pham")
    private SanPham idSanPham;

    @ManyToOne
    @JoinColumn(name = "id_man_hinh")
    private ManHinh idManHinh;

    @ManyToOne
    @JoinColumn(name = "id_day_deo")
    private DayDeo idDayDeo;

    @Column(name = "tinh_trang")
    private Integer tinhTrang;

}