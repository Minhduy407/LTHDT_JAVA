/*
*@(#)BenhNhan.java.java  Nov 21, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package duy.cr;
/*
* @description:
* @author: Chopper
* @date: Nov 21, 2023
* @version: 1.0
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Set;

/**
 * 
 */
public class BenhNhan extends CaNhan{
	private String diachi;
	LocalDate ngaysinh; 
	
	/**
	 * 
	 */
	public BenhNhan() {
		super();
		diachi = "";
		ngaysinh = LocalDate.now();
	}
	/**
	 * @param maso
	 * @param hoten
	 * @param dssdt
	 * @param diachi
	 * @param ngaysinh
	 */
	public BenhNhan(String maso, String hoten, Set<String> dssdt, LocalDate ngaysinh,String diachi) {
		super(maso, hoten, dssdt);
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
	}
	/**
	 * @return the diachi
	 */
	public String getDiachi() {
		return diachi;
	}
	/**
	 * @param diachi the diachi to set
	 */
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	/**
	 * @return the ngaysinh
	 */
	public LocalDate getNgaysinh() {
		return ngaysinh;
	}
	@Override
	public String ghiChu() {
		long tuoi = ChronoUnit.YEARS.between(ngaysinh,LocalDate.now());
		if(tuoi < 16)
			return "Trẻ em";
		return "";
	}
		
	@Override
	public String toString() {
		return "Bệnh Nhân [" +super.toString()+ ", ngaySinh=" + ngaysinh + ", diaChi=" + diachi + "]";
	}
}
