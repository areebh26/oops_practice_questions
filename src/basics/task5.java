package basics;

//Task 5
//Create a class circle class with radius as data member. Create two constructors (no argument, and two
//arguments) and a method to calculate Circumference.

class circle{
    double radius;
    circle(){
        radius=5;
    }
    circle(double r){
        radius=r;
    }
    double calculateCircumference(){
        return 2*3.14*radius;
    }
}
public class task5{
    public static void main(String[] args) {
        circle myCircle = new circle();
        System.out.println("Cirumferecne of a 5cm circle is : " + myCircle.calculateCircumference());
        circle myCricle2 = new circle(10);
        System.out.println("Cirumferecne of a 10cm circle is : " + myCricle2.calculateCircumference());
    }
}