/*
*@(#)GianHang.java.java  Nov 11, 2023
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

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 
 */
public abstract class GianHang {
	protected String maGH;
	protected double dientich;
	protected ViTri loai;
	protected long giathue;
	
	/**
	 * 
	 */
	public GianHang() {
		this("",0.0,ViTri.MAT_TIEN,0);
	}
	/**
	 * @param maGH
	 * @param dientich
	 * @param loai
	 * @param giathue
	 */
	public GianHang(String maGH, double dientich, ViTri loai, long giathue) {
		super();
		this.maGH = maGH;
		this.dientich = dientich;
		this.loai = loai;
		this.giathue = giathue;
	}
	/**
	 * @return the maGH
	 */
	public String getMaGH() {
		return maGH;
	}
	/**
	 * @param maGH the maGH to set
	 */
	public void setMaGH(String maGH) {
		this.maGH = maGH;
	}
	/**
	 * @return the dientich
	 */
	public double getDientich() {
		return dientich;
	}
	/**
	 * @param dientich the dientich to set
	 */
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	/**
	 * @return the loai
	 */
	public ViTri getLoai() {
		return loai;
	}
	/**
	 * @param loai the loai to set
	 */
	public void setLoai(ViTri loai) {
		this.loai = loai;
	}
	/**
	 * @return the giathue
	 */
	public long getGiathue() {
		return giathue;
	}
	/**
	 * @param giathue the giathue to set
	 */
	public void setGiathue(long giathue) {
		this.giathue = giathue;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maGH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GianHang other = (GianHang) obj;
		return Objects.equals(maGH, other.maGH);
	}
	
	public abstract double tinhtienthue();
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VNĐ");
		return getClass().getSimpleName() +  " [maGH=" + maGH + ", dientich=" + dientich + ", loai=" + loai + ", giathue=" + giathue
				+ ", tinhtienthue()=" + df.format(tinhtienthue()) + "]";
	}
	
	
}
