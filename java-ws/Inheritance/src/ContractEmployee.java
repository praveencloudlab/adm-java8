public class ContractEmployee extends Employee{
    private int noOfHoursWorked;

    public void acceptData(int empId,String empName,int noOfHoursWorked){
        this.setEmpId(empId);
        this.setEmpName(empName);
        this.noOfHoursWorked=noOfHoursWorked;
    }

    @Override
     public  void processSalary(){
        this.setSalary(noOfHoursWorked*3000);
     }


}
