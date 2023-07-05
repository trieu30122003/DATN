package com.example.datn.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id", nullable = false)
    private UUID id;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma", length = 10)
    private String ma;

    @Column(name = "ngay_tao")
    private LocalDate ngayTao;

    @Column(name = "ngay_ship")
    private LocalDate ngayShip;

    @Column(name = "ngay_nhan")
    private LocalDate ngayNhan;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_nguoi_nhan", length = 50)
    private String tenNguoiNhan;

    @Size(max = 50)
    @Nationalized
    @Column(name = "dia_chi", length = 50)
    private String diaChi;

    @Size(max = 12)
    @Nationalized
    @Column(name = "sdt", length = 12)
    private String sdt;

    @Column(name = "so_tien_giam", precision = 18)
    private BigDecimal soTienGiam;

    @Column(name = "tinh_trang")
    private Integer tinhTrang;

    @Column(name = "tong_tien", precision = 18)
    private BigDecimal tongTien;

    @Column(name = "thanh_tien", precision = 18)
    private BigDecimal thanhTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nhan_vien")
    private NhanVien idNhanVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_phuong_thuc_thanh_toan")
    private PhuongThucThanhToan idPhuongThucThanhToan;

}