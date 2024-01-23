package iuh.fit.duy;

import java.text.DecimalFormat;

public class Product {
	private String productID;
	private String description;
	private double price;
	
	
	/**
	 * 
	 */
	public Product() {
		this("","",0.0);
	}
	/**
	 * @param productID
	 * @param description
	 * @param price
	 */
	public Product(String productID, String description, double price) {
		super();
		this.productID = productID;
		this.description = description;
		this.price = price;
	}
	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%-10s|%-30s|%15s|", productID, description, df.format(price));
	}
	
	
}
