/*
*@(#)Employee.java.java  Dec 1, 2023
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
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public abstract class Employee extends FullName{
	protected String ma;
	LocalDate ngaysinh;
	protected String sodienthoai;
	
	/**
	 * 
	 */
	public Employee() {
		super();
		this.ma = "000";
		this.ngaysinh = LocalDate.now();
		this.sodienthoai = "000000000";
	}
	/**
	 * @param ho
	 * @param ten
	 * @param ma
	 * @param ngaysinh
	 * @param sodienthoai
	 */
	public Employee(String ho, String ten, String ma, LocalDate ngaysinh, String sodienthoai) {
		super(ho, ten);
		setMa(ma);;
		setNgaysinh(ngaysinh);;
		setSodienthoai(sodienthoai);;
	}
	/**
	 * @return the ma
	 */
	public String getMa() {
		return ma;
	}
	/**
	 * @param ma the ma to set
	 */
	public void setMa(String ma) {
		if(ma.isEmpty())
			throw new IllegalArgumentException("Ma nhan vien khong duoc rong");
		this.ma = ma;
	}
	
	/**
	 * @return the ngaysinh
	 */
	public LocalDate getNgaysinh() {
		return ngaysinh;
	}
	/**
	 * @param ngaysinh the ngaysinh to set
	 */
	public void setNgaysinh(LocalDate ngaysinh) {
		if(ChronoUnit.YEARS.between(ngaysinh, LocalDate.now()) < 20)
			throw new IllegalArgumentException("Nhan vien phai >= 20 tuoi");
		this.ngaysinh = ngaysinh;
	}
	/**
	 * @return the sodienthoai
	 */
	public String getSodienthoai() {
		return sodienthoai;
	}
	/**
	 * @param sodienthoai the sodienthoai to set
	 */
	public void setSodienthoai(String sodienthoai) {
		if(!sodienthoai.matches("0[0-9]{9}"))
			throw new IllegalArgumentException("So dien thoai co 10 ky so va bat dau bang so 0");
		this.sodienthoai = sodienthoai;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ma == null) ? 0 : ma.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ma == null) {
			if (other.ma != null)
				return false;
		} else if (!ma.equals(other.ma))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return " [ma=" + ma + super.toString() + ", ngaysinh=" + ngaysinh + ", sodienthoai=" + sodienthoai;
	}
	
	
}