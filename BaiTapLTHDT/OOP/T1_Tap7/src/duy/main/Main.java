/*
*@(#)Main.java.java  Nov 21, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package duy.main;
/*
* @description:
* @author: Chopper
* @date: Nov 21, 2023
* @version: 1.0
*/

/**
 * 
 */

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

import duy.cr.BacSi;
import duy.cr.BenhNhan;
import duy.cr.CaNhan;
import duy.ql.QuanLyBenhVien;



public class Main {
	public static void main(String[] args) {
		
//		2a
		QuanLyBenhVien dsCaNhan = new QuanLyBenhVien();
		
//		2b/
		BenhNhan bn1 = new BenhNhan("001", "Nguyen Huy", new HashSet<>(List.of("0913111222", "0914666777")) , LocalDate.of(1992, 4, 20), "12 Nguyen Van Bao");
		BenhNhan bnx = new BenhNhan("001", "Le Huy Hoàng", null , LocalDate.of(2010, 4, 20), "12 Nguyen Van Bao");//False (Trùng mã)
		BenhNhan bn2 = new BenhNhan("002", "Nguyen Quang", new HashSet<>(List.of("0903555666")) , LocalDate.of(2010, 4, 20), "12 Nguyen Van Bao");
		BenhNhan bn3 = new BenhNhan("003", "Nguyen Hoàng Huy", null , LocalDate.of(2017, 4, 20), "12 Nguyen Van Bao");
		BenhNhan bn4 = new BenhNhan("006", "Nguyen Hoàng Huy", null , LocalDate.of(2015, 4, 20), "12 Nguyen Van Bao");
		BenhNhan bn5 = new BenhNhan("007", "Nguyen Hoàng Huy", null , LocalDate.of(2009, 4, 20), "12 Nguyen Van Bao");
		
		BacSi bs1 = new BacSi("004", "Lê Quoc Huy", new HashSet<>(List.of("0983111555", "0913888999")), LocalDate.of(2015, 2, 1), "Da khoa");
		BacSi bs2 = new BacSi("001", "Lê Quoc Huy", new HashSet<>(List.of("0983111555", "0913888999")), LocalDate.of(2015, 2, 1), "Da khoa"); //False (Trùng mã)
		BacSi bs3 = new BacSi("005", "Trịnh Huy Hoang", new HashSet<>(List.of("0983666555", "0913000999")), LocalDate.of(2013, 8, 1), "Da khoa");
		
		dsCaNhan.themCaNhan(bn1);
		dsCaNhan.themCaNhan(bnx);//False (Trùng mã)
		dsCaNhan.themCaNhan(bn2);
		dsCaNhan.themCaNhan(bn3);
		dsCaNhan.themCaNhan(bn4);
		dsCaNhan.themCaNhan(bn5);
		dsCaNhan.themCaNhan(bs1);
		dsCaNhan.themCaNhan(bs2);//False (Trùng mã)
		dsCaNhan.themCaNhan(bs3);
		
		dsCaNhan.getCaNhans().forEach(x -> System.out.println(x));
		
//		2c
		
		System.out.println("Danh sách sau khi cập nhật ĐIỆN thoại");
		dsCaNhan.themSoDienThoai("003", "028555555");
		dsCaNhan.themSoDienThoai("005", "028000777");
		dsCaNhan.themSoDienThoai("003", "028555555");//False 
		
		dsCaNhan.getCaNhans().forEach(x -> System.out.println(x));
		
//		2d
		System.out.println("Danh sách trẻ em");
		dsCaNhan.getBNTreEm().forEach(x -> System.out.println(x));
		
//		2e
		System.out.println("Số lượng bệnh nhân trẻ em: " + dsCaNhan.getSoLuongBenhNhanTreEm());
		
//		2f
		CaNhan cn = dsCaNhan.getCaNhan("095343434");
		System.out.println("Không tìm thấy : " + cn); //null
		
		CaNhan cn2 = dsCaNhan.getCaNhan("0983666555");
		System.out.println(cn2); 
	}
}

