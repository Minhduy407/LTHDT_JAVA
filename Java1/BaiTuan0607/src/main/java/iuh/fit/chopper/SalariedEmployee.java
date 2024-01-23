package iuh.fit.chopper;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SalariedEmployee extends Employee{
	protected double annualSalary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String id, String name, LocalDate dob, double annualSalary) {
		super(id,name,dob);
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public double weeklyPay() {
		return annualSalary / 4;
	}

	@Override
	public String toString() {
		DecimalFormat df2 = new DecimalFormat("$ #,##0.00");
		return "Employee type: SalariedEmployee\n" + super.toString() 
		+ "\n==Salary details==\nAnnual salary: " + df2.format(annualSalary);
	}

}
