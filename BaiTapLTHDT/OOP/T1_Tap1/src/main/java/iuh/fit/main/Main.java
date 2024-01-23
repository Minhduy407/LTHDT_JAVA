package iuh.fit.main;

import java.util.List;
import iuh.fit.cr.CauThu;
import iuh.fit.cr.ChucVu;
import iuh.fit.cr.NhanVien;
import iuh.fit.ql.QuanLyChung;
import iuh.fit.cr.Nguoi;
public class Main {
	public static void main(String[] args) {
		QuanLyChung list = new QuanLyChung();
		List<Nguoi> lists = List.of(
				new CauThu("123","An","0977040502",2000),
				new NhanVien("133","Anh","0668040502",ChucVu.HUAN_LUYEN_VIEN),
				new NhanVien("134","Nga","0966040502",ChucVu.TRO_LY),
				new CauThu("143","Lan","0958040502",1997),
				new CauThu("155","Hue","0944040502",1998)
				);
		
		lists.forEach(x -> list.them(x));
		System.out.println("\t\t====DANH SÁCH NGƯỜI TRONG CLB====\n");
		list.getNguoi().forEach(x -> System.out.println(x));
		
		System.out.println("\t\t====THÊM====\n");
		CauThu x1 = new CauThu("155","Hue","0944040502",1998);
		System.out.println("Thêm: " + list.them(x1));
		
		System.out.println("\t\t====XÓA====\n");
		
		System.out.println("Xóa: " + list.xoa("1234"));
		
		System.out.println("Xóa: " + list.xoa("143"));
		System.out.println("\t\t====DANH SÁCH NGƯỜI TRONG CLB SAU KHI XÓA====\n");
		list.getNguoi().forEach(x -> System.out.println(x));
		
		System.out.println("\t\t====DANH SÁCH CẦU THỦ CÓ THỂ THAM GIA U23====\n");
		list.dsU23(16, 23).forEach(x -> System.out.println(x + "\n"));
		
		
		System.out.println("\t\t====DANH SÁCH CẦU THỦ SẮP XẾP THEO TUỔI GIẢM DẦN====\n");
		list.dssapxep().forEach(x -> System.out.println(x + "\n"));
	}
	
}
