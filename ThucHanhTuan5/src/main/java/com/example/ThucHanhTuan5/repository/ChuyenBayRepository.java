package com.example.ThucHanhTuan5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ThucHanhTuan5.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String>{
	
	@Query(value = "select * from chuyenbay where ga_den = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> chuyenBayDaLat();
	
	@Query(value = "select * from chuyenbay where do_dai < 10000 and do_dai > 8000", nativeQuery = true)
	public List<ChuyenBay> doDaiNhoHon8000LonHon10000();
	
	@Query(value = "select * from chuyenbay where ga_di = 'SGN' and ga_den = 'BMV'", nativeQuery = true)
	public List<ChuyenBay> chuyenBayTuSGDenBMT();
	
	@Query(value = "select count(macb) from chuyenbay where ga_di = 'SGN'", nativeQuery = true)
	public int chuyenBayDiTuSG();
	
	@Query(value = "select * from chuyenbay where do_dai < (\r\n"
			+ "select tam_bay from maybay where loai = 'Airbus A320')", nativeQuery = true)
	public List<ChuyenBay> chuyenBayCoTheBayBoiMayBayAirbusA320();
	
	@Query(value = "select chuyenbay.* from chuyenbay as chuyenbay, chuyenbay as cb WHERE chuyenbay.ga_di = cb.ga_den \r\n"
			+ "and chuyenbay.ga_den = cb.ga_di", nativeQuery = true)
	public List<ChuyenBay> Cau17();
	
	@Query(value = "select ga_di, count(macb) from chuyenbay group by(ga_di)", nativeQuery = true)
	public List<String> Cau18();
	
	@Query(value = "select ga_di, sum(chi_phi) from chuyenbay group by(ga_di)", nativeQuery = true)
	public List<String> Cau19();
	
	@Query(value = "select * from chuyenbay where gio_di < '12:00'", nativeQuery = true)
	public List<ChuyenBay> Cau20();
	
	@Query(value = "select ga_di, count(macb), gio_di from chuyenbay where gio_di < '12:00'", nativeQuery = true)
	public List<String> Cau21();
	
	@Query(value = "select manv from chungnhan group by manv having count(mamb) = 3", nativeQuery = true)
	public List<Integer> Cau22();
	
	@Query(value = "select chungnhan.manv, maybay.tam_bay from chungnhan \r\n"
			+ "join maybay on maybay.mamb = chungnhan.mamb\r\n"
			+ "group by chungnhan.manv\r\n"
			+ "having count(chungnhan.mamb) > 3 and max(maybay.tam_bay)", nativeQuery = true)
	public List<String> Cau23();
	
	@Query(value = "select nhanvien.manv, count(chungnhan.mamb) from nhanvien LEFT JOIN chungnhan on chungnhan.manv =\r\n"
			+ "nhanvien.manv group by nhanvien.manv", nativeQuery = true)
	public List<String> Cau24();
	
	@Query(value = "select * from chuyenbay where do_dai < ( select max(tam_bay) from maybay \r\n"
			+ "where loai like '%Boeing%' )", nativeQuery = true)
	public List<ChuyenBay> Cau28();
}

