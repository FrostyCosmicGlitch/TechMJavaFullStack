import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double sal;
    private int yearsWorked;


    public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }


    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Monthly Salary: " + sal);
        System.out.println("Years Worked: " + yearsWorked);
        System.out.println("Loan Eligibility: " + getLoanEligibility());
    }


    public String getLoanEligibility() {
        if (yearsWorked <= 5) {
            return "Not Eligible (Work experience should be greater than 5 years)";
        }

        double annualSalary = sal * 12;
        if (annualSalary >= 15_00_000) {
            return "Eligible for 7 Lakhs Loan";
        } else if (annualSalary >= 10_00_000) {
            return "Eligible for 5 Lakhs Loan";
        } else if (annualSalary >= 6_00_000) {
            return "Eligible for 2 Lakhs Loan";
        } else {
            return "Not Eligible (Salary below required threshold)";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double sal = scanner.nextDouble();

        System.out.print("Enter Years Worked: ");
        int yearsWorked = scanner.nextInt();

        emp.setEmployeeDetails(empId, empName, sal, yearsWorked);
        System.out.println("\nEmployee Details:");
        emp.getEmployeeDetails();
    }
}
