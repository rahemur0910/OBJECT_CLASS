/*
Create a class called Employee that includes three pieces of information as instance variables— a first name (type
String), a last name (type String) and a monthly salary (double). Your class should have a constructor that initializes the
three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive,
set it to 0.0. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two
Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each
Employee’s yearly salary again.

sample output:

Employee 1: Bob Jones; Yearly Salary: 34500.00
Employee 2: Susan Baker; Yearly Salary: 37809.00

Increasing employee salaries by 10%
Employee 1: Bob Jones; Yearly Salary: 37950.00
Employee 2: Susan Baker; Yearly Salary: 41589.90
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void raiseSalary(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }
}

class EmployeeInput {
    private BufferedReader reader;

    public EmployeeInput() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public Employee createEmployee() throws IOException {
        System.out.print("First name: ");
        String firstName = reader.readLine();
        System.out.print("Last name: ");
        String lastName = reader.readLine();
        System.out.print("Monthly salary: ");
        double monthlySalary = Double.parseDouble(reader.readLine());

        return new Employee(firstName, lastName, monthlySalary);
    }

    public void closeReader() throws IOException {
        reader.close();
    }
}

public class EmployeeTest {
    public static void main(String[] args) throws IOException {
        EmployeeInput input = new EmployeeInput();

        System.out.println("Enter details for Employee 1:");
        Employee employee1 = input.createEmployee();

        System.out.println("\nEnter details for Employee 2:");
        Employee employee2 = input.createEmployee();

        System.out.println("\nEmployee 1 details:");
        displayEmployeeDetails(employee1);

        System.out.println("\nEmployee 2 details:");
        displayEmployeeDetails(employee2);

        System.out.println("\nIncreasing employee salaries by 10%");
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        System.out.println("\nEmployee 1 updated details:");
        displayEmployeeDetails(employee1);

        System.out.println("\nEmployee 2 updated details:");
        displayEmployeeDetails(employee2);

        input.closeReader();
    }

    private static void displayEmployeeDetails(Employee employee) {
        System.out.printf("Name: %s %s; Yearly Salary: %.2f%n",
                          employee.getFirstName(), employee.getLastName(), employee.getYearlySalary());
    }
}
