/*
*@(#)Main.java.java  Dec 1, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.test;
/*
* @description:
* @author: Chopper
* @date: Dec 1, 2023
* @version: 1.0
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import iuh.fit.entity.Employee;
import iuh.fit.entity.Experience;
import iuh.fit.entity.Fresher;
import iuh.fit.entity.Intern;
import iuh.fit.entity.XepLoaiTotNghiep;
import iuh.fit.list.QuanLyNV;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
//		QuanLyNV list = new QuanLyNV();
//		
//		List<Employee> dsnv = List.of(
//				new Fresher("Lam","Tien","003",LocalDate.of(2000, 10, 10),"0403266345",2023,XepLoaiTotNghiep.A),
//				new Fresher("Nguyen","Son","004",LocalDate.of(2000, 10, 10),"0403266345",2022,XepLoaiTotNghiep.B),
//				new Intern("Son","Tung","005",LocalDate.of(2000, 10, 10),"0403266345","CNTT",6),
//				new Experience("Nguyen","Lan","001",LocalDate.of(2000, 10, 10),"0403232345",10),
//				new Experience("Nguyen","Lam","002",LocalDate.of(2000, 10, 10),"0403266345",8)
//				);
//		dsnv.forEach(nv -> list.themnhanvien(nv));
//		
//		System.out.println(list.demsoluongnvtotnghiep(2023));
//		
//		list.getList().forEach(nv -> System.out.println(nv));
//		
//		list.sapxepnhanvien().forEach(nv -> System.out.println(nv));
		
		System.out.println(ChronoUnit.MONTHS.between(LocalDate.of(2024, 10, 10), LocalDate.now()));
	}
}
