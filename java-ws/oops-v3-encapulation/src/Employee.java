public class Employee {
    private int empId;
    private String name;
    private double salary;

    void processSalary(){
        salary=(1500*22)+5000;
    }

    void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("---------------------------");
    }

}
