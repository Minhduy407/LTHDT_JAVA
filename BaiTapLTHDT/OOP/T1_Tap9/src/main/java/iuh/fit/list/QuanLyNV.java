/*
*@(#)QuanLyNV.java.java  Dec 1, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import iuh.fit.entity.Employee;
import iuh.fit.entity.Experience;
import iuh.fit.entity.Fresher;

/*
* @description:
* @author: Chopper
* @date: Dec 1, 2023
* @version: 1.0
*/

/**
 * 
 */
public class QuanLyNV {
	private List<Employee> list;
	
	/**
	 * 
	 */
	public QuanLyNV() {
		list = new ArrayList<>();
	}


	/**
	 * @return the list
	 */
	public List<Employee> getList() {
		return list;
	}


	public boolean themnhanvien(Employee nv) {
		if(list.contains(nv))
			return false;
		list.add(nv);
		return true;
	}
	
	public long demsoluongnvtotnghiep(int nam) {
		return list.stream()
				.filter(nv -> nv instanceof Fresher)
				.filter(nv -> ((Fresher)nv).getNamtotnghiep() == nam)
				.count();
	}
	
	public boolean suangaysinhnhanvien(String ma,LocalDate ns) {
		Employee emp = list.stream()
				.filter(nv -> nv.getMa().equalsIgnoreCase(ma))
				.findFirst()
				.orElse(null);
		if(!list.contains(emp))
			return false;
		list.get(list.indexOf(emp)).setNgaysinh(ns);
		return true;
	}
	
	public Set<Employee> trichdanhsachnvcokn(int nam){
		return list.stream()
				.filter(nv -> nv instanceof Experience)
				.filter(nv -> ((Experience)nv).getSonamkinhnghiem() > 5)
				.collect(Collectors.toSet());
	}
	
	public Set<Employee> sapxepnhanvien(){
		return list.stream()
				.collect(Collectors.toCollection(
						() -> new TreeSet<>(Comparator.comparing(Employee::getMa))
						));
	}
}
