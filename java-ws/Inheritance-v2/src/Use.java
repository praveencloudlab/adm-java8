class Calculator{
    int calulate(int x,int y){
        return 0;
    }
}
class Sub extends Calculator{
    @Override
    int calulate(int x, int y) {
        return x-y;
    }
}

class Sum extends Calculator{
    @Override
    int calulate(int x, int y) {
        return x+y;
    }
}



class T1{

     int x=100;
    void f1(){
        System.out.println(">> T1 f1 method");
    }
    void f2(){
        System.out.println(">> T2 f2 method");
    }
}

public class Use extends T1{
    @Override
    void f2() {
        //super.f2(); // invokes super class method, constructors and prperties
       // super.x=10000;
        System.out.println(">> Use class f2 method "+x);
    }

    public static void main(String[] args) {
       // Use u=new Use();
       // u.f2(); // subclass overridden method

        Sum s=new Sum();
        Sub ss=new Sub();
        System.out.println(s.calulate(100,200));
        System.out.println(ss.calulate(200,100));
    }
}
