package iuh.fit.chopper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeTester {
	public static void main(String[] args) {
		EmployeeList employees = new EmployeeList(50);
		HourlyEmployee emp11 = new HourlyEmployee("001","Messi",LocalDate.of(2004,02,15),20,30000.0);
		HourlyEmployee emp12 = new HourlyEmployee("002","Ronaldo",LocalDate.of(2004,02,15),45,30000.0);
		HourlyEmployee emp13 = new HourlyEmployee("003","Hazard",LocalDate.of(2004,02,15),25,30000.0);
		HourlyEmployee emp14 = new HourlyEmployee("004","Henry",LocalDate.of(2004,02,15),40,30000.0);
		HourlyEmployee emp15 = new HourlyEmployee("005","Tuan Anh",LocalDate.of(2004,10,30),50,30000.0);
		
		SalariedEmployee emp21 = new SalariedEmployee("011","Tieu Dai",LocalDate.of(2004,12,20),1000000.0);		
		SalariedEmployee emp22 = new SalariedEmployee("012","A Tam",LocalDate.of(2004,12,20),1000000.0);		
		SalariedEmployee emp23 = new SalariedEmployee("013","Lan Phuong",LocalDate.of(2004,12,20),1000000.0);		
		SalariedEmployee emp24 = new SalariedEmployee("014","Phan Bach",LocalDate.of(2004,12,20),1000000.0);		
		SalariedEmployee emp25 = new SalariedEmployee("015","Minh Loc",LocalDate.of(2004,07,06),1200000.0);
		
		Manager emp31 = new Manager("102","Hoang Phuc",LocalDate.of(2000,06,28),1500000.0,500000.0);
		Manager emp32 = new Manager("103","Thien Loc",LocalDate.of(2000,06,28),1500000.0,500000.0);
		Manager emp33 = new Manager("104","Ky Hung",LocalDate.of(2000,06,28),1500000.0,500000.0);
		Manager emp34 = new Manager("105","Danh Tai",LocalDate.of(1990,10,30),1500000.0,500000.0);
		Manager emp35 = new Manager("101","Minh Duy",LocalDate.of(1980,10,15),2500000.0,1000000.0);
		
		employees.addEmployees(emp11);
		employees.addEmployees(emp12);
		employees.addEmployees(emp13);
		employees.addEmployees(emp14);
		employees.addEmployees(emp15);
		employees.addEmployees(emp21);
		employees.addEmployees(emp22);
		employees.addEmployees(emp23);
		employees.addEmployees(emp24);
		employees.addEmployees(emp25);
		employees.addEmployees(emp31);
		employees.addEmployees(emp32);
		employees.addEmployees(emp33);
		employees.addEmployees(emp34);
		employees.addEmployees(emp35);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try (Scanner sc = new Scanner(System.in)) {
			int choice = 0;
			do {
				System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
				System.out.println("1. Display all employees");
				System.out.println("2. Add a new employee");
				System.out.println("3. Search employee by id");
				System.out.println("4. Sort by weekly salary");
				System.out.println("5. Remove employee by id");
				System.out.println("6. Update employee by id");
				System.out.println("7. List hourly employees who work more than 40 hours a week");
				System.out.println("8. Print the total weekly salary of all managers");
				System.out.println("9. Update hourly worked of hourly employee by id");
				System.out.println("10. List of employees who are young managers(less than 30 years old)");
				System.out.println("0. Exit");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case 0:{
						System.out.println("End Program");
						return;
					}
					case 1:{
						System.out.println("Display all employees");
						Employee[] emps = employees.getEmployees();
						for(Employee emp : emps) {
							System.out.println(emp);
						}
						break;
					}
					case 2:{
						System.out.println("Add a new employee\n");
						System.out.println("Enter employee type(HourlyEmployee/SalariedEmployee/Manager): ");
						String s = sc.nextLine();
						System.out.println("Enter employee id: ");
						String id = sc.nextLine();
						System.out.println("Enter employee name: ");
						String name = sc.nextLine();
						System.out.println("Enter employee date of birth: ");
						LocalDate dob = LocalDate.parse(sc.nextLine(),df);
						switch(s) {
						case "HourlyEmployee":{
							System.out.println("Enter employee hoursWorked: ");
							int hoursWorked = sc.nextInt();
							System.out.println("Enter employee hourlyWage: ");
							double hourlyWage = sc.nextDouble();
							HourlyEmployee emp = new HourlyEmployee(id,name,dob,hoursWorked,hourlyWage);
							employees.addEmployees(emp);
							break;
						}
						case "SalariedEmployee":{
							System.out.println("Enter employee annualSalary: ");
							double annualSalary = sc.nextDouble();
							SalariedEmployee emp = new SalariedEmployee(id,name,dob,annualSalary);
							employees.addEmployees(emp);
							break;
						}
						case "Manager":{
							System.out.println("Enter employee annualSalary: ");
							double annualSalary = sc.nextDouble();
							System.out.println("Enter employee weeklyBonus: ");
							double weeklyBonus = sc.nextDouble();
							Manager emp = new Manager(id,name,dob,annualSalary,weeklyBonus);
							employees.addEmployees(emp);
							break;
						}
						}
						break;
					}
					case 3:{
						System.out.println("Search employee by id\n");
						System.out.println("Enter id: ");
						String id = sc.nextLine();
						employees.indexOfEmployee(id);
						System.out.println(employees.searchEmployeeById(id));
						break;
					}
					case 4:{
						System.out.println("Sort by weekly salary\n");
						employees.sortByWeeklySalary();
						break;
					}
					case 5:{
						System.out.println("Remove employee by id\n");
						System.out.println("Enter id: ");
						String id = sc.nextLine();
						employees.indexOfEmployee(id);
						employees.removeEmployee(id);
						break;
					}
					case 6:{
						System.out.println("Update employee by id\n");
						System.out.println("Enter employee id: ");
						String id = sc.nextLine();
						System.out.println("Enter employee name: ");
						String name = sc.nextLine();
						System.out.println("Enter employee date of birth: ");
						LocalDate dob = LocalDate.parse(sc.nextLine(),df);
						employees.indexOfEmployee(id);
						Employee e = employees.searchEmployeeById(id);
						if(e instanceof HourlyEmployee) {
							System.out.println("Enter employee hoursWorked: ");
							int hoursWorked = sc.nextInt();
							System.out.println("Enter employee hourlyWage: ");
							double hourlyWage = sc.nextDouble();
							HourlyEmployee emp = new HourlyEmployee(id,name,dob,hoursWorked,hourlyWage);
							employees.updateEmployee(emp);
						}
						if(e instanceof SalariedEmployee) {
							System.out.println("Enter employee annualSalary: ");
							double annualSalary = sc.nextDouble();
							SalariedEmployee emp = new SalariedEmployee(id,name,dob,annualSalary);
							employees.updateEmployee(emp);
						}
						if(e instanceof Manager) {
							System.out.println("Enter employee annualSalary: ");
							double annualSalary = sc.nextDouble();
							System.out.println("Enter employee weeklyBonus: ");
							double weeklyBonus = sc.nextDouble();
							Manager emp = new Manager(id,name,dob,annualSalary,weeklyBonus);
							employees.updateEmployee(emp);
						}
						break;
					}
					case 7:{
						System.out.println("List hourly employees who work more than 40 hours a week\n");
						Employee[] tmps = employees.getHourlyEmpsWorkMoreThan40();
						for(Employee tmp : tmps) {
							System.out.println(tmp);
							System.out.println("\n");
						}
						break;
					}
					case 8:{
						System.out.println("Print the total weekly salary of all managers\n");
						double salarysum = employees.getWeeklyTotalSalaryOfManager();
						System.out.println("Total: " + salarysum);
						break;
					}
					case 9:{
						System.out.println("Update hourly worked of hourly employee by id\n");
						System.out.println("Enter employee id: ");
						String id = sc.nextLine();
						employees.indexOfEmployee(id);
						System.out.println("Enter new hour: ");
						int time = sc.nextInt();
						employees.updateHourlyWorked(id, time);
						break;
					}
					case 10:{
						System.out.println("List of employees who are young managers(less than 30 years old)\n");
						Employee[] tmps = employees.getYoungEmployeesAsManagers();
						for(Employee tmp : tmps) {
							System.out.println(tmp);
							System.out.println("\n");
						}
						break;
					}
				}
			}while(choice < 11);
		}
	}
}
