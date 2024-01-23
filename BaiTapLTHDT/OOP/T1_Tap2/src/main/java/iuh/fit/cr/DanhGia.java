/*
*@(#)DanhGia.java.java  Nov 8, 2023
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

/**
 * 
 */
public enum DanhGia {
	VI_PHAM("Vi phạm"),KHONG_VI_PHAM("Không vi phạm");
	
	private String danhgia;

	/**
	 * @param danhgia
	 */
	private DanhGia(String danhgia) {
		this.danhgia = danhgia;
	}

	/**
	 * @return the danhgia
	 */
	public String getDanhgia() {
		return danhgia;
	}

	/**
	 * @param danhgia the danhgia to set
	 */
	public void setDanhgia(String danhgia) {
		this.danhgia = danhgia;
	}

	@Override
	public String toString() {
		return danhgia;
	}
	
	
}
