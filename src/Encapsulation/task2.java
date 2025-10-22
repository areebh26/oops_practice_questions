package Encapsulation;

//Create an Encapsulated class Account class with balance as data member. Create two constructors and
//methods to withdraw and deposit balance. In the runner create two accounts. The second account should
//be created with the same balance as first account. (Hint: use get function)


class Account{
    private double balance;
    Account(double balance) {
        this.balance = balance;
    }
    Account(){
        balance=10000;
    }void depositMoney(double amount){
        balance+=amount;
    }
    void withdrawMoney(double amount){
        balance-=amount;
    }
    void displayBalance(){
        System.out.println("Current balance is : " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class task2{
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account(acc1.getBalance());
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
