/*
*@(#)ViTri.java.java  Nov 11, 2023
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
* @date: Nov 11, 2023
* @version: 1.0
*/

/**
 * 
 */
public enum ViTri {
	MAT_TIEN("Mặt tiền"),MAT_HAU("Mặt hậu");
	
	private String loai;

	/**
	 * @param loai
	 */
	private ViTri(String loai) {
		this.loai = loai;
	}

	/**
	 * @return the loai
	 */
	public String getLoai() {
		return loai;
	}

	/**
	 * @param loai the loai to set
	 */
	public void setLoai(String loai) {
		this.loai = loai;
	}

	@Override
	public String toString() {
		return loai;
	}
	
}
