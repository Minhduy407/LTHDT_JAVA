package iuh.fit.chopper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();

        List<Employee> emps = List.of(
                new HourlyEmployee("H001", "Morgan, Harry", LocalDate.of(1995, 2, 12), 40, 10.0),
                new HourlyEmployee("H011", "Luffy, MonkeyD", LocalDate.of(1975, 2, 12), 50, 10.0),
                new SalariedEmployee("S002", "Lin, Sally", LocalDate.of(1999, 12, 12), 52000),
                new Manager("S003", "Smith, Mary", LocalDate.of(1975, 8, 22), 120000, 50),
                new Manager("S004", "Smith, Mary", LocalDate.of(1999, 6, 25), 80000, 40)
        );
        
        Set<Employee> empSet = new HashSet<>(emps);
        list.addAll(empSet);
        int choice;
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
            System.out.println("10. List of employees who are young managers (less than 30 years old)");
            System.out.println("11. This method returns a map of number of employees by year of birth");
            System.out.println("12. Number of employees by year of birth");
            System.out.println("13. Sort number of employees by year of birth by values");
            System.out.println("14. Sort number of employees by year of birth by key");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Display all employees");
                    list.getEmployees()
                    .forEach(System.out::println);
                }
                case 2 -> {
                    System.out.println("Add a new employee");
                    Employee emp = inputEmployee();
                    list.addEmployee(emp);
                }
                case 3 -> {
                    System.out.println("Search employee by id");
                    sc.nextLine();
                    System.out.println("Enter id search: ");
                    String id = sc.nextLine();
                    Employee emp = list.searchEmployeeById(id);
                    if(emp == null)System.out.println("Not found");
                    else
                    System.out.println(emp);
                }
                case 4 -> {
                    System.out.println("Sort by weekly salary");
                    list.sortByWeeklySalary()
                    .forEach(System.out::println);
                }
                case 5 -> {
                    System.out.println("Search employee by id");
                    sc.nextLine();
                    System.out.println("Enter id remove: ");
                    String id = sc.nextLine();
                    boolean r = list.removeEmployee(id);
                    System.out.println(r);
                }
                case 6 -> {
                    System.out.println("Update employee by id");
                    sc.nextLine();
                    System.out.println("Enter id update: ");
                    String id = sc.nextLine();
                    Employee emp = list.searchEmployeeById(id);
                    if(emp instanceof Manager) {
                    	System.out.println("Enter employee name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter employee birthday: d/M/yyyy");
                        String birthday = sc.nextLine();
                        LocalDate date = DateTimeFormatter.ofPattern("d/M/yyyy").parse(birthday, LocalDate::from);
                        System.out.println("Enter annual salary: ");
                        double salary1 = sc.nextDouble();
                        System.out.println("Enter weekly bonus: ");
                        double bonus = sc.nextDouble();
                        emp = new Manager(id, name, date, salary1, bonus);
                    }
                    if(emp instanceof SalariedEmployee) {
                    	System.out.println("Enter employee name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter employee birthday: d/M/yyyy");
                        String birthday = sc.nextLine();
                        LocalDate date = DateTimeFormatter.ofPattern("d/M/yyyy").parse(birthday, LocalDate::from);
                        System.out.println("Enter annual salary: ");
                        double salary1 = sc.nextDouble();
                        emp = new SalariedEmployee(id, name, date, salary1);
                    }
                    if(emp instanceof HourlyEmployee) {
                    	System.out.println("Enter employee name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter employee birthday: d/M/yyyy");
                        String birthday = sc.nextLine();
                        LocalDate date = DateTimeFormatter.ofPattern("d/M/yyyy").parse(birthday, LocalDate::from);
                        System.out.println("Enter hours worked: ");
                        int hours = sc.nextInt();
                        System.out.println("Enter hourly rate: ");
                        double rate = sc.nextDouble();
                        emp = new HourlyEmployee(id, name, date, hours, rate);
                    }
                }
                case 7 -> {
                    System.out.println("List hourly employees who work more than 40 hours a week");
                    list.getHourlyEmpsWorkMoreThan40()
                    .forEach(System.out::println);
                }
                case 8 -> {
                    System.out.println("Print the total weekly salary of all managers");
                    double x = list.getWeeklyTotalSalaryOfManager();
                    System.out.println(x);
                }
                case 9 -> {
                    System.out.println("Update hourly worked of hourly employee by id");
                    sc.nextLine();
                    System.out.println("Enter id update: ");
                    String id = sc.nextLine();
                    System.out.println("Enter hours worked: ");
                    int hours = sc.nextInt();
                    list.updateHourlyWorked(id, hours);
                }
                case 10 -> {
                    System.out.println("List of employees who are young managers (less than 30 years old)");
                    list.getYoungEmployeesAsManagers()
                    .forEach(System.out::println);
                }
                case 11 -> {
                    System.out.println("Map of number of employees by year of birth");
                    list.getYOBSet()
                    .forEach(System.out::println);
                }
                case 12 -> {
                    System.out.println("Number of employees by year of birth");
                    list.getNoOfEmployeesByYOB()
                    .entrySet()
                    .forEach(entry -> {
                    	System.out.println("Year of birth: " + entry.getKey());
                    	System.out.println("Number of employees: " + entry.getValue());
                    });
                }
                case 13 -> {
                    System.out.println("Sort number of employees by year of birth");
                    list.sortNoOfEmployeesByYOB()
                    .entrySet()
                    .forEach(entry -> {
                    	System.out.println("Year of birth: " + entry.getKey());
                    	System.out.println("Number of employees: " + entry.getValue());
                    });
                }
                case 14 -> {
                    System.out.println("Sort number of employees by year of birth");
                    list.sort2NoOfEmployeesByYOB()
                    .entrySet()
                    .forEach(entry -> {
                    	System.out.println("Year of birth: " + entry.getKey());
                    	System.out.println("Number of employees: " + entry.getValue());
                    });
                }
                case 0 -> System.out.println("Exit");
            }
        } while (choice != 0);
    }

    private static Employee inputEmployee() {
        Employee emp = null;
        System.out.println("Enter employee type: 1-Hourly, 2-Salaried, 3-Manager");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee id: ");
        String id = sc.nextLine();
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter employee birthday: d/M/yyyy");
        String birthday = sc.nextLine();
        LocalDate date = DateTimeFormatter.ofPattern("d/M/yyyy").parse(birthday, LocalDate::from);

        switch (type) {
            case 1:
                System.out.println("Enter hours worked: ");
                int hours = sc.nextInt();
                System.out.println("Enter hourly rate: ");
                double rate = sc.nextDouble();
                emp = new HourlyEmployee(id, name, date, hours, rate);
                break;
            case 2:
                System.out.println("Enter annual salary: ");
                double salary = sc.nextDouble();
                emp = new SalariedEmployee(id, name, date, salary);
                break;
            case 3:
                System.out.println("Enter annual salary: ");
                double salary1 = sc.nextDouble();
                System.out.println("Enter weekly bonus: ");
                double bonus = sc.nextDouble();
                emp = new Manager(id, name, date, salary1, bonus);
                break;
        }

        return emp;
    }
}