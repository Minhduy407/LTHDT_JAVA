package iuh.fit.se;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("sp1","Gạo",18000);
		Product p3 = new Product("sp3","Mì",6000);
		Product p2 = new Product("sp2","Lúa",7000);
		Product p4 = new Product("sp4","Nước tương",8000);
		Product p5 = new Product("sp5","Đường",10000);
		Product p6 = new Product("sp6","Bột ngọt",15000);
		
		Order order = new Order(1,LocalDate.now());
		
		order.addLineItem(p4, 10);
		order.addLineItem(p1, 5);
		order.addLineItem(p5, 1);
		order.addLineItem(p1, 1);
		
		System.out.println(order);
	}
}
