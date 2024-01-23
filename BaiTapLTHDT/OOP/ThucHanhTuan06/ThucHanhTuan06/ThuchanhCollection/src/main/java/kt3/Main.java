package kt3;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		dssv.themSinhVien(new SinhVien("11111111", "Lê", "Lan","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111112", "Lê", "Hoa","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111113", "Lê", "lan","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111114", "Lê", "Hồng","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111115", "Lê", "NGa","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111116", "Lê", "NGa","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111117", "Lê", "Lan","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111118", "Lê", "Hoa","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111119", "Lê", "NGa","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111120", "Lê", "Hoang","Nam", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		
//		Arrays.stream(dssv.getDssv()).forEach(x -> System.out.println(x));
		Arrays.stream(dssv.getTenPhoBien()).forEach(x -> System.out.println(x));
	}
}
