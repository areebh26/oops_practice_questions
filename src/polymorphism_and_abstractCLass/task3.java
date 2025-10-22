package polymorphism_and_abstractCLass;

//Create an abstract class that stores data about the shapes e.g. Number of Lines in a Shape, Pen Color,
//Fill Color and an abstract method draw. Implement the method draw for Circle, Square and Triangle
//subclasses, the better approach is to draw these figures on screen, if you can’t then just use a display
//message in the draw function.

abstract class Shape {
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;

    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }
    public abstract void draw();
}
class Circle extends Shape {
    public Circle(String penColor, String fillColor) {
        super(1, penColor, fillColor);
    }
    public Circle() {
        super(1, "red","black");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
        System.out.println(" Number of Lines: " + super.numberOfLines);
        System.out.println(" Pen Color: " + super.penColor);
        System.out.println(" Fill Color: " + super.fillColor);
        System.out.println();
    }
}
class Square extends Shape {
    public Square(String penColor, String fillColor) {
        super(4, penColor, fillColor);
    }
    public Square() {
        super(4, "black", "yellow");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Square...");
        System.out.println(" Number of Lines: " + super.numberOfLines);
        System.out.println(" Pen Color: " + super.penColor);
        System.out.println(" Fill Color: " + super.fillColor);
        System.out.println();
    }
}
class Triangle extends Shape {
    public Triangle(String penColor, String fillColor) {
        super(3, penColor, fillColor);
    }
    public Triangle() {
        super(3, "black", "green");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle...");
        System.out.println(" Number of Lines: " + super.numberOfLines);
        System.out.println(" Pen Color: " + super.penColor);
        System.out.println(" Fill Color: " + super.fillColor);
        System.out.println();
    }
}
public class task3 {
    public static void main(String[] args) {
        Shape myCircle = new Circle("Red", "Blue");
        Shape mySquare = new Square("Black", "Yellow");
        Shape myTriangle = new Triangle("Green", "Orange");
        myCircle.draw();
        mySquare.draw();
        myTriangle.draw();
    }
}

