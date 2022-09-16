public class Test {
    public static void main(String[] args) {
       /*
        Bank b=new Bank();
        b.deposit();
        b.withDraw();
        b.openAccount();
        b.closeAccount();
        */

        Customer c=new Bank();
        BankEmployee be=new Bank();
        Manager mgr=new Bank();
        Admin a=new Bank();
        a.enableNetBanking();

        c.deposit();
        c.withDraw();

        be.openAccount();
        be.closeAccount();

        mgr.lockerAccess();












    }
}
