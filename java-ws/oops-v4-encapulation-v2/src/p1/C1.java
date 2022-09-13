package p1;
public class C1 {
    public void f1(){
        System.out.println("C1::f1 method");
    }

    void f2(){ // default :: with in package scope
        System.out.println("C1::f2 method");
    }
    protected void f3(){ // with in package scope + other package-sub class's object
        System.out.println("C1::f3 method");
    }

    private int id=10;
    private void f4(){} // useless declaration
    public void f5(){
        // auth ?
        System.out.println("id: "+id);
    }
}
