package basics;

//Task 7
//Create a class ―Distance‖ with two constructors (no argument, and two argument), two data members
//(feet and inches). Also create display function which displays all data members.

class Distance{
    double inches;
    double feet;
    Distance(){
        inches=10;
        feet=0.8;
    }
    Distance(double i , double f){
        inches=i;
        feet=f;
    }
    void displayDistance (){
        System.out.println("Distance in inches : " + inches);
        System.out.println("Distance is feet : " + feet);
    }
}
public class task7{
    public static void main(String[] args) {
        Distance distance1 = new Distance();
        distance1.displayDistance();
        Distance distance2= new Distance(20,1.6);
        distance2.displayDistance();
    }
}
