public  class Employee { // concrete class
    /*
    What class contains?
    ----------------------
    1. instance properties / fields / variables
    2. static properties
    3. instance methods
    4. static methods
    5. constructors
    6. instance blocks
    7. static blocks
    8. inner classes
    9. interfaces

     properties / fields / variables
     ------------------------------------
     1. instance variables
     2. static variables
     3. final variables
     4. enumerations (enum)


     variables
     ------------
     1. instance : unique copy for each object
     2. static   : common copy for all objects
     3. final // const...
     4. enums // fixed const

     methods
     ----------------------
          1. instance methods
          2. static methods
          3. final methods : can not be overridden in sub class
          4. native methods // other than java (i.e c and cpp code)

      types of classes
      ------------------
      1. concrete class
      2. abstract class // we can not create an object to this class
      3. final class // this class can not be inherited

     instance data
     -----------------
     -> instance data is unique to each class object
     -> data of instance is unique to all class objects
     -> each object contains separate copy of instance data

     static data
     ----------------
     -> data of static is common for all class objects
     -> all objects contains same copy of static data

     imp notes
     ----------
     -> static methods never allow instance data  directly to access
     -> static methods always allow static data directly
     -> instance methods always allow static and instance data to access
     -> static data can be called/invoked directly from any methods with in same class
     -> static data can be called/invoked with class name from other classes

      what is object?
      ------------------
      -> every object contains behaviour and actions
        -> behaviour - variables
        -> actions   - methods

      why to create an object?
      ----------------------------
      -> we need object to access instance data from static methods

      where to create object?
      -----------------------------
      -> all static methods required objects to access instance data
         from the same class
      -> all static and non-static methods required objects to access instance data
          from other classes







     */

    int empId; // instance variable / field : zero is default value for int
    String empName; // null is default value
    double salary; // 0.0 is default for float and double
    char gender;// default value for char is '' (blank space)
    boolean isResident; // false is default value for boolean

    static int y=1000; // static variable
    static String mgrName="James";
    static String companyName="CTS";

    void f1(){ // instance method
        empId=100;
        y=98;
    }

    void display(){ // non static
        System.out.println("Emp Id: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Salary: "+salary);
        System.out.println("resident? "+isResident);
        System.out.println("Gender: "+gender);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
         // empId=100; // error
          y=100; // allowed
       // f1(); // error

        // how to create object? : use new operator followed by constructor
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.empId=10;
        e1.empName="Abc";
        e1.gender='M';
        e1.isResident=true;
        e1.salary=120;

        e2.empId=11;
        e2.empName="Xyz";
        e2.gender='F';
        e2.isResident=false;
        e2.salary=150;

        e1.display(); // displays e1 object content only
        e2.display(); // displays e2 object content only

        System.out.println(e1.mgrName);
        System.out.println(e1.companyName);
        System.out.println("==========================");
        //e1.mgrName="Prem"; // invoking static data using object is not recamended
        System.out.println(e2.mgrName);
        System.out.println(e2.companyName);



        /*
        System.out.println("Employee ID: "+e1.empId);
        System.out.println("Y: "+y);
        System.out.println("name: "+e1.empName);
        System.out.println("Gender: "+e1.gender);
        System.out.println("IsResident? : "+e1.isResident);
        System.out.println("Salary: "+e1.salary);

         */

        // imp note
        // local variables must be initilized before use them.
        // local variables never have default data
         int maxAge; // local variable
       // System.out.println(maxAge); // error





    }
}
