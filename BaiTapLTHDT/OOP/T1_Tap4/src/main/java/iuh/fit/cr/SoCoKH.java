/*
*@(#)SoCoKH.java.java  Nov 11, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.cr;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
* @description:
* @author: Chopper
* @date: Nov 11, 2023
* @version: 1.0
*/

/**
 * 
 */
public class SoCoKH extends TienGoiTK{
	private int sothanggoi;
	
	/**
	 * 
	 */
	public SoCoKH() {
		super();
		this.sothanggoi = 0;
	}

	/**
	 * @param maso
	 * @param cmnd
	 * @param hotenkh
	 * @param stg
	 * @param ngayls
	 * @param laisuat
	 * @param sothanggoi
	 */
	public SoCoKH(String maso, String cmnd, String hotenkh, long stg, LocalDate ngayls, double laisuat,
			int sothanggoi) {
		super(maso, cmnd, hotenkh, stg, ngayls, laisuat);
		this.sothanggoi = sothanggoi;
	}

	/**
	 * @return the sothanggoi
	 */
	public int getSothanggoi() {
		return sothanggoi;
	}

	/**
	 * @param sothanggoi the sothanggoi to set
	 */
	public void setSothanggoi(int sothanggoi) {
		this.sothanggoi = sothanggoi;
	}

	@Override
	public double tinhtienlai() {
		int thang = (int)Math.abs(ChronoUnit.MONTHS.between(ngayls,LocalDate.now()));
		if(thang % sothanggoi == 0)
			return stg * laisuat * thang;
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "[sothanggoi=" + sothanggoi + "]";
	}
	
}
