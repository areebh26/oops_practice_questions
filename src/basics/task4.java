package basics;


//Task 4
//Rectangle is an object that represents a specific shape. Analyze the concept and identify the data
//members and methods that should be included in Rectangle class.


class Rectangle{
    double lenght;
    double width;
    double area;
    void displayDetails(){
        System.out.println("Lenght of rectangle is : " + lenght);
        System.out.println("Width of rectangle is : " + width );
        System.out.println("Area of rectangle is : " + calculatreArea(lenght,width));
    }
    double calculatreArea(double l , double w){
        area=l*w;
        return area;
    }
}
public class task4 {
    static void main() {
        Rectangle myReactangle = new Rectangle();
        myReactangle.lenght=10;
        myReactangle.width=5;
        myReactangle.displayDetails();
    }
}
