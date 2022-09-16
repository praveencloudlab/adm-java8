interface Calc{
    void calculator();
}
class Sum implements Calc{
    @Override
    public void calculator() {
        System.out.println("Sum calculator");
    }
}
class Mul implements Calc{
    @Override
    public void calculator() {
        System.out.println("Mul calculator");
    }
}
public class Main {
    public static void main(String[] args) {
        Calc c=new Sum();
        c.calculator();
        c=new Mul();
        c.calculator();
    }
}
