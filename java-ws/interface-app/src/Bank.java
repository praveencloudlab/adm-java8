public class Bank implements Customer,BankEmployee, Manager, Admin {
    @Override
    public void withDraw(){
        System.out.println(">>> withdrawing...");
    }

    @Override
    public void enableNetBanking(){
        System.out.println(">>> netbaking is enabled..");
    }

    @Override
    public void lockerAccess(){
        System.out.println(">>> locker access provided...");
    }
    @Override
    public void deposit(){
        System.out.println(">>> depositing...");
    }
   @Override
    public void openAccount(){
        System.out.println(">>> opening account");
    }

    @Override
    public void closeAccount(){
        System.out.println(">>> closing account");
    }



}
