package employee;

import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// Employee Class object
	Employee employee = new Employee("Purnima", 21,400000);
	EmployeeTest employeeTest = new EmployeeTest();

    // print initial employee details
    System.out.println("\nInitial Employee Details: ");
    System.out.println(employee.getEmployeeDetails());

	// User Input for updating details
	System.out.print("\nEnter Employee Name: ");
	String name = input.nextLine();
	employee.setName(name);
	System.out.print("Enter Employee age: ");
	int age = input.nextInt();
    input.nextLine();
	employee.setAge(age);
	System.out.print("Enter Employee Salary: ");
	float salary = input.nextFloat();
    input.nextLine();
	employee.setSalary(salary);
	
    //Updated list 
    System.out.println("\nUpdated Employee Details:");
    System.out.println(employee.getEmployeeDetails());
	 
    //Ask if user want to set new value 
    System.out.println("\nWant to set a new value (Yes or No) ? ");

    while (true) {
        System.out.print("Options: 1. Yes ");
        System.out.println( "2. No");
        System.out.print("Enter Your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                employee.setNewValues(input);
                System.out.println( "Updated list: ");
                System.out.println(employee.getEmployeeDetails());
                break;
            case 2:
                 return;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    
	}

}
