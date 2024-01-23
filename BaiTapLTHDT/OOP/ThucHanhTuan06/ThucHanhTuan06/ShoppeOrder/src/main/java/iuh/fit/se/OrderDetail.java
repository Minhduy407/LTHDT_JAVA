package iuh.fit.se;

import java.text.DecimalFormat;

public class OrderDetail {
	private int quantity;
	private Product product;

	public OrderDetail(Product product, int quantity) {
		
		this.quantity = quantity;
		this.product = product;
	}
	
	public double calcTotalPrice() {
		return quantity * product.getPrice();
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		return product.toString() + String.format("%15s|%20s\n",quantity, df.format(calcTotalPrice()));
	}
}
