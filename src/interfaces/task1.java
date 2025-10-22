package interfaces;

//Public interface Shape
//{
//    double getArea();
//}
//Create two classes Circle and Rectangle. Both must implement the interface Shape.
//Note: You can assume appropriate data members for circle and rectangle


interface Shape{
    double getArea();
}
class Square implements Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }
    public Square() {
        this.length = 4;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (length*length);
    }

    @Override
    public String toString() {
        return "Square : " +
                "\nlength : " + length +
                "\nArea : " + getArea();
    }
}
class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {
        this.length = 4;
        this.width = 2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "\nlength : " + length +
                "\nwidth : " + width + "\nArea : " + getArea();
    }
}
public class task1 {
    static void main(String[] args) {
        Square mySqaure = new Square();
        System.out.println(mySqaure.toString());
        System.out.println();
        System.out.println();
        System.out.println();
        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.toString());
    }
}