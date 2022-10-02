package com.example.ThucHanhTuan5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ThucHanhTuan5.entity.MayBay;
import com.example.ThucHanhTuan5.entity.NhanVien;
import com.example.ThucHanhTuan5.repository.MayBayRepository;
import com.example.ThucHanhTuan5.repository.NhanVienRepository;
import com.example.ThucHanhTuan5.entity.ChuyenBay;
import com.example.ThucHanhTuan5.repository.ChuyenBayRepository;

@RestController
public class DemoController {

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@RequestMapping("hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/Cau1")
	public List<ChuyenBay> Cau1() {
		List<ChuyenBay> temp = chuyenBayRepository.chuyenBayDaLat();
		return temp;
	}
	
	@GetMapping("/Cau2")
	public List<MayBay> Cau2() {
		List<MayBay> mayBays = mayBayRepository.tamBayLonHon10000();
		return mayBays;
	}
	
	@GetMapping("/Cau3")
	public List<NhanVien> Cau3() {
		List<NhanVien> nhanViens = nhanVienRepository.nhanVienLuongNhoHon10000();
		return nhanViens;
	}
	
	@GetMapping("/Cau4")
	public List<ChuyenBay> Cau4() {		
		List<ChuyenBay> chuyenBays = chuyenBayRepository.doDaiNhoHon8000LonHon10000();
		return chuyenBays;
	}
	
	@GetMapping("/Cau5")
	public List<ChuyenBay> Cau5() {
		List<ChuyenBay> chuyenBays = chuyenBayRepository.chuyenBayTuSGDenBMT();
		return chuyenBays;
	}
	
	@GetMapping("/Cau6")
	public int Cau6() {
		int chuyenBays = chuyenBayRepository.chuyenBayDiTuSG();
		return chuyenBays;
	}

	@GetMapping("/Cau7")
	public int Cau7() {
		int mayBays = mayBayRepository.loaiMayBayBoeing();
		return mayBays;
	}
	
	@GetMapping("/Cau8")
	public int Cau8() {
		int nhanViens = nhanVienRepository.tongLuongNV();
		return nhanViens;
	}
	
	@GetMapping("/Cau9")
	public List<Integer> Cau9() {
		List<Integer> nhanViens = nhanVienRepository.maSoPCLaiBoeing();
		return nhanViens;
	}
	
	@GetMapping("/Cau10")
	public List<NhanVien> Cau10() {
		List<NhanVien> nhanViens = nhanVienRepository.nhanVienLaiMB747();
		return nhanViens;
	}
	
	@GetMapping("/Cau11")
	public List<Integer> Cau11() {
		List<Integer> mayBays = mayBayRepository.maSoMBDuocLaiNguoiHoNguyen();
		return mayBays;
	}
	
	@GetMapping("/Cau12")
	public List<Integer> Cau12() {
		List<Integer> nhanViens = nhanVienRepository.nhanVienLaiBoeingVsAirbus();
		return nhanViens;
	}
	
	@GetMapping("/Cau13")
	public List<MayBay> Cau13() {
		List<MayBay> mayBays = mayBayRepository.thucHienChuyenBayVN280();
		return mayBays;
	}

	@GetMapping("/Cau14")
	public List<ChuyenBay> Cau14() {		
		List<ChuyenBay> chuyenBays = chuyenBayRepository.chuyenBayCoTheBayBoiMayBayAirbusA320();
		return chuyenBays;
	}
	
	@GetMapping("/Cau15")
	public List<NhanVien> Cau15() {
		List<NhanVien> nhanViens = nhanVienRepository.nhanVienLaiMBBoeing();
		return nhanViens;
	}
	
	@GetMapping("/Cau16")
	public List<String> Cau16() {
		List<String> mayBays = mayBayRepository.Cau16();
		return mayBays;
	}
	
	@GetMapping("/Cau17")
	public List<ChuyenBay> Cau17() {		
		List<ChuyenBay> chuyenBays = chuyenBayRepository.Cau17();
		return chuyenBays;
	}
	
	@GetMapping("/Cau18")
	public List<String> Cau18() {		
		List<String> temp = chuyenBayRepository.Cau18();
		return temp;
	}
	@GetMapping("/Cau19")
	public List<String> Cau19() {		
		List<String> temp = chuyenBayRepository.Cau19();
		return temp;
	}
	@GetMapping("/Cau20")
	public List<ChuyenBay> Cau20() {		
		List<ChuyenBay> temp = chuyenBayRepository.Cau20();
		return temp;
	}
	@GetMapping("/Cau21")
	public List<String> Cau21() {		
		List<String> temp = chuyenBayRepository.Cau21();
		return temp;
	}
	@GetMapping("/Cau22")
	public List<Integer> Cau22() {		
		List<Integer> temp = chuyenBayRepository.Cau22();
		return temp;
	}
	@GetMapping("/Cau23")
	public List<String> Cau23() {		
		List<String> temp = chuyenBayRepository.Cau23();
		return temp;
	}
	@GetMapping("/Cau24")
	public List<String> Cau24() {		
		List<String> temp = chuyenBayRepository.Cau24();
		return temp;
	}
	@GetMapping("/Cau25")
	public List<NhanVien> Cau25() {		
		List<NhanVien> temp = nhanVienRepository.Cau25();
		return temp;
	}
	@GetMapping("/Cau26")
	public List<String> Cau26() {		
		List<String> temp = nhanVienRepository.Cau26();
		return temp;
	}
	@GetMapping("/Cau27")
	public List<Integer> Cau27() {		
		List<Integer> temp = nhanVienRepository.Cau27();
		return temp;
	}
	@GetMapping("/Cau28")
	public List<ChuyenBay> Cau28() {		
		List<ChuyenBay> temp = chuyenBayRepository.Cau28();
		return temp;
	}
	
	
}
