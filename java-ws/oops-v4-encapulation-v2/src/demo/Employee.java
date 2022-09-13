package demo;
public class Employee { // POJO: Plain old java object / Bean / Entity / Model
    private int empId;
    private String empName;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        salary=salary+10000;
        return salary;
    }

    public void setSalary(double salary) {
        // auth
        this.salary = salary;
    }

    public void display(){
        System.out.println("Id: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Salary: "+salary);
        System.out.println("-----------------------------");
    }
}
