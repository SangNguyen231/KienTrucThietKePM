package com.example.ThucHanhTuan5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Table(name = "nhanvien")
public class NhanVien {
	
	@Id
	@Column(name = "MaNV")
	private String maNV;
	
	@Column(name = "Ten")
	private String ten;
	
	@Column(name = "Luong")
	private int luong;
}
