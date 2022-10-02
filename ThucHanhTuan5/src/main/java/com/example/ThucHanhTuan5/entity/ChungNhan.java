package com.example.ThucHanhTuan5.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chungnhan")

public class ChungNhan implements Serializable {

    @Id
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NhanVien nhanVien;

    @Id
    @JoinColumn(name = "MaMB",referencedColumnName = "MaMB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MayBay mayBay;
}
