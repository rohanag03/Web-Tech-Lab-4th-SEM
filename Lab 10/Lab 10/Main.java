import java.util.Scanner;
abstract class Employee {
    protected String name;
    protected String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void displayDetails();
}

class RegularEmployee extends Employee {
    private String department;
    private double salary;

    public RegularEmployee(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class CasualEmployee extends Employee {
    private int hours;
    private double rate;

    public CasualEmployee(String name, String address, int hours, double rate) {
        super(name, address);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Hours: " + hours);
        System.out.println("Rate: " + rate);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of employee " + (i+1) + ": ");
            String name = scanner.next();

            System.out.print("Enter the address of employee " + (i+1) + ": ");
            String address = scanner.next();

            System.out.print("Enter the type of employee (1 for Regular, 2 for Casual): ");
            int type = scanner.nextInt();

            switch(type) {
                case 1:
                    System.out.print("Enter the department of the employee: ");
                    String department = scanner.next();

                    System.out.print("Enter the salary of the employee: ");
                    double salary = scanner.nextDouble();

                    employees[i] = new RegularEmployee(name, address, department, salary);
                    break;

                case 2:
                    System.out.print("Enter the number of hours worked by the employee: ");
                    int hours = scanner.nextInt();

                    System.out.print("Enter the rate per hour of the employee: ");
                    double rate = scanner.nextDouble();

                    employees[i] = new CasualEmployee(name, address, hours, rate);
                    break;

                default:
                    System.out.println("Invalid employee type");
                    i--;
                    break;
            }
        }

        System.out.println("Regular Employees:");
        for (Employee e : employees) {
            if (e instanceof RegularEmployee) {
                e.displayDetails();
            }
        }

        System.out.println("Casual Employees:");
        for (Employee e : employees) {
            if (e instanceof CasualEmployee) {
                e.displayDetails();
            }
        }
    }
}