/*
*@(#)QuanLyGH.java.java  Nov 11, 2023
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
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import iuh.fit.cr.GHTuan;
import iuh.fit.cr.GianHang;

/**
 * 
 */
public class QuanLyGH {
	private List<GianHang> dsgh;

	/**
	 * @param dsgh
	 */
	public QuanLyGH(){
		this.dsgh = new ArrayList<>();
	}

	/**
	 * @return the dsgh
	 */
	public List<GianHang> getDsgh() {
		return dsgh;
	}
	
	public boolean themGH(GianHang x) {
		return dsgh.add(x);
	}
	
	public GianHang timGH(String magh) {
		return dsgh.stream()
				.filter(gh -> gh.getMaGH().equalsIgnoreCase(magh))
				.findFirst()
				.orElse(null);
	}
	
	public Set<GianHang> sapxepGH(){
		return dsgh.stream()
				.sorted(Comparator.comparing(GianHang::getGiathue))
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}
	
	public List<GianHang> trichdsGHthue(int sotuan) {
		return dsgh.stream()
				.filter(gh -> ((GHTuan)gh).getSotuanthue() > sotuan)
				.toList();
	}
}
