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
@Table(name = "serial_da_mua")
public class SerialDaMua {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hoa_don_ct")
    private HoaDonCt idHoaDonCt;

    @Size(max = 20)
    @Column(name = "ma_seri", length = 20)
    private String maSeri;

    @Column(name = "ngay_ban")
    private LocalDate ngayBan;

    @Column(name = "tinh_trang")
    private Integer tinhTrang;

}