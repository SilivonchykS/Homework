package classwork.ch;

public class Bankaccount {
    int id;
    String name;
    double balance;
    public static void main(String[] args) {

        Bankaccount MyAccount=new Bankaccount();
        Bankaccount YourAccount= new Bankaccount();
        Bankaccount HisAccount= new Bankaccount();

        MyAccount.id=2323;
        MyAccount.name="Swetlana";
        MyAccount.balance=2000;

        YourAccount.id=1212;
        YourAccount.name="Arina";
        YourAccount.balance=1000000;

        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);
        System.out.println(HisAccount.name);



    }
}
