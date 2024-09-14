package TCSNQT_CODING.IPA;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter company name: ");
        String companyName = sc.nextLine() ;
        System.out.print("Enter number of employees: ");
        int numEmployee = sc.nextInt() ;
        sc.nextLine() ;

        Employee[] employees = new Employee[numEmployee] ;

        System.out.println("Enter employee details:");
        for (int i = 0 ; i < numEmployee ; i ++){
            System.out.println("Employee "+(i+1)+":");

            System.out.print("Enter id: ");
            int id = sc.nextInt() ;
            sc.nextLine() ;

            System.out.print("Enter name: ");
            String name = sc.nextLine() ;

            System.out.print("Enter designation: ");
            String designation = sc.nextLine() ;

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble() ;
            sc.nextLine() ;

            employees[i] = new Employee(id,name,designation,salary) ;
        }

        Company company = new Company(companyName,employees,numEmployee) ;
        System.out.println("Average salary: "+company.getAverageSalary());
        System.out.println("Max salary: "+company.getMaxSalary());
        System.out.print("Employees with designation: ");
        String requiredDesignation = sc.nextLine() ;
        company.getEmployeesByDesignation(requiredDesignation);
    }
}
/*
Create a class named "Employee" with the following attributes:

id (int)
name (String)
designation (String)
salary (double)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.
*/
class Employee {
    private int id ;
    private String name ;
    private String designation ;
    private double salary ;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    /*
        Implement the following methods in the Employee class:

        getSalary(): This method should return the salary of the employee.
        getDesignation(): This method should return the designation of the employee.
     */
    public double getSalary(){
        return this.salary ;
    }
    public String getDesignation(){
        return this.designation ;
    }
}
/*
Create a class named "Company" with the following attributes:

companyName (String)
employees (Employee array)
numEmployees (int)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.
*/
class Company {
    private String companyName ;
    private Employee[] employees ;
    private int numEmployees ;

    public Company(String companyName, Employee[] employees, int numEmployees) {
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }
    /*
    Implement the following methods in the Company class:

    getAverageSalary(): This method should return the average salary of all the employees in the company.
    getMaxSalary(): This method should return the highest salary of all the employees in the company.
    getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.
     */
    public double getAverageSalary(){
        double sumOfSalaryOfAllEmp = 0.000 ;

        for (int i = 0 ; i < this.numEmployees ; i ++){
            sumOfSalaryOfAllEmp += employees[i].getSalary() ;
        }

        double avgOfSalaryOfAllEmp = sumOfSalaryOfAllEmp / (double) this.numEmployees ;
        return avgOfSalaryOfAllEmp ;
    }
    public double getMaxSalary(){
        double maxSalaryOfAllEmp = Double.MIN_VALUE ;

        for (int i = 0 ; i < this.numEmployees ; i ++){
            maxSalaryOfAllEmp = Math.max(maxSalaryOfAllEmp, employees[i].getSalary());
        }

        return maxSalaryOfAllEmp ;
    }
    public void getEmployeesByDesignation(String  designation){
        designation = designation.toLowerCase().trim() ;

        for (int i = 0 ; i < this.numEmployees ; i ++){
            String currentEmployeesDesignation = employees[i].getDesignation() ;
            currentEmployeesDesignation = currentEmployeesDesignation.toLowerCase().trim() ;

            if (currentEmployeesDesignation.equals(designation)){
                printDetails(employees[i]);
            }
        }
    }
    private void printDetails(Employee employee){
        System.out.print("ID: "+employee.getId()+", ");
        System.out.print("Name: "+employee.getName()+", ");
        System.out.print("Designation: "+employee.getDesignation()+", ");
        System.out.print("Salary: "+employee.getSalary()+"\n");
    }
}