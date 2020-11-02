package classstructureintegrate;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void getInfo() {
        System.out.println(owner + " (" + accountNumber + "): " + balance + " Ft");
    }

    public int deposit(int amount) {
        return balance = balance + amount;
    }

    public int withdraw(int amount) {
        return balance = balance - amount;
    }

//    public int transfer(BankAccount to, int amount ) {
//        return
//    }

}
