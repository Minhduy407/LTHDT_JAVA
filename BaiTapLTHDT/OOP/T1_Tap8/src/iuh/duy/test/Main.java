/*
*@(#)Main.java.java  Nov 22, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.duy.test;

import java.text.DecimalFormat;
import java.time.LocalDate;

import iuh.duy.entity.ChucVu;
import iuh.duy.entity.NhanVienLamTheoGio;
import iuh.duy.entity.NhanVienToanThoiGian;
import iuh.duy.list.QuanLyNhanVien;

/*
* @description:
* @author: Chopper
* @date: Nov 22, 2023
* @version: 1.0
*/

/**
 * 
 */
public class Main {
public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		
//		2a
		QuanLyNhanVien dsnv = new QuanLyNhanVien();
		
//		2b.		
		dsnv.themnhanvien(new NhanVienToanThoiGian("NV1", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), ChucVu.QUAN_LY, 3.33));
		dsnv.themnhanvien(new NhanVienToanThoiGian("NV3", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), ChucVu.QUAN_LY, 3.33));
		dsnv.themnhanvien(new NhanVienToanThoiGian("NV4", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), ChucVu.QUAN_LY, 3.33));
//		dsnv.themnhanvien(new NhanVienToanThoiGian("NV2", "Le Lan", "0903111222", LocalDate.of(2024, 1, 1), ChucVu.NHAN_VIEN, 3.33)); //Exception
		dsnv.themnhanvien(new NhanVienToanThoiGian("NV2", "Le Lan", "0903111222", LocalDate.of(2023, 1, 1), ChucVu.NHAN_VIEN, 3.33));
//		dsnv.themnhanvien(new NhanVienLamTheoGio("NV3", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 20)); //Exception
//		System.out.println(dsnv.themnhanvien(new NhanVienLamTheoGio("NV4", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 90))); //False
		dsnv.themnhanvien(new NhanVienLamTheoGio("NV8", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 90));
		dsnv.themnhanvien(new NhanVienLamTheoGio("NV7", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 100));
//		dsnv.themnhanvien(new NhanVienLamTheoGio("NV5", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 130)); //Exception
		
//		2c
//		boolean rs = dsnv.capnhatgiolam("NV4", 150); //False
		boolean rs = dsnv.capnhatgiolam("NV8", 120); //True
		System.out.println(rs);
//		
		dsnv.getDsnv().forEach(x -> System.out.println(x));
		
//		2d
		dsnv.tinhtongtienluongtheotungloai().entrySet().stream().forEach(x -> {
			System.out.println("Loại nhân viên: " + x.getKey());
			System.out.println("Tổng lương: " + df.format(x.getValue()));
			System.out.println("====");
		});
		
//		2e
		
		dsnv.trichdsnvQL(ChucVu.QUAN_LY).forEach(nv -> System.out.println(nv));
//		2f
		dsnv.thongkenhanvien().entrySet().stream().forEach(x -> {
			System.out.println("Chức vụ: " + x.getKey());
			System.out.println("Tổng số nhân viên: " + x.getValue());
			System.out.println("====");
		});
	}
}
