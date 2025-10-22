package inheritence_and_composition;

//Write a base class Computer that contains data members of wordsize(in bits), memorysize (in megabytes),
//storagesize (in megabytes) and speed (in megahertz). Derive a Laptop class that is a kind of computer but
//        also specifies the object’s length, width, height, and weight. Member functions for both classes should
//include a default constructor, a constructor to inialize all components and a function to display data
//members.r.


class Computer {
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected double speed;

    public Computer() {
        this.wordSize = 10;
        this.memorySize = 8000;
        this.storageSize = 256000;
        this.speed = 4.2;
    }

    public Computer(int wordSize, int memorySize, int storageSize, double speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Word Size: " + this.wordSize + " bits");
        System.out.println("Memory Size: " + this.memorySize + " MB");
        System.out.println("Storage Size: " + this.storageSize + " MB");
        System.out.println("Speed: " + this.speed + " MHz");
    }
}
class Laptop extends Computer {
    private double length;
    private double width;
    private double height;
    private double weight;

    public Laptop() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Laptop(int wordSize, int memorySize, int storageSize, double speed,
                  double length, double width, double height, double weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void display() {
        super.display();
        System.out.println("Length: " + this.length + " cm");
        System.out.println("Width: " + this.width + " cm");
        System.out.println("Height: " + this.height + " cm");
        System.out.println("Weight: " + this.weight + " kg");
    }
}

public class task7{
    static void main() {
        System.out.println(" Laptop Object Details : ");
        Laptop myLaptop = new Laptop(64, 8192, 512000, 2800.0, 35.7, 24.5, 1.8, 1.5);
//         myLaptop.display();
        System.out.println(myLaptop.memorySize);

    }
}
