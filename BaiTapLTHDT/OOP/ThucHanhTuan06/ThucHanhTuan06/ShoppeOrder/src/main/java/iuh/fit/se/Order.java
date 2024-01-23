package iuh.fit.se;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int n = 0;
	
	public Order(int orderID, LocalDate orderDate) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		lineItems = new OrderDetail[10];
	}

	public void addLineItem(Product p, int q) {
		
		if(n == lineItems.length) {
			int newLength = lineItems.length * 2;
			lineItems = Arrays.copyOf(lineItems, newLength);
		}
		
		OrderDetail orderDetail = new OrderDetail(p, q);
		lineItems[n++] = orderDetail;
	}

	public double calcTotalCharge() {
		return Arrays.stream(lineItems,0,n)
					.collect(Collectors.summingDouble(OrderDetail::calcTotalPrice));
	}
	public int getOrderID() {
		return orderID;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df2 = new DecimalFormat("#,##0 VND");
		String temp = "Mã HD: " + orderID +"\n"
				+ "Ngày lập hóa đơn: " + df.format(orderDate) + "\n";
		temp += String.format("%-10s|%-10s|%-30s|%15s|%15s|%20s\n", "STT", "Mã SP", "Mô tả", "Đơn giá", "Số lượng", "Thành tiền");
		for(int i = 0; i < n; i++) {
			OrderDetail od = lineItems[i];
			temp += String.format("%-10s|", i + 1) + od.toString();
		}
		
		temp += "Tổng tiền thanh toán: " + df2.format(calcTotalCharge());
		
		return temp;
	}
}
