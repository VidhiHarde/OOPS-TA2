class Employee {
    String name;
    double salary;

    // Constructor with parameters
    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    // Default constructor
    Employee() {
        name = "Unknown";
        salary = 0;
    }

    // Overloaded method to add salary
    void addSalary(double amount) {
        salary += amount;
    }

    // Overloaded method to add salary with a percentage
    void addSalary(int percentage) {
        salary += (salary * percentage / 100);
    }

    // Destructor method
    protected void finalize() {
        System.out.println(name + " object is destroyed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 5000);
        e1.addSalary(500);  // Adding salary using amount
        e1.addSalary(10);   // Adding salary using percentage

        System.out.println("Employee: " + e1.name);
        System.out.println("Salary: " + e1.salary);
        
        // Destructor will be called when object is no longer referenced
    }
}

/* Ouput
Employee: Alice
Salary: 6000.0
Alice object is destroyed.
*/