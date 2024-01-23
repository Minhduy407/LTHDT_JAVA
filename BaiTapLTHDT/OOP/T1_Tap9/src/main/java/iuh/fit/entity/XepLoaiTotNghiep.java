/*
*@(#)XepLoaiTotNghiep.java.java  Dec 1, 2023
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

/**
 * 
 */
public enum XepLoaiTotNghiep {
	A("A"),B("B"),C("C");
	private final String xeploai;

	/**
	 * @param d
	 */
	XepLoaiTotNghiep(String d) {
		xeploai = d;
	}

	/**
	 * @return the xeploai
	 */
	public String getXeploai() {
		return xeploai;
	}

	@Override
	public String toString() {
		return xeploai;
	}
	
	
}
