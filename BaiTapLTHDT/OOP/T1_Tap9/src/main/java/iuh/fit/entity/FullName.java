/*
*@(#)FullName.java.java  Dec 1, 2023
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

/**
 * 
 */
public abstract class FullName {
	private String firstName;
	private String lastName;
	
	/**
	 * 
	 */
	public FullName() {
		this("","");
	}
	/**
	 * @param firstName
	 * @param lastName
	 */
	public FullName(String ho, String ten) {
		this.firstName = ho;
		this.lastName = ten;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String ho) {
		this.firstName = ho;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String ten) {
		this.lastName = ten;
	}
	@Override
	public String toString() {
		return ", firstName=" + firstName + ", lastName=" + lastName;
	}
	
}
