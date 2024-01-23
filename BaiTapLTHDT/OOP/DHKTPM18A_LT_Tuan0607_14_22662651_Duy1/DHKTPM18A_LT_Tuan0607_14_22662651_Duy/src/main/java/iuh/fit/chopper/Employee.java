package iuh.fit.chopper;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Employee {
	protected String id;
	protected String name;
	LocalDate dob;
	
	public Employee() {
		this("00","No name",LocalDate.now());
	}
	
	public Employee(String id, String name, LocalDate dob) {
		super();
		setId(id);
		setName(name);
		setDob(dob);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public abstract double weeklyPay();

	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df2 = new DecimalFormat("$ #,##0.00");
		
		return "Id: " + id + "\nName: " + name + "\nDate of birth: " + df.format(dob) + "\nWeekly total salary: " + df2.format(weeklyPay());
	}
	
}
