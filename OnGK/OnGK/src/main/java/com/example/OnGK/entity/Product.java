package com.example.OnGK.entity;

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
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "ma_Sp")
	private int ma_Sp;
	
	@Column(name = "ten_Sp")
	private String ten_Sp;
	
	@Column(name = "so_Luong")
	private int so_Luong;
	
}
