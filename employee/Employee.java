package employee;

public class Employee {
    //Private Instance Variable 
	private String name;
	private int age;
	private float salary;

    // parametrized constructor to intialize employee object
    public Employee(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    } 

	// Getter & Setter method for Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	// Getter & Setter for Salary
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}


	// Getter & Setter for age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	// get Employee Details
	public String getEmployeeDetails() {
		return " Name: " +name
				+ "\n Age: "+age 
				+ " \nSalary: "+salary;
	}
	
    // Method to update employee details from a passed scanner
    public void setNewValues(java.util.Scanner input){
        input.nextLine();
        System.out.print("Enter new employee name: ");
        name = input.nextLine();
        setName(name);
        
        System.out.print("Enter Employee age:");
        age = input.nextInt();
        input.nextLine(); // consume leftover newline
        setAge(age);

        System.out.print("Enter salary: ");
        salary = input.nextFloat();
        input.nextLine();
        setSalary(salary);
        
    }
}

