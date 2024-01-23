package iuh.fit.duy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestQLHD {
	Order od;
	@BeforeEach
	void setup() {
		od = new Order(1, LocalDate.now());
		Product pd1 = new Product("sp1","Gạo",18000.0);
		Product pd2 = new Product("sp2","Dầu ăn",25000.0);
		Product pd3 = new Product("sp3","Đường",10000.0);
		Product pd4 = new Product("sp4","Nước tương",8000.0);
		
		od.addLineItem(pd1, 5);
		od.addLineItem(pd2, 1);
		od.addLineItem(pd3, 5);
		od.addLineItem(pd4, 10);
		od.addLineItem(pd1, 3);
	}
	
	@AfterEach
	void tearDown() {
		od = null;
	}
	
	@Test
	void testaddProduct() {
		Product pd = new Product("sp3","Đường",10000.0);
		Exception ex = assertThrows(IllegalArgumentException.class,()
				->{
					od.addLineItem(pd, -10);
				});
		String expected = "So luong > 0!!";
		assertEquals(expected, ex.getMessage());
	}
	
}
