import java.io.PrintStream;

public class Test {

     static final String companyName="CTS"; // const
     void f3(){
         System.out.println(">>> i am f3 method");
         System.out.println(".....");

       // .jar //
     } // instance method
     static void f1(){// static method
         System.out.println(">>>> Test class f1 method");
     }

    /**
     *  imp-note:
     *  -> non-static / instance content can not be invoked from static methods directly
     *  -> object is needed to invoke instance methods / data from static methods
     *
     */

    public static void main(String[] args) { // entry point
        //PrintStream pw=new PrintStream(System.out);
      //  pw.println(">>>> hey .. i am pw oject ");
        //companyName="bla bla";

        System.out.println("Company: "+companyName);
        Test t=new Test();
        t.f3();
        f1(); // static method can be called directly from the same class
        Sample.f2(); // static method can be called with  a class name from other class

       System.out.println(">>> this is new text.....");

        /**
         *    System is a class in java.lang package
         *    out is a static object of type java.io.PrintStream in System class
         *    combination of System.out gives you PrintStream clas object
         *    println is a method of a class java.io.PrintStream class
         *    on top of PrintStream class object, println method can be invoked
         */



    }

}
