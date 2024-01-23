package iuh.fit.chopper;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Manager extends SalariedEmployee{
	private double weeklyBonus;

	public Manager() {
		super();
	}

	public Manager(String id, String name, LocalDate dob, double annualSalary,double weeklyBonus) {
		super(id, name, dob, annualSalary);
		this.weeklyBonus = weeklyBonus;
	}


	public double getWeeklyBonus() {
		return weeklyBonus;
	}


	public void setWeeklyBonus(double weeklyBonus) {
		this.weeklyBonus = weeklyBonus;
	}


	@Override
	public double weeklyPay() {
		return annualSalary / 4 + weeklyBonus;
	}

	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df2 = new DecimalFormat("$ #,##0.00");
		return "Employee type: Manager\n" + "Id: " + id + "\nName: " + name + "\nDate of birth: " 
		+ df.format(dob) + "\nWeekly total salary: " + df2.format(weeklyPay())
		+ "\n==Salary details==\nAnnual salary: " + df2.format(annualSalary) 
		+ "\nWeekly Bonus: " + df2.format(weeklyBonus);
	}
	
	
}
