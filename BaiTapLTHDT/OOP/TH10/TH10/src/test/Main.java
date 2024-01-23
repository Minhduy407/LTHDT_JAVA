package test;

import java.text.DecimalFormat;
import java.time.LocalDate;

import danhsach.DanhSachNhanVien;
import entity.NVBanThoiGian;
import entity.NVVanPhong;

public class Main {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		
//		2a
		DanhSachNhanVien dsnv = new DanhSachNhanVien();
		
//		2b.		
		dsnv.themNhanVien(new NVVanPhong("NV1", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), "Quản Lý", 3.33));
		dsnv.themNhanVien(new NVVanPhong("NV3", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), "Quản lý", 3.33));
		dsnv.themNhanVien(new NVVanPhong("NV4", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), "Quản lý", 3.33));
//		dsnv.themNhanVien(new NVVanPhong("NV2", "Le Lan", "0903111222", LocalDate.of(2024, 1, 1), "Nhân viên", 3.33)); //Exception
		dsnv.themNhanVien(new NVVanPhong("NV2", "Le Lan", "0903111222", LocalDate.of(2023, 1, 1), "Nhân viên", 3.33));
//		dsnv.themNhanVien(new NVBanThoiGian("NV3", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 20)); //Exception
//		dsnv.themNhanVien(new NVBanThoiGian("NV4", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 90)); //False
		dsnv.themNhanVien(new NVBanThoiGian("NV8", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 90));
		dsnv.themNhanVien(new NVBanThoiGian("NV7", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 100));
//		dsnv.themNhanVien(new NVBanThoiGian("NV5", "Le Lan", "0903111222", LocalDate.of(2021, 1, 1), 130)); //Exception
		
//		2c
//		boolean rs = dsnv.capNhatSoGio("NV4", 150); //False
		boolean rs = dsnv.capNhatSoGio("NV8", 120); //True
		System.out.println(rs);
//		
		dsnv.getDsnv().forEach(x -> System.out.println(x));
		
//		2d
		dsnv.getTongLuongTheoLoaiNV().entrySet().stream().forEach(x -> {
			System.out.println("Loại nhân viên: " + x.getKey());
			System.out.println("Tổng lương: " + df.format(x.getValue()));
			System.out.println("====");
		});
		
//		2e
		
		dsnv.getDSNVVanPhong("Quản lý").forEach(nv -> System.out.println(nv));
//		2f
		dsnv.getSoNVTheoChucVu().entrySet().stream().forEach(x -> {
			System.out.println("Chức vụ: " + x.getKey());
			System.out.println("Tổng số nhân viên: " + x.getValue());
			System.out.println("====");
		});
	}
}
