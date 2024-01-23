/*
*@(#)Main.java.java  Nov 11, 2023
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
* @date: Nov 11, 2023
* @version: 1.0
*/

import java.util.List;
import java.util.Scanner;

import iuh.fit.cr.GHThang;
import iuh.fit.cr.GHTuan;
import iuh.fit.cr.GianHang;
import iuh.fit.cr.ViTri;
import iuh.fit.ql.QuanLyGH;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		QuanLyGH list = new QuanLyGH();
		
		List<GianHang> ds = List.of(
					new GHThang("A2",20, ViTri.MAT_TIEN, 7000000, 5),
					new GHThang("A5",30, ViTri.MAT_TIEN, 10000000, 3),
					new GHTuan("A8",25, ViTri.MAT_TIEN, 2500000, 2),
					new GHTuan("B2",20, ViTri.MAT_HAU, 2000000, 8)
				);
		ds.forEach(gh -> list.themGH(gh));
		
		int chon;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("\n\t\t====MENU====");
				System.out.println("1. Thêm một gian hàng vào danh sách");
				System.out.println("2. Tìm gian hàng theo mã");
				System.out.println("3. Sắp xếp gian hàng theo tiền thuê");
				System.out.println("4. Trích danh sách gian hàng thuê theo tuần có số tuần thuê trên 4");
				System.out.println("0. Thoát");
				System.out.println("Chọn------>");
				chon = sc.nextInt();
				sc.nextLine();
				switch(chon) {
				case 1 ->{
					System.out.println("\n\t\t====THÊM MỘT GIAN HÀNG====");
					System.out.println("Nhập mã gian hàng vào: ");
					String ma = sc.nextLine();
					System.out.println("Nhập diện tích: ");
					double dt = sc.nextDouble();
					System.out.println("Nhập loại vị trí vào đây (1.Mặt tiền/2.Mặt hậu): ");
					int loai = sc.nextInt();
					System.out.println("Nhập giá tiền thuê vào đây: ");
					long gia = sc.nextLong();
					System.out.println("Nhập loại thuê (1.Theo tháng/2.Theo tuần): ");
					int lt = sc.nextInt();
					if(lt == 1) {
						System.out.println("Nhập số tháng thuê: ");
						int thang = sc.nextInt();
						if(loai == 1) {
							GHThang new_gh = new GHThang(ma, dt, ViTri.MAT_TIEN, gia, thang);
							list.themGH(new_gh);
						}
						GHThang new_gh = new GHThang(ma, dt, ViTri.MAT_HAU, gia, thang);
						list.themGH(new_gh);
					}
					else {
						System.out.println("Nhập số tuần thuê: ");
						int tuan = sc.nextInt();
						if(loai == 1) {
							GHTuan new_gh = new GHTuan(ma, dt, ViTri.MAT_TIEN, gia, tuan);
							list.themGH(new_gh);
						}
						GHTuan new_gh = new GHTuan(ma, dt, ViTri.MAT_HAU, gia, tuan);
						list.themGH(new_gh);
					}
				}
				case 2 ->{
					System.out.println("\n\t\t====TÌM GIAN HÀNG====");
					System.out.println("Nhập vào mã gian hàng cần tìm: ");
					String ma = sc.nextLine();
					GianHang tmp = list.timGH(ma);
					if(tmp != null)
						System.out.println(tmp);
					else
						System.out.println("Không tìm thấy gian hàng có mã này!");
				}
				case 3 ->{
					System.out.println("\n\t\t====SẮP XẾP GIAN HÀNG====");
					list.sapxepGH().forEach(gh -> System.out.println(gh));
				}
				case 4 ->{
					System.out.println("\n\t\t====TRÍCH DANH SÁCH GIAN HÀNG CÓ SỐ TUẦN THUÊ TRÊN 4====");
					list.trichdsGHthue(4).forEach(gh -> System.out.println(gh)); 
				}
				}
			}while(chon != 0);
		}
		System.out.println("\n\t\t====KẾT THÚC CHƯƠNG TRÌNH====");
	}
}
