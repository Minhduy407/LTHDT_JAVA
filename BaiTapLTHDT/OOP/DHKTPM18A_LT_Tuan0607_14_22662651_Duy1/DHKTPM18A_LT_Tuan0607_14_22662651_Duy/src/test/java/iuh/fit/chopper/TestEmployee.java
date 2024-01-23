package iuh.fit.chopper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmployee {
	EmployeeList emps;
	
	@BeforeEach
	void setup() {
		emps = new EmployeeList();
		HourlyEmployee emp1 = new HourlyEmployee("001","Lan",LocalDate.of(2004,10,15),40,30000.0);
		HourlyEmployee emp2 = new HourlyEmployee("002","Phuong",LocalDate.of(2004,10,15),50,30000.0);
		SalariedEmployee emp3 = new SalariedEmployee("003","Cam Tien",LocalDate.of(2000,10,15),1000000.0);
		SalariedEmployee emp4 = new SalariedEmployee("004","Thuy Tien",LocalDate.of(1980,10,15),1200000.0);
		Manager emp5 = new Manager("005","Thien Loc",LocalDate.of(2000,10,15),1500000.0,500000.0);
		Manager emp6 = new Manager("006","Minh Duy",LocalDate.of(1970,10,15),2500000.0,1000000.0);
		emps.addEmployees(emp1);
		emps.addEmployees(emp2);
		emps.addEmployees(emp3);
		emps.addEmployees(emp4);
		emps.addEmployees(emp5);
		emps.addEmployees(emp6);
	}
	
	@AfterEach
	void tearDown() {
		emps = null;
	}
	
	@Test
	void testAddEmployee() {
		HourlyEmployee emp = new HourlyEmployee("020","Khanh",LocalDate.of(2000,10,15),45,30000.0);
		emps.addEmployees(emp);
		assertEquals(7, emps.getCurrentSize());
	}
	
	@Test
	void testAddEmployeeException() {
		HourlyEmployee emp = new HourlyEmployee("002","Khanh",LocalDate.of(2000,10,15),45,30000.0);
		Exception ex = assertThrows(IllegalArgumentException.class,()->{
			emps.addEmployees(emp);
		});
		String expected = "Employee with ID " + emp.getId() + " already exists.";
		assertEquals(expected,ex.getMessage());
	}
	
	@Test
	void testindexOfEmployee() {
		HourlyEmployee emp = new HourlyEmployee("020","Khanh",LocalDate.of(2004,10,15),45,30000.0);
		SalariedEmployee emp4 = new SalariedEmployee("004","Thuy Tien",LocalDate.of(1980,10,15),1200000.0);
		assertEquals(-1,emps.indexOfEmployee(emp.getId()));
		assertEquals(3,emps.indexOfEmployee(emp4.getId()));
	}
	
	@Test
	void testsearchEmployeeById() {
		HourlyEmployee empk1 = new HourlyEmployee("020","Khanh",LocalDate.of(2004,10,15),45,30000.0);
		SalariedEmployee empk2 = new SalariedEmployee("004","Thuy Tien",LocalDate.of(1980,10,15),1200000.0);
		SalariedEmployee empk3 = (SalariedEmployee) emps.searchEmployeeById(empk2.getId());
		assertEquals(null, emps.searchEmployeeById(empk1.getId()));
		assertEquals(empk3,emps.searchEmployeeById(empk2.getId()));
	}
	
	@Test
	void testremoveEmployeeException() {
		HourlyEmployee empk1 = new HourlyEmployee("020","Khanh",LocalDate.of(2004,10,15),45,30000.0);
		Exception ex1 = assertThrows(IllegalArgumentException.class,()->{
			emps.removeEmployee(empk1.getId());
		});
		String expected1 = "Employee with ID " + empk1.getId() + " does not exist.";
		assertEquals(expected1, ex1.getMessage());
	}
	
	@Test
	void testremoveEmployee() {
		SalariedEmployee empk2 = new SalariedEmployee("004","Thuy Tien",LocalDate.of(1980,10,15),1200000.0);
		emps.removeEmployee(empk2.getId());
		String ex2 = "004";
		assertEquals(null,emps.searchEmployeeById(ex2));
	}
	
	@Test
	void testupdateEmployeeException() {
		HourlyEmployee empk1 = new HourlyEmployee("020","Khanh",LocalDate.of(2004,10,15),45,30000.0);
		Exception ex1 = assertThrows(IllegalArgumentException.class,()->{
			emps.updateEmployee(empk1);
		});
		String expected1 = "Employee with ID " + empk1.id + " does not update.";
		assertEquals(expected1, ex1.getMessage());
	}
	
	@Test
	void testupdateEmployee() {
		SalariedEmployee empk2 = new SalariedEmployee("004","Nguyen Thuy Tien",LocalDate.of(1980,10,15),2000000.0);
		emps.updateEmployee(empk2);
		assertEquals(empk2, emps.searchEmployeeById(empk2.getId()));
	}
	
	@Test
	void testupdateHourlyWorked() {
		emps.updateHourlyWorked("002", 55);
		HourlyEmployee empk2 = (HourlyEmployee)emps.searchEmployeeById("002");
		assertEquals(55,empk2.getHoursWorked());
	}
	
	@Test
	void testupdateHourlyWorkedException() {
		Exception ex1 = assertThrows(IllegalArgumentException.class, ()->{
			emps.updateHourlyWorked("002", -55);
		});
		String expected1 = "Hours worked cannot be negative.";
		assertEquals(expected1,ex1.getMessage());
		
		Exception ex2 = assertThrows(IllegalArgumentException.class, ()->{
			emps.updateHourlyWorked("005", 55);
		});
		String expected2 = "Employee with ID 005 is not an hourly employee.";
		assertEquals(expected2,ex2.getMessage());
		
		Exception ex3 = assertThrows(IllegalArgumentException.class, ()->{
			emps.updateHourlyWorked("014", 55);
		});
		String expected3 = "Employee with ID 014 does not exist.";
		assertEquals(expected3,ex3.getMessage());
	}
	
	@Test
	void testgetWeeklyTotalSalaryOfManager() {
		double sum = emps.getWeeklyTotalSalaryOfManager();
		double expected = 2500000.0;
		assertEquals(expected, sum);
	}
	
}
