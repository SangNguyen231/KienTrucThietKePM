package com.example.ThucHanhTuan5.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ThucHanhTuan5.entity.MayBay;


@Repository
public interface MayBayRepository extends CrudRepository<MayBay, Integer>{
	
	@Query(value = "select * from maybay where tam_bay > 10000",nativeQuery = true)
	public List<MayBay> tamBayLonHon10000();
	
	@Query(value = "select count(mamb) from maybay where loai like 'Boeing %'",nativeQuery = true)
	public int loaiMayBayBoeing();
	
	@Query(value = "select mb.mamb from nhanvien nv join chungnhan cn on nv.manv = cn.manv \r\n"
			+ "join maybay mb on cn.mamb =  mb.mamb where nv.ten like 'Nguyen %'",nativeQuery = true)
	public List<Integer> maSoMBDuocLaiNguoiHoNguyen();
	
	@Query(value = "select * from maybay where tam_bay > (select do_dai from chuyenbay where macb = 'VN280')",nativeQuery = true)
	public List<MayBay> thucHienChuyenBayVN280();
	
	@Query(value = "select maybay.mamb, maybay.loai, count(manv) from maybay inner join chungnhan\r\n"
			+ "on chungnhan.mamb = maybay.mamb group by(maybay.mamb)",nativeQuery = true)
	public List<String> Cau16();
}
