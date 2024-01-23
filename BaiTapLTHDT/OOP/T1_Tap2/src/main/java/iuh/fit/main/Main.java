/*
*@(#)Main.java.java  Nov 8, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.main;
/*
* @description:
* @author: Chopper
* @date: Nov 8, 2023
* @version: 1.0
*/

import java.util.List;

import iuh.fit.cr.DanhGia;
import iuh.fit.cr.NhanVien;
import iuh.fit.cr.NhanVienBanHang;
import iuh.fit.cr.NhanVienKyThuat;
import iuh.fit.cr.ThongTinLienHe;
import iuh.fit.ql.QuanLyNhanVien;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		QuanLyNhanVien list = new QuanLyNhanVien();
		
		List<NhanVien> ds = List.of(
					new NhanVienBanHang("150", "An", "Nguyen", 10000000,new ThongTinLienHe("0905789654","an15@gmail.com"), 2000000),
					new NhanVienBanHang("155", "Lan", "Nguyen", 14000000,new ThongTinLienHe("0905989654","lan135@gmail.com"), 50000000),
					new NhanVienBanHang("176", "Hue", "Nguyen", 12000000,new ThongTinLienHe("0905889654","hue65@gmail.com"), 60000000),
					new NhanVienKyThuat("190", "Anh", "Nguyen", 15000000,new ThongTinLienHe("0945689654","anh125@gmail.com"), DanhGia.KHONG_VI_PHAM),
					new NhanVienKyThuat("140", "Khang", "Le", 25000000,new ThongTinLienHe("0945689654","khang525@gmail.com"), DanhGia.VI_PHAM),
					new NhanVienKyThuat("160", "Khanh", "Le", 35000000,new ThongTinLienHe("0945689654","khanh325@gmail.com"), DanhGia.KHONG_VI_PHAM)
				);
		
		ds.forEach(x -> list.them(x));
		
		System.out.println("\t\t====DANH SÁCH NHÂN VIÊN TRONG CÔNG TY====\n");
		list.trichdsnv().forEach(x -> System.out.println(x + "\n"));
		
		System.out.println("\t\t====XÓA====\n");
		
		System.out.println("Xóa thành công: " + list.xoa("150"));
		System.out.println("Xóa không thành công: " + list.xoa("1500"));
		
		System.out.println("\t\t====DANH SÁCH NHÂN VIÊN TRONG CÔNG TY SAU KHI XÓA====\n");
		list.trichdsnv().forEach(x -> System.out.println(x + "\n"));
	
		System.out.println("\t\t====DANH SÁCH NHÂN VIÊN KỸ THUẬT TRONG CÔNG TY====\n");
		list.trichdsnvkt().forEach(x -> System.out.println(x + "\n"));
	
		System.out.println("\t\t====THÊM====\n");
		
		NhanVienBanHang tmp1 = new NhanVienBanHang("155", "Lan", "Nguyen", 14000000,new ThongTinLienHe("0905989654","lan135@gmail.com"), 50000000);
		System.out.println("Thêm không thành công: " + list.them(tmp1));

		NhanVienBanHang tmp2 = new NhanVienBanHang("255", "Kan", "Nguyen", 14000000,new ThongTinLienHe("0905989654","kan1353@gmail.com"), 50000000);
		System.out.println("Thêm thành công: " + list.them(tmp2));
		
		System.out.println("\t\t====DANH SÁCH NHÂN VIÊN TRONG CÔNG TY SAU KHI THÊM====\n");
		list.trichdsnv().forEach(x -> System.out.println(x + "\n"));
	}
}
