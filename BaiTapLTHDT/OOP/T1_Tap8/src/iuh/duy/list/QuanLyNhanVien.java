/*
*@(#)QuanLyNhanVien.java.java  Nov 22, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.duy.list;
/*
* @description:
* @author: Chopper
* @date: Nov 22, 2023
* @version: 1.0
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import iuh.duy.entity.ChucVu;
import iuh.duy.entity.NhanVien;
import iuh.duy.entity.NhanVienLamTheoGio;
import iuh.duy.entity.NhanVienToanThoiGian;

/**
 * 
 */
public class QuanLyNhanVien {
	private List<NhanVien> dsnv;
	/**
	 * 
	 */
	public QuanLyNhanVien() {
		dsnv = new ArrayList<>();
	}

	/**
	 * @return the dsnv
	 */
	public final List<NhanVien> getDsnv() {
		return dsnv;
	}

	/**
	 * @param dsnv the dsnv to set
	 */
	public boolean themnhanvien(NhanVien nv) {
		if(nv == null)
			return false;
		if(dsnv.contains(nv))
			return false;
		dsnv.add(nv);
		return true;
	}
	
	public boolean capnhatgiolam(String ma,int giolammoi) {
		NhanVien tmp = dsnv.stream()
				.filter(nv -> nv instanceof NhanVienLamTheoGio)
				.filter(nv -> nv.getMaso().equalsIgnoreCase(ma))
				.findFirst()
				.orElse(null);
		if(tmp == null)
			return false;
		((NhanVienLamTheoGio)dsnv.get(dsnv.indexOf(tmp))).setSogiolam(giolammoi);
		return true;
	}
	
	public Map<String, Double> tinhtongtienluongtheotungloai(){
		return dsnv.stream()
				.collect(Collectors.groupingBy(nv -> nv.getClass().getSimpleName(),Collectors.summingDouble(NhanVien::tinhtienluong)));
	}
	
	public Set<NhanVien> trichdsnvQL(ChucVu chucvu){
		return dsnv.stream()
				.filter(nv -> nv instanceof NhanVienToanThoiGian)
				.filter(nv -> ((NhanVienToanThoiGian)nv).getChucvu().equals(chucvu))
				.sorted(Comparator.comparing(NhanVien::tinhtienluong))
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}
	
	public Map<Object, Long> thongkenhanvien(){
		return dsnv.stream()
				.filter(nv -> nv instanceof NhanVienToanThoiGian)
				.map(nv -> ((NhanVienToanThoiGian)nv).getChucvu())
				.collect(Collectors.groupingBy(x -> x.getChucvu().toUpperCase(),Collectors.counting()));
	}
}
