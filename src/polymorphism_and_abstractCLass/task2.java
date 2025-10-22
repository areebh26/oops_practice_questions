package polymorphism_and_abstractCLass;

//Write a program that declares two classes. The parent class is called Simple that has two data members
//        num1 and num2 to store two numbers. It also has four member functions.
//The add() function adds two numbers and displays the result. The sub() function subtracts two numbers
//and displays the result.
//The mul() function multiplies two numbers and displays the result. The div() function divides two numbers
//and displays the result.
//The child class is called VerifiedSimple that overrides all four functions. Each function in the child class
//checks the value of data members. It calls the corresponding member function in the parent class if the
//values are greater than 0. Otherwise it displays error message.


import java.util.InputMismatchException;
import java.util.Scanner;

class Simple {
    protected double num1;
    protected double num2;

    public Simple(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Simple() {
        this.num1 = 5;
        this.num2= 2 ;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return
                "num1=" + num1 +
                        ", num2=" + num2 ;
    }

    public void sum (){
        System.out.println(this.num1+this.num2);
    }
    public void subtract(){
        System.out.println(this.num2-this.num1);
    }
    public void mul(){
        System.out.println(this.num1*this.num2);
    }
    public void div(){
        System.out.println(this.num1/this.num2);
    }
}
class verificationOfSimplified extends Simple{
    public verificationOfSimplified() {
        super();
    }
    public verificationOfSimplified(double num1 , double num2) {
        super(num1,num2);
    }
    public void sum (){
        if(super.num1 > 0 && super.num2>0){
            super.sum();
        }
        else {
            System.out.println("one or both numbers are 0 ");

        }

    }
    public void subtract(){
        if(super.num1 > 0 && super.num2>0){
            super.subtract();
        }
        else {
            System.out.println("one or both numbers are 0 ");

        }
    }
    public void mul(){
        if(super.num1 > 0 && super.num2>0){
            super.mul();
        }
        else {
            System.out.println("one or both numbers are 0 ");

        }
    }
    public void div(){
        if(super.num1 > 0 && super.num2>0){
            super.div();
        }
        else {
            System.out.println("one or both numbers are 0 ");

        }
    }


}
public class task2{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1=0;
        double num2=0;
        boolean infinite=false;
        do {
            try {
                System.out.println("Enter 1st number : ");
                num1 = sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2 = sc.nextDouble();
                infinite=false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input ");
                infinite=true;
                sc.nextLine();
            }
        }while(infinite);
        sc.nextLine();
        verificationOfSimplified calculation = new verificationOfSimplified(num1,num2);
        calculation.sum();
        calculation.subtract();
        calculation.mul();
        calculation.div();

    }
}
