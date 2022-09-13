package demo;
public class Test {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Employee emp1=new Employee();
        //emp.empId=98;
        emp.setEmpId(98);
        emp.setEmpName("Praveen");
        emp.setSalary(15000);

        emp1.setEmpId(11);
        emp1.setEmpName("Ruth");
        emp1.setSalary(123456);

        emp.display();
        emp1.display();

       // System.out.println("Id: "+emp.getEmpId());
        //System.out.println("Name: "+emp.getEmpName());
       // System.out.println("Salary: "+emp.getSalary());

    }
}
