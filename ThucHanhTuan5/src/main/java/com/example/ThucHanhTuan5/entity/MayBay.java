package com.example.ThucHanhTuan5.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "maybay")
public class MayBay {
	
	@Id
	@Column(name = "MaMB")
	private int maMB;
	
	@Column(name = "Loai")
	private String loai;
	
	@Column(name = "TamBay")
	private int tamBay;
	
}
