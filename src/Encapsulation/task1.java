package Encapsulation;

//Task 1
//Create an Encapsulated class Marks with three data members to store three marks. Create set and get
//methods for all data members. Test the class in runner


class Marks{
    private int marks1;
    private int marks2;
    private int marks3;
    Marks(int x , int y , int z){
        marks1=x;
        marks2=y;
        marks3=z;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void display(){
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
    }


}

public class task1{
    public static void main(String[] args) {
        Marks myMarks = new Marks(99,95,93);

    }
}