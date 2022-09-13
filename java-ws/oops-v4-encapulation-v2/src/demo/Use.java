package demo;
import cts.C2;
import cts.C3;
import p1.C1;
public class Use extends C1{
    public static void main(String[] args) {
        // Q1: Can I create C1 class Obj?
       C1 c1=new C1();
       C2 c2=new C2();
       C3 c3=new C3();

       Use u=new Use();

       c1.f5();

       //c1.f2();
       // c1.f3();
        //.f3();
       // c1.f1();
       //c2.f2();
       //c3.f3();

    }
}
