package iuh.fit.duy;

import java.time.LocalDate;

public class QLHD {
	public static void main(String[] args) {
		Order od1 = new Order(1, LocalDate.now());
		
		Product pd1 = new Product("sp1","Gạo",18000.0);
		Product pd2 = new Product("sp2","Dầu ăn",25000.0);
		Product pd3 = new Product("sp3","Đường",10000.0);
		Product pd4 = new Product("sp4","Nước tương",8000.0);
		
		od1.addLineItem(pd1, 5);
		od1.addLineItem(pd2, 1);
		od1.addLineItem(pd3, 5);
		od1.addLineItem(pd4, 10);
		od1.addLineItem(pd1, 3);
		
		System.out.println(od1);
	}
}
