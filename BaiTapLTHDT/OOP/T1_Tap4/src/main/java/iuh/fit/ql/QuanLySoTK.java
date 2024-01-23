/*
*@(#)QuanLySoTK.java.java  Nov 11, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.ql;
/*
* @description:
* @author: Chopper
* @date: Nov 11, 2023
* @version: 1.0
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import iuh.fit.cr.SoCoKH;
import iuh.fit.cr.TienGoiTK;

/**
 * 
 */
public class QuanLySoTK {
	private List<TienGoiTK> dss;

	/**
	 * @param dss
	 */
	public QuanLySoTK() {
		this.dss = new ArrayList<>();
	}

	/**
	 * @return the dss
	 */
	public List<TienGoiTK> getDss() {
		return dss;
	}
	
	public boolean them(TienGoiTK x) {
		return dss.add(x);
	}

	public List<TienGoiTK> trichdscotglon(){
		long[] listm = dss.stream()
				.filter(ds -> ds instanceof SoCoKH)
				.mapToLong(TienGoiTK::getStg)
				.toArray();
		long max = Arrays.stream(listm).max().getAsLong();
		return dss.stream()
				.filter(x -> x instanceof SoCoKH)
				.filter(s -> ((SoCoKH)s).getStg() == max)
				.toList();
	}
	
	public List<TienGoiTK> trichdsmo(int thang,int nam){
		return dss.stream()
				.filter(so -> so.getNgayls().getMonthValue() == thang && so.getNgayls().getYear() == nam)
				.toList();
	}
	
	public Set<TienGoiTK> sapxepds(){
		return dss.stream()
				.sorted(Comparator.comparing(TienGoiTK::getNgayls).reversed())
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}
}
