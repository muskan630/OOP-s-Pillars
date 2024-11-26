package employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Employee Class object
        Employee employee = new Employee("Purnima", 21, 400000);

        // Print initial employee details
        System.out.println("\nInitial Employee Details: ");
        System.out.println(employee.getEmployeeDetails());

        // User Input for updating details
        System.out.print("\nEnter Employee Name: ");
        String name = input.nextLine();
        employee.setName(name);

        System.out.print("Enter Employee age: ");
        int age = input.nextInt();
        input.nextLine(); // consume the leftover newline
        employee.setAge(age);

        System.out.print("Enter Employee Salary: ");
        float salary = input.nextFloat();
        input.nextLine(); // consume the leftover newline
        employee.setSalary(salary);

        // Updated list
        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee.getEmployeeDetails());

        // Ask if the user wants to set new values
        System.out.println("\nWant to set a new value (Yes or No)?");

        while (true) {
            System.out.print("Options: 1. Yes  2. No\n");
            System.out.print("Enter Your choice: ");
            int choice = input.nextInt();
           
            switch (choice) {
                case 1:
                    employee.setNewValues(input);
                    System.out.println("Updated list:");
                    System.out.println(employee.getEmployeeDetails());
                    break;
                case 2:
                System.out.println("Thank You!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice, please enter 1 or 2.");
                    break;
            }
        }
    }
}
