package inheritence_and_composition;

//Task 3
//Design a class Point with two data members x-cord and y-cord. This class should have an arguments
//        constructor, setters, getters and a display function.
//Now create another class ―Line‖, which contains two Points ―startPoint‖ and ―endPoint‖. It should
//have a function that finds the length of the line.
//Hint: formula is: sqrt((x2-x1)2 + (y2-y1)2)
//Create two line objects in runner and display the length of each line.

class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void display(){
        System.out.println("x : " + this.x);
        System.out.println("y :" + this.y);
    }
}
class Line{
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    double lengthOfline(){
        double x = (endPoint.getX()- startPoint.getX())*2;
        double y = (endPoint.getY()- startPoint.getY())*2;
        return Math.sqrt(x+y);
    }

}
public class task3{
    public static void main(String[] args) {
        Point line1FirstPoint = new Point(3,4);
        Point line12ndPoint = new Point(7,5);
        Line line1 = new Line(line1FirstPoint,line12ndPoint);
        System.out.println("Lenght of 1st line : " + line1.lengthOfline());

        Point line2FirstPoint = new Point(5,9);
        Point line22ndPoint = new Point(10,5);
        Line line2 = new Line(line2FirstPoint,line22ndPoint);
        System.out.println("Length of 2nd line : "+line2.lengthOfline());

    }
}
