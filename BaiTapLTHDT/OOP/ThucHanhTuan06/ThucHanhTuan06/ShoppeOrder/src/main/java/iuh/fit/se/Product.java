package iuh.fit.se;

import java.text.DecimalFormat;

public class Product {
	private String productID;
	private String description;
	private double price;
	
	public Product() {
		this("", "", 0.0);
	}
	public Product(String productID, String description, double price) {
		this.productID = productID;
		this.description = description;
		this.price = price;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		return String.format("%-10s|%-30s|%15s|", productID, description, df.format(price));
	}
	
	
}
