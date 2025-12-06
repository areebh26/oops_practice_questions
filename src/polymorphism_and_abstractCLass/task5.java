package polymorphism_and_abstractCLass;

//Create an abstract class “Person”, with data member “name”. Create set and get methods, and an
//abstract Boolean method “isOutstanding()”.
//Derive two classes Student and Professor. Student class has data member CGPA.
//Professor Class has data member numberOfPublications. Provide setters and getters and
//implementation of abstract function in both classes.
//In student class isOutstanding() will return true if CGPA is greater than 3.5. In the Professor class
//isOutstanding() will return true, if numberOfPublications> 50.
//In the main class create an array of Person class and call isOutstanding() function for student and
//professor. isOutstanding() for professor should be called after setting the publication count to 100.

abstract class Person{
    protected String name;

    public Person(String name) {
        this.name = name;
    }
    public Person() {
        this.name = "agha";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract boolean isOutstanding();
}

class Student extends Person{
    private double CGPA;

    public Student(double CGPA,String name) {
        this.CGPA = CGPA;
        super(name);
    }
    public Student() {
        this.CGPA = 3.7;
        super();
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public  boolean isOutstanding(){
        if(CGPA>=3.5){
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Student : " +
                "\n\nCGPA : " + CGPA +
                "\nname : " + name ;
    }
}
class Professor extends Person{
    private int numberOfPublications;

    public Professor(int numberOfPublications,String name) {
        this.numberOfPublications = numberOfPublications;
        super(name);
    }
    public Professor() {
        this.numberOfPublications = 44;
        this.name="ali";
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
    public  boolean isOutstanding(){
        if(this.numberOfPublications>=50){
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Professor : " +
                "\n\nNumberOfPublications : " + numberOfPublications +
                "\nname='" + name;
    }
}
public class task5{
    static void main(String[] args) {
        Person [] persons = new Person[2];
        Student areeb = new Student(3.69,"areeb");
        Professor tanveer = new Professor(100,"tanveer");
        persons[0]=areeb;
        persons[1]=tanveer;
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString()+"\nIs person outstanding ? " + persons[i].isOutstanding());
            System.out.println();
            System.out.println();
        }
    }
}

