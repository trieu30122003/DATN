package com.example.datn.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "phieu_bao_hanh")
public class PhieuBaoHanh {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don_ct")
    private HoaDonCt idHoaDonCt;

    @Size(max = 20)
    @Column(name = "ma_seri", length = 20)
    private String maSeri;

    @Column(name = "ngay_tao_phieu")
    private LocalDate ngayTaoPhieu;

    @Size(max = 50)
    @Nationalized
    @Column(name = "khach_hang", length = 50)
    private String khachHang;

    @Column(name = "thoi_gian_bh")
    private Integer thoiGianBh;

    @Column(name = "ngay_mua")
    private LocalDate ngayMua;

    @Column(name = "trang_thai")
    private Integer trangThai;

}