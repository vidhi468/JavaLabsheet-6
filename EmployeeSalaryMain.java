// Q10: Abstract Employee with Manager and Programmer
abstract class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double monthlySalary;
    private double bonus;

    Manager(String name, double monthlySalary, double bonus) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return monthlySalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Manager, Name: " + name);
        System.out.println("Salary: Rs. " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double monthlySalary;
    private double overtimePay;

    Programmer(String name, double monthlySalary, double overtimePay) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.overtimePay = overtimePay;
    }

    @Override
    double calculateSalary() {
        return monthlySalary + overtimePay;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Programmer, Name: " + name);
        System.out.println("Salary: Rs. " + calculateSalary());
    }
}

public class EmployeeSalaryMain {
    public static void main(String[] args) {
        Employee manager = new Manager("Aman", 70000, 10000);
        Employee programmer = new Programmer("Neha", 50000, 5000);
        manager.displayInfo();
        programmer.displayInfo();
    }
}
