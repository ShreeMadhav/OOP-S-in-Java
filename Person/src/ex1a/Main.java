package ex1a;

class Person {
    // Properties
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.age = 18; // Default age
    }

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // New method to update name and age
    public void updateDetails(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    // Getters for name and age (optional)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to test the Person class
public class Main {
    public static void main(String[] args) {
        // Creating a person with name and age
        Person person1 = new Person("Alice", 25);
        person1.display(); // Output: Name: Alice, Age: 25

        // Using the updateDetails method to change name and age
        person1.updateDetails("Bob", 30);
        person1.display(); // Output: Name: Bob, Age: 30
    }
}