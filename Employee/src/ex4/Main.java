package ex4;

class Person {
    // Attributes of Person
    String name;
    int age;

    // Constructor of Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Employee inheriting from Person
class Employee extends Person {
    // Additional attributes for Employee
    int employeeID;
    double salary;

    // Constructor of Employee using super to initialize Person's attributes
    public Employee(String name, int age, int employeeID, double salary) {
        // Calling the constructor of the base class (Person)
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeInfo() {
        // Displaying the Person's info first
        displayPersonInfo();
        // Displaying Employee-specific details
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee emp = new Employee("John Doe", 30, 1001, 50000.00);

        // Displaying the employee's full information
        emp.displayEmployeeInfo();
    }
}