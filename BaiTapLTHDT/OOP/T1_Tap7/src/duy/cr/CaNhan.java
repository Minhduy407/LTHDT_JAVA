/*
*@(#)CaNhan.java.java  Nov 21, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package duy.cr;

import java.util.HashSet;
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
public abstract class CaNhan {
	protected String maso;
	protected String hoten;
	protected Set<String> dssdt;
	
	/**
	 * 
	 */
	public CaNhan() {
		this("","",new HashSet<>());
	}
	/**
	 * @param maso
	 * @param hoten
	 * @param dssdt
	 */
	public CaNhan(String maso, String hoten, Set<String> dssdt) {
		super();
		this.maso = maso;
		this.hoten = hoten;
		this.dssdt = dssdt;
	}
	/**
	 * @return the maso
	 */
	public String getMaso() {
		return maso;
	}
	/**
	 * @param maso the maso to set
	 */
	public void setMaso(String maso) {
		this.maso = maso;
	}
	/**
	 * @return the hoten
	 */
	public String getHoten() {
		return hoten;
	}
	/**
	 * @param hoten the hoten to set
	 */
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	/**
	 * @return the dssdt
	 */
	public Set<String> getDssdt() {
		return dssdt;
	}
	/**
	 * @param dssdt the dssdt to set
	 */
	public void setDssdt(Set<String> dssdt) {
		this.dssdt = dssdt;
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
		CaNhan other = (CaNhan) obj;
		if (maso == null) {
			if (other.maso != null)
				return false;
		} else if (!maso.equals(other.maso))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return " maso=" + maso + ", hoten=" + hoten + ", dssdt=" + dssdt;
	}
	
	public abstract String ghiChu() ;
}
