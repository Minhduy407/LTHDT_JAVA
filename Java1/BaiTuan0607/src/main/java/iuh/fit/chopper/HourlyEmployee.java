package iuh.fit.chopper;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class HourlyEmployee extends Employee{
	private int hoursWorked;
	private double hourlyWage;
	
	
	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String id, String name, LocalDate dob,int hoursWorked, double hourlyWage) {
		super(id,name,dob);
		this.hoursWorked = hoursWorked;
		this.hourlyWage = hourlyWage;
	}

	public int getHoursWorked(){
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public double weeklyPay() {
		return hourlyWage * hoursWorked;
	}

	@Override
	public String toString() {
		DecimalFormat df3 = new DecimalFormat("$ #,##0.00");
		return "Employee type: HourlyEmployee\n" + super.toString() 
		+ "\n==Salary details==\nHours worked: " 
		+ hoursWorked + "\nHourly wage: " + df3.format(hourlyWage);
	}
	
}
