package iuh.fit.chopper;
/*
 * @ (#) Company.java       1.0     Sep 11, 2023
 *
 * Copyright (c) 2023 IUH. All rights reserved.
 */

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class EmployeeList {
	
	private Set<Employee> employees;

	/**
	 * Default constructor: Create a collection of employees
	 */
	public EmployeeList() {
		employees = new HashSet<>();
	}

	/**
	 * This method returns the collection of employees
	 * @return
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}

	/**
	 * This method adds a new employee to the list. 
	 * @param emp the new employee
	 * @throws IllegalArgumentException if the employee id is duplicated
	 */
	public boolean addEmployee(Employee emp) {
		return employees.add(emp);
	}

	/**
	 * Search the employee by id
	 * @param id
	 * @return
	 */
	public Employee searchEmployeeById(String id) {
		return employees.stream()
				.filter(x -> x.getId().equalsIgnoreCase(id))
				.findFirst()
				.orElse(null);
//		
//		Optional<Employee> temp = employees.stream()
//				.filter(x -> x.getId().equalsIgnoreCase(id));
	}

	/**
	 * This method adds an array of employees to the list
	 * @param emps the array of employees
	 */
	public void addAll(Set<Employee> emps) {
		employees.addAll(emps);
	}
	
	/**
	 * This method sorts the list by weekly salary of employees in ascending order
	 * @return
	 */
//	public Set<Employee> sortByWeeklySalary() {
//		return employees.stream()
//				.sorted(Comparator.comparing(Employee::weeklyPay))
//				.collect(Collectors.toCollection(LinkedHashSet::new));
//	}
	
	public Set<Employee> sortByWeeklySalary() {
		return employees.stream()
				.collect(Collectors.toCollection(
						()-> new TreeSet<>(Comparator.comparing(Employee::weeklyPay))
//						()-> new TreeSet<>()
						));
	}
	
	/**
	 * Remove an employee by id
	 * @param id the given id
	 * @throws IllegalArgumentException if the employee with the given id does not exist
	 */
	public boolean removeEmployee(String id) {
		Employee tmp = searchEmployeeById(id);
		if(tmp == null)
		return false;
		employees.remove(tmp);
		return true;
	}
	
	/**
	 * This method updates the information of an employee by id
	 * @param newInfor the new information
	 * @throws IllegalArgumentException if the employee with the given id does not exist
	 */
	public boolean updateEmployee(Employee newInfor) {
		Employee x1 = searchEmployeeById(newInfor.id);
		if(x1 != null) {
			x1 = newInfor;
			return true;
		}
		return false;
	}
	/**
	 * This method returns an array of employees who are hourly employees and work more than 40 hours per week
	 * @return an array of employees who are hourly employees and work more than 40 hours per week
	 */
	public Set<Employee> getHourlyEmpsWorkMoreThan40() {
		return employees.stream()
				.filter(x -> x instanceof HourlyEmployee)
				.filter(x -> ((HourlyEmployee)x).getHoursWorked() > 40)
				.collect(Collectors.toSet());
	}
	
	/**
	 * This method returns the total salary of all managers
	 * @return the total salary of all managers
	 */
	public double getWeeklyTotalSalaryOfManager () {
		return employees.stream()
			   .filter(x -> x instanceof Manager)
			   .collect(Collectors.summingDouble(Employee::weeklyPay));
	}
	
	/**
	 * This method updates the hourly work of an hourly employee by id
	 * @param id the given id
	 * @param newHour the new hourly worked
	 * @throws IllegalArgumentException if the new hourly worked is less than 0
	 * @throws IllegalArgumentException if the employee with the given id does not exist or the employee is not an hourly employee
	 */
	public void updateHourlyWorked(String id, int newHour) {
		if(newHour < 0) throw new IllegalArgumentException("Hours worked cannot be negative.");
		Employee x1 = searchEmployeeById(id);
		if(x1 == null)throw new IllegalArgumentException(id + " does not exist");
		if(x1 instanceof HourlyEmployee) {
			HourlyEmployee emp1 = (HourlyEmployee)x1;
			emp1.setHoursWorked(newHour); 
			return;
		}
		throw new IllegalArgumentException("The employee is not an hourly employee");
	}

	/**
	 * This method returns an array of employees who are young managers (less than 30 years old)
	 * @return an array of employees who are young managers (less than 30 years old)
	 */
	public Set<Employee> getYoungEmployeesAsManagers() {
		return employees.stream()
				.filter(x -> x instanceof Manager)
				.filter(x -> LocalDate.now().getYear() - x.getDob().getYear() < 30)
				.collect(Collectors.toSet());
	}
	
	/**
	 * This method returns a map of number of employees by year of birth
	 * @return a map of number of employees by year of birth
	 */
	public Map<Integer, Long> getNoOfEmployeesByYOB() {
		return employees.stream()
				.map(emp -> emp.getDob().getYear())
				.collect(Collectors.groupingBy(y -> y, Collectors.counting()));
	}
	
	/**
	 * This method returns a map of number of employees by year of birth
	 * @return sort a map of number of employees by year of birth
	 */
	public Map<Integer, Long> sortNoOfEmployeesByYOB() {
		return employees.stream()
				.map(emp -> emp.getDob().getYear())
				.collect(Collectors.groupingBy(y -> y, Collectors.counting()))
				.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2) -> e1,TreeMap::new));
	}
	
	/**
	 * This method returns a map of number of employees by year of birth
	 * @return sort a map of number of employees by year of birth
	 */
	public Map<Integer, Long> sort2NoOfEmployeesByYOB() {
		return employees.stream()
				.map(emp -> emp.getDob().getYear())
				.collect(Collectors.groupingBy(y -> y, Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2) -> e1,LinkedHashMap::new));
	}
	
	/**
	 * This method returns a map of total weekly salary of all employees by employee type, sorted in ascending order of total salary
	 * @return a map of total weekly salary of all employees by employee type, sorted in ascending order of total salary
	 */
	public Map<String, Double> getTotalWeeklySalary() {
		return employees.stream()
				.collect(Collectors.groupingBy(x -> x.getClass().getSimpleName(),Collectors.summingDouble(Employee::weeklyPay)));
	}

	/**
	 * This method returns a set of year of birth of all employees, sorted in descending order
	 * @return a set of year of birth of all employees, sorted in descending order
	 */
	public Set<Integer> getYOBSet() {
		return employees.stream()
				.map(emp -> emp.getDob().getYear())
				.collect(Collectors.toCollection(
					() -> new TreeSet<>(Collections.reverseOrder())
				))
				;
	}
}



