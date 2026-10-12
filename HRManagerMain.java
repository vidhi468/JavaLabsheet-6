// Q4: Employee and HRManager method overriding
class Employee {
    protected double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working.");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    HRManager(double salary) {
        super(salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    void addEmployee(String name) {
        System.out.println("Added employee: " + name);
    }
}

public class HRManagerMain {
    public static void main(String[] args) {
        HRManager hr = new HRManager(55000.0);
        hr.work();
        System.out.println("Salary: Rs. " + hr.getSalary());
        hr.addEmployee("Riya");
    }
}
