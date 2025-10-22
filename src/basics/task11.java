package basics;

//Create an Encapsulated class Book. Its data members are
//•
//        •
//author (String)
//chapterNames[100] (String[])
//Create two overloaded constructors, one with no argument and one with two arguments.
//Create a method compareBooks that compares the author of two Books and returns true
//        if both books have same author and false otherwise. (This method must manipulate two
//Book objects)
//Create a method compareChapterNames that compares the chapter names of two Books
//and returns the book with larger chapters. Display the author of the book with greater
//chapters in main.
//31Create a runner class that declares two objects of type Book. One object should be
//declared using no argument constructor and then the parameters should be set through
//the set() methods. The second object should be declared with argument constructor.
//Finally the CompareBooks()and compareChapterNames method should be called and the
//result should be displayed in the runner class.

class Book {

    private String author;
    private String[] chapterNames;
    public Book() {
        this.author = "Unknown";
        this.chapterNames = new String[100];
    }
    public Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }
    public String getAuthor() {
        return author;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }
    public boolean compareBooks(Book a , Book b) {
        if (a.author.equals(b.author)){
            return true;
        }else{
            return false;
        }
    }
    public Book compareChapterNames(Book a , Book b) {
        if(a.countChapters()>b.countChapters()){
            return a;
        } else if (a.countChapters()==b.countChapters()) {
            System.out.println("Both have equal chapters");
            return a;
        }
        else{
            return b ;
        }
    }
    public int countChapters() {
        int count = 0;
        for (int i = 0; i < chapterNames.length; i++) {
            if (chapterNames[i] != null) {
                count++;
            }
        }
        return count;
    }
}

public class task11 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("areeb");
        String[] chapters1 = {"xxx", "xxy", "xxz"};
        book1.setChapterNames(chapters1);
        String[] chapters2 = {"xxy", "lsi", "mni", "fdf"};
        Book book2 = new Book("ali", chapters2);
        boolean sameAuthor = book1.compareBooks(book1,book2);
        System.out.println("Do both books have the same author? " + sameAuthor);
        Book bookWithMoreChapters = book1.compareChapterNames(book1,book2);
        System.out.println("The book with more chapters was written by: " + bookWithMoreChapters.getAuthor());
        System.out.println("It has " + bookWithMoreChapters.countChapters() + " chapters");
    }
}
