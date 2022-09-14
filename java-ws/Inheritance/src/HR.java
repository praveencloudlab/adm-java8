public class HR {

    public static void main(String[] args) {

        RegularEmployee re=new RegularEmployee();
        ContractEmployee ce=new ContractEmployee();

        re.acceptData(10,"James",22);
        ce.acceptData(20,"Praveen",45);

        re.processSalary();
        ce.processSalary();

        re.display();
        ce.display();


    }
}
