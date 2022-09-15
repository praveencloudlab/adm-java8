class Rbi{
    public final void f1(){
        System.out.println("Rule1");
    }
    public final void f2(){
        System.out.println("Rule2");
    }

    public void copyRights(){
        System.out.println("-- RBI Copyrights");
    }
}

class Sbi extends Rbi{
    public void custInfo(){
        System.out.println("-- SBI Customer Info");
    }
    public void copyRights() {
        System.out.println("-- Sbi Copyrights info");
    }

}

class Hdfc extends Rbi{

    public void custInfo(){
        System.out.println("-- Hdfc  Customer Info");
    }
    @Override
    public void copyRights() {
        System.out.println("-- Hdfc Copyrights info");
    }
}
class C1{}
public class Use {
    public static void main(String[] args) {

       // Sbi sbi=new Sbi();
        //sbi.custInfo();

       // Rbi r;
       // r=new Sbi();
       // r=new Hdfc();
       // r=new C1();

        Rbi r=new Sbi(); // store subclass object in the super class.
        r.f1(); // rbi's  // f1 not available in Sbi.. so rbi's method get executed
        r.f2(); // rbi's // f2 not available in Sbi.. so rbi's method get executed
        r.copyRights(); // sbi's -> polymorphism. if copyRights method available in sbi, then sbi's method executed. if not then super class of Sbi copyRights method is executed
       // r.custInfo(); // abstraction

       /*
        r=new Hdfc();
        r.f1();
        r.f2();
        r.copyRights();
        */





    }
}
