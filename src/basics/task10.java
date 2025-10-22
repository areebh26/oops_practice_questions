package basics;

//Task 10
//Create a class ― Distance‖ with two constructors (no argument, and two argument), two data members
//( feet and inches) . Create setter, getter and display method. Create a method that adds two Distance
//Objects and returns the added Distance Object.

class Distance2{
    private double inches;
    private double feet;

    public Distance2() {
        inches=12;
        feet=1;
    }

    public Distance2(double inches, double feet) {
        this.inches = inches;
        this.feet = feet;
    }
    public double getInches() {
        return inches;
    }
    public double getFeet() {
        return feet;
    }
    public void setInches(double inches) {
        this.inches = inches;
    }
    public void setFeet(double feet) {
        this.feet = feet;
    }
    public void display(){
        System.out.println("Distance in inches : " + inches);
        System.out.println("Distance in feet : " + feet);
    }

    public static Distance2 add(Distance2 a , Distance2 b){
        Distance2 c = new Distance2(a.inches+b.inches,a.feet+b.feet);
        return c;
    }


}

public class task10{
    public static void main(String[] args) {
        Distance2 d1 = new Distance2();
        Distance2 d2 = new Distance2 (24,2);
        Distance2 d3 = Distance2.add(d1,d2);
        d3.display();
    }
}
