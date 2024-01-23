/*
*@(#)ChucVu.java.java  Nov 22, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.duy.entity;
/*
* @description:
* @author: Chopper
* @date: Nov 22, 2023
* @version: 1.0
*/

/**
 * 
 */
public enum ChucVu {
	NHAN_VIEN("Nhân viên"),QUAN_LY("Quản lý");
	
	private final String chucvu;

	/**
	 * @param chucvu
	 */
	private ChucVu(String chucvu) {
		this.chucvu = chucvu;
	}

	/**
	 * @return the chucvu
	 */
	public final String getChucvu() {
		return chucvu;
	}

	@Override
	public String toString() {
		return chucvu;
	}

}
