abstract class C1{
    C1(){}
    abstract void f1();
    abstract void f2();
}

class C2 extends  C1{
    @Override
    void f1() {}
    @Override
    void f2() {}
}
abstract class  C3 extends C1{
    @Override
    void f1() {}
}
class C4 extends C3{
    @Override
    void f2() {}
}

public class Use {
    public static void main(String[] args) {

        C1 c1=new C2();
        C3 c3=new C4();
        c3.f1();
        c3.f2();
        c1.f1();
        c1.f2();


    }
}
