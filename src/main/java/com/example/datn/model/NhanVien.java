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
@Table(name = "nhan_vien")
public class NhanVien {
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

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_dem", length = 50)
    private String tenDem;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ho", length = 50)
    private String ho;

    @Column(name = "ngay_sinh")
    private LocalDate ngaySinh;

    @Size(max = 50)
    @Nationalized
    @Column(name = "gioi_tinh", length = 50)
    private String gioiTinh;

    @Size(max = 50)
    @Nationalized
    @Column(name = "dia_chi", length = 50)
    private String diaChi;

    @Size(max = 50)
    @Nationalized
    @Column(name = "sdt", length = 50)
    private String sdt;

    @Size(max = 50)
    @Nationalized
    @Column(name = "mat_khau", length = 50)
    private String matKhau;

    @ManyToOne()
    @JoinColumn(name = "id_chuc_vu")
    private ChucVu idChucVu;

    @Column(name = "trang_thai")
    private Integer trangThai;

}