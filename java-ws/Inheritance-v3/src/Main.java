class Employee{
    double salary;
    String empName;
    public void processSalary(){ // use less
    }
    public void display(){
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
        Employee emp=new ContractEmployee();
        emp.processSalary();
        emp.display();
        emp=new RegularEmployee();
        emp.processSalary();
        emp.display();
    }
}
