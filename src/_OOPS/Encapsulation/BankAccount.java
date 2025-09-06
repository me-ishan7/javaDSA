package _OOPS.Encapsulation;

public class BankAccount {
    private String HolderName;
    private long accNo;
    private int balance;

    public int Deposit(int money){
        if(money < 0) System.out.println("Can't be deposited");
        else balance += money;
        return balance;
    }
    public void Withdraw(int money){
        if(money > 0 && balance >= money){
            balance -= money;
            System.out.println("Current balance : " + balance );
        }
        else System.out.println("Not enough Balance");

    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

}
