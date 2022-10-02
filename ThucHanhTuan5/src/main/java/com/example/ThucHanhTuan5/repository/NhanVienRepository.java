package com.example.ThucHanhTuan5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ThucHanhTuan5.entity.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String> {
	
	@Query(value = "select * from nhanvien where luong < 10000",nativeQuery = true)
	public List<NhanVien> nhanVienLuongNhoHon10000();
	
	@Query(value = "select sum(luong) from nhanvien",nativeQuery = true)
	public int tongLuongNV();
	
	@Query(value = "select nv.manv from nhanvien nv join chungnhan cn on nv.manv = cn.manv \r\n"
			+ "join maybay mb on cn.mamb =  mb.mamb where loai like 'Boeing %'",nativeQuery = true)
	public List<Integer> maSoPCLaiBoeing();
	
	@Query(value = "select nv.manv, nv.luong, nv.ten from nhanvien nv join chungnhan cn on nv.manv = cn.manv \r\n"
			+ "join maybay mb on cn.mamb =  mb.mamb where mb.mamb = 747",nativeQuery = true)
	public List<NhanVien> nhanVienLaiMB747();
	
	@Query(value = "select manv from nhanvien where manv in (select manv from chungnhan \r\n"
			+ "where mamb in (select mamb from maybay\r\n"
			+ "where loai like '%Airbus%')) and manv in (select manv from chungnhan \r\n"
			+ "where mamb in (select mamb from maybay\r\n"
			+ "where loai like '%Boeing%'))",nativeQuery = true)
	public List<Integer> nhanVienLaiBoeingVsAirbus();
	
	@Query(value = "select * from nhanvien where manv in (select manv from chungnhan where mamb in (\r\n"
			+ "select mamb from maybay where loai like 'Boeing%'))",nativeQuery = true)
	public List<NhanVien> nhanVienLaiMBBoeing();
	
	@Query(value = "select * from nhanvien where manv not in ( select manv from chungnhan group by\r\n"
			+ "manv )",nativeQuery = true)
	public List<NhanVien> Cau25();
	
	@Query(value = "select manv, ten, max(luong) from nhanvien",nativeQuery = true)
	public List<String> Cau26();
	
	@Query(value = "select sum(luong) from nhanvien where manv in ( select manv from chungnhan group by manv )",nativeQuery = true)
	public List<Integer> Cau27();
	
}
