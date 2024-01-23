/*
*@(#)SoKKH.java.java  Nov 11, 2023
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

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class SoKKH extends TienGoiTK{
	public SoKKH() {
		super();
	}
	
	public SoKKH(String maso, String cmnd, String hotenkh, long stg, LocalDate ngayls, double laisuat) {
		super();
		this.maso = maso;
		this.cmnd = cmnd;
		this.hotenkh = hotenkh;
		this.stg = stg;
		this.ngayls = ngayls;
		this.laisuat = laisuat;
	}
	
	@Override
	public double tinhtienlai() {
		int thang = (int)Math.abs(ChronoUnit.MONTHS.between(ngayls,LocalDate.now()));
		return stg * laisuat * thang;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
