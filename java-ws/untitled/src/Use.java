//void f2(){}// function
public class Use {

      static void f3(){ // method
          System.out.println("Use class f3 method");
      }

      void f4(){ // instance
          System.out.println("Use class f4 method");
      }

      void f5(){
          System.out.println("Use class f5");
          f4();
          // access Test class f1 method
          Test t=new Test();
          t.f1();
      }

    public static void main(String[] args) {
        f3();
        Test.f2();

        Test t=new Test();
        t.f1();

        Use u=new Use();
       // u.f4();
        u.f5();

    }
}
