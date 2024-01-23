package iuh.fit.duy;

import java.text.DecimalFormat;

public class OrderDetail{
	private int quantity;
	private Product product;
	
	/**
	 * @param quantity
	 */
	public OrderDetail(Product x,int quantity) {
		super();
		this.product = x;
		this.quantity = quantity;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double calcTotalPrice() {
		return product.getPrice() * quantity;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		return product.toString() + String.format("%15s|%20s\n",quantity, df.format(calcTotalPrice()));
	}
	
	
}
