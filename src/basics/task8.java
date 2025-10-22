package basics;

//Task 8
//Write a class Marks with three data members to store three marks. Create two constructors and a method
//to calculate and return the sum.

class Marks{
    int a;
    int b;
    int c;
    Marks(){
        a=90;
        b=70;
        c=99;
    }
    Marks(int x , int y , int z ){
        a=x;
        b=y;
        c=z;
    }
    int calculateSum(){
        return a+b+c;
    }
    void displaySum(){
        System.out.println("Sum is : " + calculateSum());
    }

}
public class task8 {
    public static void main(String[] args) {
        Marks marks1 = new Marks();
        marks1.calculateSum();
        marks1.displaySum();
    }
}