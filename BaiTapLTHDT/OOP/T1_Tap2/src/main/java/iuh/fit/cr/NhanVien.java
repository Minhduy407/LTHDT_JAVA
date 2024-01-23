/*
*@(#)NhanVien.java.java  Nov 8, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.cr;
/*
* @description:
* @author: Chopper
* @date: Nov 8, 2023
* @version: 1.0
*/

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 
 */
public abstract class NhanVien {
	protected String manv;
	protected String tennv;
	protected String honv;
	protected double luong;
	protected ThongTinLienHe thongtin;
	/**
	 * 
	 */
	public NhanVien() {
		this("","","",0.0,new ThongTinLienHe());	
	}


	/**
	 * @param manv
	 * @param tennv
	 * @param honv
	 * @param luong
	 * @param sdt
	 * @param email
	 */
	public NhanVien(String manv, String tennv, String honv, double luong,ThongTinLienHe thongtin) {
		super();
		this.manv = manv;
		this.tennv = tennv;
		this.honv = honv;
		this.luong = luong;
		this.thongtin = thongtin;
	}


	/**
	 * @return the manv
	 */
	public String getManv() {
		return manv;
	}


	/**
	 * @param manv the manv to set
	 */
	public void setManv(String manv) {
		this.manv = manv;
	}


	/**
	 * @return the tennv
	 */
	public String getTennv() {
		return tennv;
	}


	/**
	 * @param tennv the tennv to set
	 */
	public void setTennv(String tennv) {
		this.tennv = tennv;
	}


	/**
	 * @return the honv
	 */
	public String getHonv() {
		return honv;
	}


	/**
	 * @param honv the honv to set
	 */
	public void setHonv(String honv) {
		this.honv = honv;
	}


	/**
	 * @return the luong
	 */
	public double getLuong() {
		return luong;
	}


	/**
	 * @param luong the luong to set
	 */
	public void setLuong(double luong) {
		this.luong = luong;
	}



	@Override
	public int hashCode() {
		return Objects.hash(manv);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(manv, other.manv);
	}
	
	public abstract double tinhluong();


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VNĐ");
		return "\nMã nhân viên: " + manv + "\nTên nhân viên: " + tennv + "\nHọ: " + honv + "\nLương : " + df.format(tinhluong()) ;
	}
	
	
	
}
