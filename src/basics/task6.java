package basics;

//Task 6
//Create a class Account class with balance as data member. Create two constructors (no argument, and
//        two arguments) and methods to withdraw and deposit balance.

import java.util.Scanner;

class Account{
    double balance;
    Account(){
        balance = 5000;
    }
    Account(double b){
        balance=b;
    }
    void depositMoney(double amount){
        balance+=amount;
    }
    void withdrawMoney(double amount){
        balance-=amount;
    }
    void displayBalance(){
        System.out.println("Current balance is : " + balance);
    }
}

public class task6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc1 = new Account();
        Account acc2 = new Account(10000);
        boolean keepRunning=true;
        while(keepRunning){
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to deposit money");
            System.out.println("Press 3 to Withdraw money");
            System.out.println("Press 4 to quit");
            int userInput=sc.nextInt();
            switch (userInput){
                case 1:
                    acc1.displayBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit : ");
                    double amount = sc.nextDouble();
                    acc1.depositMoney(amount);
                    break;
                case 3 :
                    System.out.println("Enter the amount you want to withdraw : ");
                    double amount1 = sc.nextDouble();
                    acc1.withdrawMoney(amount1);
                    break;
                case 4:
                    keepRunning=false;
                    break;
            }


        }

    }
}
