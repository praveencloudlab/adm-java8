public class Employee {
    private int empId;
    private String empName;
    private double salary;

    public void processSalary(){
        System.out.println(">>> Employee Process Salary");
    }
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
        //------------------
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Salary: "+salary);
        System.out.println("-------------------------------");
    }



}
