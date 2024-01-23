/*
*@(#)QuanLyNhanVien.java.java  Nov 8, 2023
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
* @date: Nov 8, 2023
* @version: 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import iuh.fit.cr.NhanVien;
import iuh.fit.cr.NhanVienKyThuat;

/**
 * 
 */
public class QuanLyNhanVien implements CongTy{
	private List<NhanVien> dsnv;
	
	/**
	 * 
	 */
	public QuanLyNhanVien() {
		dsnv = new ArrayList<>();
	}

	@Override
	public boolean them(NhanVien tmp) {
		return dsnv.add(tmp);
	}

	@Override
	public boolean xoa(String ma) {
		NhanVien tmp = dsnv.stream()
				.filter(x -> x.getManv().equalsIgnoreCase(ma))
				.findFirst()
				.orElse(null);
		if(tmp != null) {
			dsnv.remove(tmp);
			return true;
		}
		return false;
	}

	@Override
	public List<NhanVienKyThuat> trichdsnvkt() {
		return dsnv.stream()
				.filter(x -> x instanceof NhanVienKyThuat)
				.map(x -> (NhanVienKyThuat)x)
				.collect(Collectors.toList());
	}

	@Override
	public List<NhanVien> trichdsnv() {
		return dsnv;
	}

}
