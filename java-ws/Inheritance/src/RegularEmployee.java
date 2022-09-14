class T1{
    void f1(){}
}
class T2 extends  T1{
    void f1(){}
}
public class RegularEmployee extends Employee{

     // method overloading : static / compile time binding
       void f1(){}
      // void f1(){} // invalid
       void f1(int x){}
       void f1(double d){}
       void f1(int x,int y){}
       void f1(int x,float y){}
       void f1(float x,int y){}

     private int noOfDaysWorked;
      public void acceptData(int empId,String empName,int noOfDaysWorked){
          this.setEmpId(empId); // which ever object called this method acceptData
          this.setEmpName(empName);
          this.noOfDaysWorked=noOfDaysWorked;
      }

    /**
     * Method overloding: defining same method with different signature
     *      signature:
     *          -> name of method
     *          -> number of arguments
     *          -> type of arguments
     *          -> position of arguments
     * method overridding: defining same method with same signature
     */
      @Override
      public void processSalary(){
          this.setSalary(noOfDaysWorked*5000);
      }
}
