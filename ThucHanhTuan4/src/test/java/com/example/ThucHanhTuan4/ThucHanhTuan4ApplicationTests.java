package com.example.ThucHanhTuan4;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ThucHanhTuan4.entity.ChuyenBay;
import com.example.ThucHanhTuan4.entity.MayBay;
import com.example.ThucHanhTuan4.entity.NhanVien;
import com.example.ThucHanhTuan4.repository.ChuyenBayRepository;
import com.example.ThucHanhTuan4.repository.MayBayRepository;
import com.example.ThucHanhTuan4.repository.NhanVienRepository;

@SpringBootTest
class ThucHanhTuan4ApplicationTests {

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@Test
	void Cau1() {
		System.out.println("Câu 1 các chuyến bay đi Đà lạt");
		List<ChuyenBay> chuyenBays = chuyenBayRepository.chuyenBayDaLat();
		System.out.println(chuyenBays);
	}
	
	@Test
	void Cau2() {
		System.out.println("Câu 2 máy bay có tầm bay > 10000");
		List<MayBay> mayBays = mayBayRepository.tamBayLonHon10000();
		System.out.println(mayBays);
	}
	
	@Test
	void Cau3() {
		System.out.println("Câu 3 nhân viên cớ lương < 10000");
		List<NhanVien> nhanViens = nhanVienRepository.nhanVienLuongNhoHon10000();
		System.out.println(nhanViens);
	}
	
	@Test
	void Cau4() {		
		System.out.println("Câu 4 các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km");
		List<ChuyenBay> chuyenBays = chuyenBayRepository.doDaiNhoHon8000LonHon10000();
		System.out.println(chuyenBays);
	}
	
	@Test
	void Cau5() {
		System.out.println("Câu 5 các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV)");
		List<ChuyenBay> chuyenBays = chuyenBayRepository.chuyenBayTuSGDenBMT();
		System.out.println(chuyenBays);
	}
	
	@Test
	void Cau6() {
		System.out.println("Câu 6 Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN)");
		int chuyenBays = chuyenBayRepository.chuyenBayDiTuSG();
		System.out.println("Số chuyến bay đi sg :" + chuyenBays);
	}

	@Test
	void Cau7() {
		System.out.println("Câu 7 Có bao nhiêu loại máy báy Boeing");
		int mayBays = mayBayRepository.loaiMayBayBoeing();
		System.out.println("Loại máy by Boeing : " + mayBays);
	}
	
	@Test
	void Cau8() {
		System.out.println("Câu 8 Tổng số lương phải trả cho các nhân viên");
		int nhanViens = nhanVienRepository.tongLuongNV();
		System.out.println("Tổng số lương phải trả cho các nhân viên : " + nhanViens);
	}
	
	@Test
	void Cau9() {
		System.out.println("Câu 9 mã số của các phi công lái máy báy Boeing");
		List<Integer> nhanViens = nhanVienRepository.maSoPCLaiBoeing();
		System.out.println(nhanViens);
	}
	
	@Test
	void Cau10() {
		System.out.println("Câu 10 Các nhân viên có thể lái máy bay có mã số 747");
		List<NhanVien> nhanViens = nhanVienRepository.nhanVienLaiMB747();
		System.out.println(nhanViens);
	}
	
	@Test
	void Cau11() {
		System.out.println("Câu 11 Mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái");
		List<Integer> mayBays = mayBayRepository.maSoMBDuocLaiNguoiHoNguyen();
		System.out.println(mayBays);
	}
	
	@Test
	void Cau12() {
		System.out.println("Câu 12 mã số của các phi công vừa lái được Boeing vừa lái được Airbus");
		List<Integer> nhanViens = nhanVienRepository.nhanVienLaiBoeingVsAirbus();
		System.out.println(nhanViens);
	}
	
	@Test
	void Cau13() {
		System.out.println("Câu 13 các loại máy bay có thể thực hiện chuyến bay VN280");
		List<MayBay> mayBays = mayBayRepository.thucHienChuyenBayVN280();
		System.out.println(mayBays);
	}

	@Test
	void Cau14() {		
		System.out.println("Câu 14 các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320");
		List<ChuyenBay> chuyenBays = chuyenBayRepository.chuyenBayCoTheBayBoiMayBayAirbusA320();
		System.out.println(chuyenBays);
	}
	
	@Test
	void Cau15() {
		System.out.println("Câu 15 tên của các phi công lái máy bay Boeing");
		List<NhanVien> nhanViens = nhanVienRepository.nhanVienLaiMBBoeing();
		System.out.println(nhanViens);
	}
	
	@Test
	void Cau16() {
		System.out.println("Câu 16 mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó");
		List<String> mayBays = mayBayRepository.Cau16();
		System.out.println(mayBays);
	}
	
	@Test
	void Cau17() {		
		System.out.println("Câu 17 Giả sử một hành khách muốn ñi thẳng từ ga A ñến ga B rồi quay trở về ga A. Cho biết các ñường\n"
				+ "bay nào có thể ñáp ứng yêu cầu này");
		List<ChuyenBay> chuyenBays = chuyenBayRepository.Cau17();
		System.out.println(chuyenBays);
	}
	
	@Test
	void Cau18() {		
		System.out.println("Câu 18 Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó");
		List<String> temp = chuyenBayRepository.Cau18();
		System.out.println(temp);
	}
	@Test
	void Cau19() {		
		System.out.println("Câu 19 Với mỗi ga có chuyến  bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó");
		List<String> temp = chuyenBayRepository.Cau19();
		System.out.println(temp);
	}
	@Test
	void Cau20() {		
		System.out.println("Câu 20 Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00");
		List<ChuyenBay> temp = chuyenBayRepository.Cau20();
		System.out.println(temp);
	}
	@Test
	void Cau21() {		
		System.out.println("Câu 21 Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00");
		List<String> temp = chuyenBayRepository.Cau21();
		System.out.println(temp);
	}
	@Test
	void Cau22() {		
		System.out.println("Câu 22 Cho biết mã số của các phi công chỉ lái được 3 loại máy bay");
		List<Integer> temp = chuyenBayRepository.Cau22();
		System.out.println(temp);
	}
	@Test
	void Cau23() {		
		System.out.println("Câu 23 Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái");
		List<String> temp = chuyenBayRepository.Cau23();
		System.out.println(temp);
	}
	@Test
	void Cau24() {		
		System.out.println("Câu 24 Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái");
		List<String> temp = chuyenBayRepository.Cau24();
		System.out.println(temp);
	}
	@Test
	void Cau25() {		
		System.out.println("Câu 25 Tìm các nhân viên không phải là phi công");
		List<NhanVien> temp = nhanVienRepository.Cau25();
		System.out.println(temp);
	}
	@Test
	void Cau26() {		
		System.out.println("Câu 26 Cho biết mã số của các nhân viên có lương cao nhất");
		List<String> temp = nhanVienRepository.Cau26();
		System.out.println(temp);
	}
	@Test
	void Cau27() {		
		System.out.println("Câu 27 Cho biết tổng số lương phải trả cho các phi công");
		List<Integer> temp = nhanVienRepository.Cau27();
		System.out.println(temp);
	}
	@Test
	void Cau28() {		
		System.out.println("Câu 28 Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing");
		List<ChuyenBay> temp = chuyenBayRepository.Cau28();
		System.out.println(temp);
	}
	
}
