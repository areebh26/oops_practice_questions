package inheritence_and_composition;

//Create a class Book that contains an author of type Person (Note: Use the Person class created in the
//        first exercise). Other data members are bookName and publisher. Modify the address of the author in
//runner class.

class Book{
    private String bookname;
    private String publisher;
    private Person author;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public Book(String bookname, String publisher, Person author) {
        this.bookname = bookname;
        this.publisher = publisher;
        this.author = author;
    }
    public void display(){
        System.out.println("Name of the book : " + this.bookname);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Details of author : ");
        author.display();
    }

}
public class task2{
    public static void main(String[] args) {
        Address adress = new Address(31,247,"Islamabad" , 46000);
        Person author = new Person("Michael" , adress);
        Book myBook = new Book("OOPS" , "xyz" ,author );
        myBook.display();
        System.out.println("Now changing adress ....");
        myBook.getAuthor().getAdress().setCity("Lahore");
        myBook.getAuthor().getAdress().setHouseNo(445);
        myBook.getAuthor().getAdress().setCode(99000);
        System.out.println("New Adress : ");
        myBook.display();
    }
}
