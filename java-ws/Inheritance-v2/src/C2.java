import java.io.File;

class C1{
    public void f1(){}
    void f2(){} // default
    protected void f3(){} // protected
    public final void f4(){} // final methods can not overridden

    final int MAX_VALUE=97394;

}
public class C2 extends C1{
   // @Override
   // public void f4() {

   // }

    @Override
    public void f1() {}
    @Override
    protected void f2(){}
    @Override
    public void f3(){}


    /**
     *  -> if super class method is defined as 'public'
     *     then sub-class overridden method must be defined as only 'public'
     *  -> if super class method is defined as 'default'
     *     then subclass overridden method can be 'default , public and protected'
     *  -> if super class method is defined as 'protected'
     *     then subclass overridden method can be 'protected and public'
     *
     */

    public static void main(String[] args) {
        try {

            File f=new File("src/abc.txt");
            f.createNewFile();

        }catch (Exception e){

        }

    }
}
