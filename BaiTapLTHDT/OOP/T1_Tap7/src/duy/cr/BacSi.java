/*
*@(#)BacSi.java.java  Nov 21, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package duy.cr;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Set;

/*
* @description:
* @author: Chopper
* @date: Nov 21, 2023
* @version: 1.0
*/

/**
 * 
 */
public class BacSi extends CaNhan{
	private String chuyenmon;
	LocalDate ngayvaolam;
	
	/**
	 * 
	 */
	public BacSi() {
		super();
		chuyenmon = "";
		ngayvaolam = LocalDate.now();
	}
	/**
	 * @param maso
	 * @param hoten
	 * @param dssdt
	 * @param chuyenmon
	 * @param ngayvaolam
	 */
	public BacSi(String maso, String hoten, Set<String> dssdt, LocalDate ngayvaolam,String chuyenmon) {
		super(maso, hoten, dssdt);
		this.chuyenmon = chuyenmon;
		this.ngayvaolam = ngayvaolam;
	}
	/**
	 * @return the chuyenmon
	 */
	public String getChuyenmon() {
		return chuyenmon;
	}
	/**
	 * @param chuyenmon the chuyenmon to set
	 */
	public void setChuyenmon(String chuyenmon) {
		this.chuyenmon = chuyenmon;
	}
	/**
	 * @return the ngayvaolam
	 */
	public LocalDate getNgayvaolam() {
		return ngayvaolam;
	}
	@Override
	public String ghiChu() {
		long nam = ChronoUnit.YEARS.between(ngayvaolam,LocalDate.now());
		String thamnien = "Thâm niên: " + nam + " năm";
		return thamnien;
	}
	@Override
	public String toString() {
		return "Bác sĩ [ "+ super.toString() +", ngayBatDau=" + ngayvaolam + ", linhVucChuyenMon=" + chuyenmon + "]";
	}
}
