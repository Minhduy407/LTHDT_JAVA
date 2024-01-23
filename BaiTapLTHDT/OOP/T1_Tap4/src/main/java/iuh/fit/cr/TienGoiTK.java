/*
*@(#)TienGoiTK.java.java  Nov 11, 2023
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * 
 */
public abstract class TienGoiTK {
	protected String maso;
	protected String cmnd;
	protected String hotenkh;
	protected long stg;
	LocalDate ngayls;
	protected double laisuat;
	
	
	/**
	 * 
	 */
	public TienGoiTK() {
		this("000","000000000","abc",0l,LocalDate.now(),0.0);
	}


	/**
	 * @param maso
	 * @param cmnd
	 * @param hotenkh
	 * @param stg
	 * @param ngayls
	 * @param laisuat
	 */
	public TienGoiTK(String maso, String cmnd, String hotenkh, long stg, LocalDate ngayls, double laisuat) {
		setMaso(maso);
		setCmnd(cmnd);
		setHotenkh(hotenkh);
		setStg(stg);
		setNgayls(ngayls);
		setLaisuat(laisuat);
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
		if(maso == null) throw new IllegalArgumentException("Ma so khong duoc rong!");
		this.maso = maso;
	}


	/**
	 * @return the cmnd
	 */
	public String getCmnd() {
		return cmnd;
	}


	/**
	 * @param cmnd the cmnd to set
	 */
	public void setCmnd(String cmnd) {
		if(cmnd == null) throw new IllegalArgumentException("CMND khong duoc rong!");
		if(cmnd.matches("[0-9]{9}"))
				this.cmnd = cmnd;
		else 
			throw new IllegalArgumentException("CMND phai dung 9 chu so");
	}


	/**
	 * @return the hotenkh
	 */
	public String getHotenkh() {
		return hotenkh;
	}


	/**
	 * @param hotenkh the hotenkh to set
	 */
	public void setHotenkh(String hotenkh) {
		if(hotenkh == null) 
			throw new IllegalArgumentException("Ten khach hang khong duoc rong!");
		this.hotenkh = hotenkh;
	}


	/**
	 * @return the stg
	 */
	public long getStg() {
		return stg;
	}


	/**
	 * @param stg the stg to set
	 */
	public void setStg(long stg) {
		if(stg < 0) 
			throw new IllegalArgumentException("So tien goi phai >= 0!");
		this.stg = stg;
	}


	/**
	 * @return the ngayls
	 */
	public LocalDate getNgayls() {
		return ngayls;
	}


	/**
	 * @param ngayls the ngayls to set
	 */
	public void setNgayls(LocalDate ngayls) {
		if(ngayls.isAfter(LocalDate.now())) 
			throw new IllegalArgumentException("Ngay lap hoa don phai truoc hoac bang ngay hien tai!");
		this.ngayls = ngayls;
	}


	/**
	 * @return the laisuat
	 */
	public double getLaisuat() {
		return laisuat;
	}


	/**
	 * @param laisuat the laisuat to set
	 */
	public void setLaisuat(double laisuat) {
		if(laisuat < 0) 
			throw new IllegalArgumentException("Lai suat phai >= 0!");
		this.laisuat = laisuat;
	}


	@Override
	public int hashCode() {
		return Objects.hash(maso);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TienGoiTK other = (TienGoiTK) obj;
		return Objects.equals(maso, other.maso);
	}
	
	public abstract double tinhtienlai();


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VND");
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return getClass().getSimpleName() + " [maso=" + maso + ", cmnd=" + cmnd + ", hotenkh=" + hotenkh + ", stg=" + stg + ", ngayls="
				+ df1.format(ngayls) + ", laisuat=" + laisuat + ", tinhtienlai()=" + df.format(tinhtienlai()) + "]";
	}
	
	
}
