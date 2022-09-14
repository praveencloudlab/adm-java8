class C1{ // java.lang.Object is the super class to all the classes.
    int x=100;

}
class C2 extends C1{ // C1 is super class

    void f1(){
        System.out.println("X: "+x);
    }
}
public class C3 {
    public static void main(String[] args) {
        C2 c2=new C2();
        c2.f1();
    }
}
