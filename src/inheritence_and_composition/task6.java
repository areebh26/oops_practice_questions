package inheritence_and_composition;

//Imagine a publishing company that markets both book and audio-cassette versions of its works. Create a
//class publication that stores the title and price of a publication. From this class derive two classes:
//i.
//        book, which adds a page count and
//ii.
//        tape, which adds a playing time in minutes.
//Each of these three classes should have set() and get() functions and a display() function to display its
//data. Write a main() program to test the book and tape class by creating instances of them, asking the
//        user to fill in their data and then displaying the data with display().


import java.util.InputMismatchException;
import java.util.Scanner;

class Publication{
    private String title;
    private double price;

    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Publication() {
        this.title = "java";
        this.price=500;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.println("Title : " + this.title);
        System.out.println("Price : " + this.price);

    }
}

class Book2 extends Publication{
    int pageCount;

    public Book2(String title, double price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public Book2() {
        this.pageCount = 700;
        super("java",500);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void display(){
        System.out.println("Details about Book : ");
        super.display();
        System.out.println("Number of Pages : " + this.pageCount);
    }
}

class Tape extends Publication{
    private String playingTime;

    public Tape(String title, double price, String playingTime) {
        super(title, price);
        this.playingTime = playingTime;
    }

    public Tape() {
        this.playingTime = "6:52";
        super("pthon",1000);

    }

    public String getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(String playingTime) {
        this.playingTime = playingTime;
    }
    public void display(){
        System.out.println("Details about Tape : ");
        super.display();
        System.out.println("Play time  : " + this.playingTime);
    }
}

public class task6{
    static void main() {
        Scanner sc = new Scanner(System.in);
        double price=0;
        int pages=0;
        System.out.println("Enter details for book : ");
        System.out.println("Enter title : ");
        String title = sc.nextLine();

        boolean infinite=false;
        do {
            try {
                System.out.println("Enter price");
                price = sc.nextDouble();
                System.out.println("Enter number of pages : ");
                pages = sc.nextInt();
                infinite=false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input ");
                infinite=true;
                sc.nextLine();
            }
        }while(infinite);
        sc.nextLine();
        Book2 myBook = new Book2(title,price,pages);
        myBook.display();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        double price1=0;
        System.out.println("Enter details for Tape : ");
        System.out.println("Enter title : ");
        String title1 = sc.nextLine();

        boolean infinite2=false;
        do {
            try {
                System.out.println("Enter price");
                price1 = sc.nextDouble();
                infinite2=false;
            }catch (InputMismatchException e){
                System.out.println("Wrong input");
                infinite2=true;
                sc.nextLine();
            }
        }while(infinite2);
        sc.nextLine();
        System.out.println("Enter playing time  : ");
        String playingTime = sc.nextLine();
        Tape myTape = new Tape(title1,price1,playingTime);
        myTape.display();
    }
}