/*
*@(#)GHThang.java.java  Nov 11, 2023
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
public class GHThang extends GianHang{
	private int sothangthue;
	/**
	 * 
	 */
	public GHThang() {
		super();
		this.sothangthue = 0;
	}

	/**
	 * @param maGH
	 * @param dientich
	 * @param loai
	 * @param giathue
	 * @param sothangthue
	 */
	public GHThang(String maGH, double dientich, ViTri loai, long giathue, int sothangthue) {
		super(maGH, dientich, loai, giathue);
		this.sothangthue = sothangthue;
	}

	/**
	 * @return the sothangthue
	 */
	public int getSothangthue() {
		return sothangthue;
	}

	/**
	 * @param sothangthue the sothangthue to set
	 */
	public void setSothangthue(int sothangthue) {
		this.sothangthue = sothangthue;
	}

	@Override
	public double tinhtienthue() {
		return (sothangthue - sothangthue % 4) * giathue;
	}

	@Override
	public String toString() {
		return super.toString() + "GHThang [sothangthue=" + sothangthue + "]";
	}
	
	
}	
