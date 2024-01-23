/*
*@(#)NhanVien.java.java  Nov 22, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.duy.entity;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
* @description:
* @author: Chopper
* @date: Nov 22, 2023
* @version: 1.0
*/

/**
 * 
 */
public abstract class NhanVien {
	protected String maso;
	protected String hoten;
	protected String sodienthoai;
	LocalDate ngayvaolam;
	
	/**
	 * 
	 */
	public NhanVien() {
		this("","","",LocalDate.now());
	}
	/**
	 * @param maso
	 * @param hoten
	 * @param sodienthoai
	 * @param ngayvaolam
	 */
	public NhanVien(String maso, String hoten, String sodienthoai, LocalDate ngayvaolam) {
		super();
		this.maso = maso;
		this.hoten = hoten;
		this.sodienthoai = sodienthoai;
		setNgayvaolam(ngayvaolam);
	}
	/**
	 * @return the maso
	 */
	public final String getMaso() {
		return maso;
	}
	/**
	 * @param maso the maso to set
	 */
	public final void setMaso(String maso) {
		this.maso = maso;
	}
	/**
	 * @return the hoten
	 */
	public final String getHoten() {
		return hoten;
	}
	/**
	 * @param hoten the hoten to set
	 */
	public final void setHoten(String hoten) {
		this.hoten = hoten;
	}
	/**
	 * @return the sodienthoai
	 */
	public final String getSodienthoai() {
		return sodienthoai;
	}
	/**
	 * @param sodienthoai the sodienthoai to set
	 */
	public final void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	/**
	 * @return the ngayvaolam
	 */
	public final LocalDate getNgayvaolam() {
		return ngayvaolam;
	}
	/**
	 * @param ngayvaolam the ngayvaolam to set
	 */
	public final void setNgayvaolam(LocalDate ngayvaolam) {
		if(ngayvaolam.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("Ngày vào làm phải trước hoặc bằng ngày hiện tại!");
		this.ngayvaolam = ngayvaolam;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maso == null) ? 0 : maso.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		NhanVien other = (NhanVien) obj;
		if (maso == null) {
			if (other.maso != null)
				return false;
		} else if (!maso.equalsIgnoreCase(other.maso))
			return false;
		return true;
	}
	public abstract double tinhtienluong();
	@Override
	public String toString() {
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.0 VNĐ");
		return " [maso=" + maso + ", hoten=" + hoten + ", sodienthoai=" + sodienthoai + ", ngayvaolam="
				+ df1.format(ngayvaolam) + ", tinhtienluong()=" + df.format(tinhtienluong());
	}
	
}
