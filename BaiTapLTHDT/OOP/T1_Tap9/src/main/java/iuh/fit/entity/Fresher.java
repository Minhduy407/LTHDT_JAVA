/*
*@(#)Fresher.java.java  Dec 1, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.entity;
/*
* @description:
* @author: Chopper
* @date: Dec 1, 2023
* @version: 1.0
*/

import java.time.LocalDate;

/**
 * 
 */
public class Fresher extends Employee{
	private int namtotnghiep;
	private XepLoaiTotNghiep xeploaitotnghiep;
	
	/**
	 * @param ho
	 * @param ten
	 * @param ma
	 * @param ngaysinh
	 * @param sodienthoai
	 * @param namtotnghiep
	 * @param xeploaitotnghiep
	 */
	public Fresher(String ho, String ten, String ma, LocalDate ngaysinh, String sodienthoai, int namtotnghiep,
			XepLoaiTotNghiep xeploaitotnghiep) {
		super(ho, ten, ma, ngaysinh, sodienthoai);
		setNamtotnghiep(namtotnghiep);
		this.xeploaitotnghiep = xeploaitotnghiep;
	}
	/**
	 * @return the namtotnghiep
	 */
	public int getNamtotnghiep() {
		return namtotnghiep;
	}
	/**
	 * @param namtotnghiep the namtotnghiep to set
	 */
	public void setNamtotnghiep(int namtotnghiep) {
		if(namtotnghiep > LocalDate.now().getYear())
			throw new IllegalArgumentException("Nam tot nghiep phai <= nam hien tai");
		this.namtotnghiep = namtotnghiep;
	}
	/**
	 * @return the xeploaitotnghiep
	 */
	public XepLoaiTotNghiep getXeploaitotnghiep() {
		return xeploaitotnghiep;
	}
	/**
	 * @param xeploaitotnghiep the xeploaitotnghiep to set
	 */
	public void setXeploaitotnghiep(XepLoaiTotNghiep xeploaitotnghiep) {
		this.xeploaitotnghiep = xeploaitotnghiep;
	}
	
	@Override
	public String toString() {
		return "Fresher" + super.toString() + ", namtotnghiep=" + namtotnghiep + ", xeploaitotnghiep=" + xeploaitotnghiep + "]";
	}
}
