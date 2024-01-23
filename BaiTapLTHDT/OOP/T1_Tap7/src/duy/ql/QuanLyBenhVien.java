/*
*@(#)QuanLyBenhVien.java.java  Nov 21, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package duy.ql;
/*
* @description:
* @author: Chopper
* @date: Nov 21, 2023
* @version: 1.0
*/

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import duy.cr.BenhNhan;
import duy.cr.CaNhan;

/**
 * 
 */
public class QuanLyBenhVien {
	private List<CaNhan> ds;
	
	public QuanLyBenhVien() {
		ds = new LinkedList<>();
	}
	
	public List<CaNhan> getCaNhans(){
		return ds;
	} 
	
	public boolean themCaNhan(CaNhan canhan) {
		if(canhan == null)
			return false;
		if(ds.contains(canhan))
			return false;
		ds.add(canhan);
		return true;
	}
	
	public boolean themSoDienThoai(String maso,String sdtmoi) {
		CaNhan canhan = ds.stream()
				.filter(cn -> cn.getMaso().equalsIgnoreCase(maso))
				.findFirst()
				.orElse(null);
		if(canhan == null || sdtmoi == null) 
			return false;
		Set<String> dssdt = null;
		if(canhan.getDssdt() == null)
			dssdt = new HashSet<String>(List.of(sdtmoi));
		else {
			dssdt = canhan.getDssdt();
			dssdt.add(sdtmoi);
		}
		canhan.setDssdt(dssdt);
		return true;
	}
	
	public List<CaNhan> getBNTreEm(){
		return ds.stream()
				.filter(cn -> cn instanceof BenhNhan)
				.filter(cn -> cn.ghiChu().equalsIgnoreCase("Trẻ em"))
				.map(cn -> (BenhNhan)cn)
				.sorted(Comparator.comparing(BenhNhan::getNgaysinh))
				.collect(Collectors.toList());
	}
	
	public int getSoLuongBenhNhanTreEm() {
		return (int)ds.stream()
				.filter(cn -> cn instanceof BenhNhan)
				.filter(cn -> cn.ghiChu().equalsIgnoreCase("Trẻ em"))
				.count();
	}
	
	public CaNhan getCaNhan(String sdt) {
		return ds.stream()
		.filter(cn -> cn.getDssdt() != null && cn.getDssdt().contains(sdt))
		.findFirst()
		.orElse(null);
	}
}
