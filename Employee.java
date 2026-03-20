package expriment3;

public class Employee {
	String name;
    int id;

    double calculateSalary(double salary) {
        return salary;
    }

    double calculateSalary(double salary, double bonus) {
        return salary + bonus;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("Department: " + department);
    }
}

 class EmployeeManagement   {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.name = "Anuradha";
        m.id = 101;
        m.department = "HR";

        m.displayDetails();

        double salary = m.calculateSalary(50000, 10000);
        System.out.println("Total Salary: " + salary);
    }
}

