abstract class Employee{
    double salary;
    String empName;
    //abstract void f5();
    public abstract void processSalary();// all subclasses of Employee must override abstract method : processSalary
    public void display(){ // concrete method
        System.out.println("Name: "+empName);
        System.out.println("Salary: "+salary);
    }
}
class ContractEmployee extends Employee{
    @Override
    public void processSalary() {
        this.empName="Praveen";
        this.salary=22*5000;
    }
}
class RegularEmployee extends Employee{
    @Override
    public void processSalary() {
        this.empName="James";
        this.salary=22*12000;
    }
}

public class Main {
    public static void main(String[] args) {
        //Employee eee=new Employee();
        Employee emp=new ContractEmployee();
        emp.processSalary();
        emp.display();
        emp=new RegularEmployee();
        emp.processSalary();
        emp.display();
    }
}
