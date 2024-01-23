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

import java.time.LocalDate;
import java.util.List;

import iuh.fit.cr.SoCoKH;
import iuh.fit.cr.SoKKH;
import iuh.fit.cr.TienGoiTK;
import iuh.fit.ql.QuanLySoTK;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		QuanLySoTK list = new QuanLySoTK();
		
		List <TienGoiTK> ds = List.of(
				new SoCoKH("01239", "123456789", "Lan", 100000000, LocalDate.of(2003, 11, 11), 0.06, 6),
				new SoCoKH("04239", "123456789", "Hue", 100000000, LocalDate.of(2000, 10, 11), 0.06, 12),
				new SoCoKH("05239", "123456789", "Tien", 250000000, LocalDate.of(2023, 10, 12), 0.06, 4),
				new SoKKH("01639", "123456789", "Khanh", 450000000, LocalDate.of(2010, 11, 11), 0.07),
				new SoKKH("01739", "123456789", "Lanh", 200000000, LocalDate.of(2003, 11, 11), 0.07)
				);
		
		ds.forEach(x -> list.them(x));
		
		System.out.println("\n\t\t====DANH SÁCH CÁC SỔ CÓ KỲ HẠN CÓ SỐ TIỀN GỞI LỚN====\n");
		list.trichdscotglon().forEach(x -> System.out.println(x));
		
		System.out.println("\n\t\t====DANH SÁCH CÁC SỔ ĐƯỢC LẬP THÁNG 11/2003====\n");
		list.trichdsmo(11,2003).forEach(x -> System.out.println(x));
		
		System.out.println("\n\t\t====DANH SÁCH CÁC SỔ ĐÃ ĐƯỢC SẮP XẾP====\n");
		list.sapxepds().forEach(x -> System.out.println(x));
	}
}
