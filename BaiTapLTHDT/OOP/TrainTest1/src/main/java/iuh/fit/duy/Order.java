package iuh.fit.duy;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Order {
	private int orderID;
	LocalDate orderDate;
	private OrderDetail[] ods;
	private int soluong = 0;
	
	
	/**
	 * @param orderID
	 * @param orderDate
	 */
	public Order(int orderID, LocalDate orderDate) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		ods = new OrderDetail[10];
	}
	
	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}
	/**
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	public void addLineItem(Product x,int quantity) {
		if(quantity < 0) throw new IllegalArgumentException("So luong > 0!!");
		if(soluong == ods.length) {
			int newsoluong = ods.length * 2;
			Arrays.copyOf(ods, newsoluong);
		}
		OrderDetail them = new OrderDetail(x, quantity);
		ods[soluong++] = them;
	}
	
	public double calcTotalCharge() {
		return Arrays.stream(ods,0,soluong)
				.collect(Collectors.summingDouble(OrderDetail::calcTotalPrice));
	}
	
	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df2 = new DecimalFormat("#,##0 VND");
		String temp = "Mã HD: " + orderID +"\n"
				+ "Ngày lập hóa đơn: " + df.format(orderDate) + "\n";
		temp += String.format("%-10s|%-10s|%-30s|%15s|%15s|%20s\n", "STT", "Mã SP", "Mô tả", "Đơn giá", "Số lượng", "Thành tiền");
		for(int i = 0; i < soluong; i++) {
			OrderDetail od = ods[i];
			temp += String.format("%-10s|", i + 1) + od.toString();
		}
		
		temp += "Tổng tiền thanh toán: " + df2.format(calcTotalCharge());
		
		return temp;
	}
}
