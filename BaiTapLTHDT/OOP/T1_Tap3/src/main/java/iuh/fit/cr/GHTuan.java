/*
*@(#)GHTuan.java.java  Nov 11, 2023
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
public class GHTuan extends GianHang{
	private int sotuanthue;

	/**
	 * 
	 */
	public GHTuan() {
		super();
		this.sotuanthue = 0;
	}

	/**
	 * @param maGH
	 * @param dientich
	 * @param loai
	 * @param giathue
	 * @param sotuanthue
	 */
	public GHTuan(String maGH, double dientich, ViTri loai, long giathue, int sotuanthue) {
		super(maGH, dientich, loai, giathue);
		this.sotuanthue = sotuanthue;
	}

	/**
	 * @return the sotuanthue
	 */
	public int getSotuanthue() {
		return sotuanthue;
	}

	/**
	 * @param sotuanthue the sotuanthue to set
	 */
	public void setSotuanthue(int sotuanthue) {
		this.sotuanthue = sotuanthue;
	}

	@Override
	public double tinhtienthue() {
		return (sotuanthue - sotuanthue % 4) * giathue;
	}

	@Override
	public String toString() {
		return super.toString() + "GHTuan [sotuanthue=" + sotuanthue + "]";
	}
	
	
	
}
