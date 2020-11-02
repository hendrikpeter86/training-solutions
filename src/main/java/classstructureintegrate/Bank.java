package classstructureintegrate;

public class Bank {

    public static void main(String[] args) {


    BankAccount bankAccount1 = new BankAccount();

    bankAccount1.setOwner("Hendrik Péter");
    bankAccount1.setAccountNumber("11313");
    bankAccount1.setBalance(10_000);


    BankAccount bankAccount2 = new BankAccount();

    bankAccount2.setOwner("Hendrik Mónika");
    bankAccount2.setAccountNumber("45678");
    bankAccount2.setBalance(1_000_256);

    bankAccount1.getInfo();
    bankAccount2.getInfo();

    bankAccount1.deposit(250);
    bankAccount1.withdraw(100);
    bankAccount2.deposit(2_503);
    bankAccount2.withdraw(100_000);

    bankAccount1.getInfo();
    bankAccount2.getInfo();







    }
}
