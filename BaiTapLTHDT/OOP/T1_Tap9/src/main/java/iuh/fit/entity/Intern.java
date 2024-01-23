/*
*@(#)Intern.java.java  Dec 1, 2023
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
public class Intern extends Employee{
	private String chuyennganh;
	private int hockidanghoc;
	
	/**
	 * 
	 */
	public Intern() {
		super();
		chuyennganh = "No name";
		hockidanghoc = 6;
	}
	/**
	 * @param ho
	 * @param ten
	 * @param ma
	 * @param ngaysinh
	 * @param sodienthoai
	 * @param chuyennganh
	 * @param hockidanghoc
	 */
	public Intern(String ho, String ten, String ma, LocalDate ngaysinh, String sodienthoai, String chuyennganh,
			int hockidanghoc) {
		super(ho, ten, ma, ngaysinh, sodienthoai);
		setChuyennganh(chuyennganh);
		setHockidanghoc(hockidanghoc);
	}
	/**
	 * @return the chuyennganh
	 */
	public String getChuyennganh() {
		return chuyennganh;
	}
	/**
	 * @param chuyennganh the chuyennganh to set
	 */
	public void setChuyennganh(String chuyennganh) {
		if(chuyennganh.isEmpty())
			throw new IllegalArgumentException("Chuyen nganh khong duoc de rong");
		this.chuyennganh = chuyennganh;
	}
	/**
	 * @return the hockidanghoc
	 */
	public int getHockidanghoc() {
		return hockidanghoc;
	}
	/**
	 * @param hockidanghoc the hockidanghoc to set
	 */
	public void setHockidanghoc(int hockidanghoc) {
		if(hockidanghoc  < 6 || hockidanghoc > 10)
			throw new IllegalArgumentException("Hoc ki dang hoc >= 6 va <= 10");
		this.hockidanghoc = hockidanghoc;
	}
	@Override
	public String toString() {
		return "Intern" + super.toString() + ", chuyennganhdanghoc=" + chuyennganh + ", hockidanghoc=" + hockidanghoc + "]";
	}
	
}	
