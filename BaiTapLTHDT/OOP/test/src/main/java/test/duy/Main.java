package test.duy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		dssv.themSinhVien(new SinhVien("11111123", "Lê", "Lan","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.LIEN_THONG));
		dssv.themSinhVien(new SinhVien("11111112", "Lê", "Hoa","Nữ", LocalDate.now(), "DHKTPM18B", 9.5f, HeDaoTao.LIEN_THONG));
		dssv.themSinhVien(new SinhVien("11111113", "Lê", "lan","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111114", "Lê", "Hong","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.LIEN_KET));
		dssv.themSinhVien(new SinhVien("11111115", "Lê", "NGa","Nữ", LocalDate.now(), "DHKTPM18B", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111116", "Lê", "NGa","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.LIEN_KET));
		dssv.themSinhVien(new SinhVien("11111117", "Lê", "Lan","Nữ", LocalDate.now(), "DHKTPM18B", 9.5f, HeDaoTao.CHINH_QUY));
		dssv.themSinhVien(new SinhVien("11111118", "Lê", "Hoa","Nữ", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.LIEN_KET));
		dssv.themSinhVien(new SinhVien("11111119", "Lê", "NGa","Nữ", LocalDate.now(), "DHKTPM18B", 9.5f, HeDaoTao.LIEN_KET));
		dssv.themSinhVien(new SinhVien("12312358", "Lê", "Hoang","Nam", LocalDate.now(), "DHKTPM18A", 9.5f, HeDaoTao.CHINH_QUY));
		
		Arrays.stream(dssv.locten()).sorted().forEach(x -> System.out.println(x));
		dssv.doiLop("DHKTPM18B", "DHKTPM18A");
		dssv.doihedaotao(HeDaoTao.CHINH_QUY, HeDaoTao.TU_XA);
		SinhVien[] xs = dssv.getDssv();
		for(SinhVien x : xs) {
			System.out.println(x);
		}

		System.out.println(ChronoUnit.DAYS.between(LocalDate.now(),LocalDate.of(2023,10,16)));
	}
}
