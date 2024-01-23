package iuh.fit.chopper;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeList {
	private int currentSize = 0;
	Employee[] employees;
	
	
	public EmployeeList() {
		this(10);
	}

	public EmployeeList(int i) {
		employees = new Employee[i];
	}

	public int getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}

	public Employee[] getEmployees() {
		return Arrays.copyOf(employees, currentSize);
	}

	public void addEmployees(Employee emp) {
		int i = indexOfEmployee(emp.getId());
		if(i >= 1)
			throw new IllegalArgumentException("Employee with ID " + emp.getId() + " already exists.");
		if(currentSize == employees.length)
			grow();
		employees[currentSize++] = emp;
	}

	private void grow() {
		int newsize = (int)Math.ceil(employees.length * 1.5);
		Arrays.copyOf(employees, newsize);
	}

	public int indexOfEmployee(String id) {
		for(int i = 0;i < currentSize;i++) {
			if(employees[i].getId().equals(id))
				return i;
		}
		return -1;
	}
	public Employee searchEmployeeById (String Id) {
		for(int i = 0;i < currentSize;i++) {
			if(employees[i].getId().equals(Id))
				return employees[i];
		}
		return null;
	}
	public void addAll(Employee[] emps) {
		Arrays.stream(emps).forEach(emp -> addEmployees(emp));
	}
	
	public void sortByWeeklySalary () {
		Arrays.sort(employees,0,currentSize,Comparator.comparing(Employee::weeklyPay));
	}
	
	public void removeEmployee (String id) {
		int i = indexOfEmployee(id);
		if(i < 0)
			throw new IllegalArgumentException("Employee with ID " + id + " does not exist.");
		
		Employee[] tmp = Arrays.stream(employees,0,currentSize)
		.filter(employee -> employee.getId() != id)
		.toArray(x -> new Employee[x]);
		
		currentSize--;
		employees = Arrays.copyOf(tmp, tmp.length + 1);
	}
	
    public void updateEmployee(Employee newInfor) {
		if(indexOfEmployee(newInfor.id) < 0) 
			throw new IllegalArgumentException("Employee with ID " + newInfor.id + " does not update.");
		employees[indexOfEmployee(newInfor.id)] = newInfor;
	}
	
	public Employee[] getHourlyEmpsWorkMoreThan40 () {
		HourlyEmployee[] emps = new HourlyEmployee[currentSize];
		int n = 0;
		for(int i = 0;i < employees.length;i++) {
			if(employees[i] instanceof HourlyEmployee && ((HourlyEmployee)employees[i]).getHoursWorked()>40) {
				emps[n] = (HourlyEmployee) employees[i];
				n++;
			}
		}
		return Arrays.copyOf(emps, n);
	}
	
	public double getWeeklyTotalSalaryOfManager () {
		double sum = 0;
		for(int i = 0;i < employees.length;i++) {
			if(employees[i] instanceof Manager) {
			Manager tmp = (Manager)employees[i];
			sum += tmp.weeklyPay();
			}
		}
		return sum;
	}
	
	public void updateHourlyWorked (String id,int newHour) {
		int index = indexOfEmployee(id);
        if (index > 0) {
            Employee emp = employees[index];
            if (emp instanceof HourlyEmployee) {
                HourlyEmployee hourlyEmp = (HourlyEmployee) emp;
                if (newHour >= 0) {
                    hourlyEmp.setHoursWorked(newHour);
                } else {
                    throw new IllegalArgumentException("Hours worked cannot be negative.");
                }
            } else {
                throw new IllegalArgumentException("Employee with ID " + id + " is not an hourly employee.");
            }
        } else {
            throw new IllegalArgumentException("Employee with ID " + id + " does not exist.");
        }
	}
	public Employee[] getYoungEmployeesAsManagers  () {
		Employee[] emps = new Employee[currentSize];
		int n = 0;
		for(int i = 0;i < employees.length;i++) {
			if(employees[i] instanceof Manager) {
			Manager tmp = (Manager)employees[i];
			if(LocalDate.now().getYear() - tmp.getDob().getYear() < 30)
				emps[n++] = tmp;
			}
		}
		return Arrays.copyOf(emps, n);
	}
}
