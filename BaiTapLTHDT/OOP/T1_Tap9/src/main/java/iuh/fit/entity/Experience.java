/*
*@(#)Experience.java.java  Dec 1, 2023
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

import java.time.LocalDate;

/**
 * 
 */
public class Experience extends Employee{
	private int sonamkinhnghiem;
	
	/**
	 * 
	 */
	public Experience() {
		super();
		sonamkinhnghiem = 1;
	}

	/**
	 * @param ho
	 * @param ten
	 * @param ma
	 * @param ngaysinh
	 * @param sodienthoai
	 * @param sonamkinhnghiem
	 */
	public Experience(String ho, String ten, String ma, LocalDate ngaysinh, String sodienthoai, int sonamkinhnghiem) {
		super(ho, ten, ma, ngaysinh, sodienthoai);
		setSonamkinhnghiem(sonamkinhnghiem);
	}

	/**
	 * @return the sonamkinhnghiem
	 */
	public int getSonamkinhnghiem() {
		return sonamkinhnghiem;
	}

	/**
	 * @param sonamkinhnghiem the sonamkinhnghiem to set
	 */
	public void setSonamkinhnghiem(int sonamkinhnghiem) {
		if(sonamkinhnghiem < 0)
			throw new IllegalArgumentException("So nam kinh nghiem > 0");
		this.sonamkinhnghiem = sonamkinhnghiem;
	}

	@Override
	public String toString() {
		return "Experience" + super.toString() + ", sonamkinhnghiem=" + sonamkinhnghiem + "]";
	}
	
	
}
