/*
*@(#)ThongTinLienHe.java.java  Nov 8, 2023
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
* @date: Nov 8, 2023
* @version: 1.0
*/

/**
 * 
 */
public class ThongTinLienHe {
	private String sdt;
	private String email;
	
	/**
	 * 
	 */
	public ThongTinLienHe() {
		this("","");
	}


	/**
	 * @param sdt
	 * @param email
	 */
	public ThongTinLienHe(String sdt, String email) {
		super();
		this.sdt = sdt;
		this.email = email;
	}


	/**
	 * @return the sdt
	 */
	public String getSdt() {
		return sdt;
	}


	/**
	 * @param sdt the sdt to set
	 */
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "\n====Thông tin liên hệ====\nSĐT: " + sdt + "\nEmail: " + email;
	}
	
	
}
