import java.util.Scanner;

class Employee{
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    // Constructor to initialize employee details
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    // Method to calculate gross salary
    public void calculateGrossSalary() {
        double DA = 0.80 * basic_salary;  // DA is 80% of basic salary
        double HRA = 0.20 * basic_salary; // HRA is 20% of basic salary
        gross_salary = basic_salary + DA + HRA;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}
public class Assignment2_14{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept employee details from the user
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();

        scanner.nextLine();  // Consume newline left-over

        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        // Create an Employee object
        Assignment2_14 emp = new Assignment2_14(emp_id, emp_name, basic_salary);

        // Calculate gross salary
        emp.calculateGrossSalary();

        // Display employee details including gross salary
        emp.displayEmployeeDetails();

        
    }
}
