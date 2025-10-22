package inheritence_and_composition;

//(The Person, Student, Employee, Faculty, and Staff classes)
//Design a class named Person and its two subclasses named Student and Employee. Design two more
//        classes; Faculty and Staff and extend them from Employee. The detail of classes is as under:
//A person has a name, address, phone number, and email address.
//A student has a status (String)
//An employee has an office, salary, and date hired. Use the Date class to create an object for date hired.
//A faculty member has office hours and a rank.
//A staff member has a title.
//Create display method in each class

class Address2{
    private int streetNO;
    private int houseNO;
    private String city;

    public Address2(int streetNO, int houseNO, String city) {
        this.streetNO = streetNO;
        this.houseNO = houseNO;
        this.city = city;
    }

    public Address2() {
        this.city="Islamabad";
        this.streetNO=31;
        this.houseNO=247;
    }

    public int getStreetNO() {
        return streetNO;
    }

    public void setStreetNO(int streetNO) {
        this.streetNO = streetNO;
    }

    public int getHouseNO() {
        return houseNO;
    }

    public void setHouseNO(int houseNO) {
        this.houseNO = houseNO;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("Address  is as follow : ");
        System.out.println("House no. : " + this.houseNO);
        System.out.println("Street no. : " + this.streetNO);
        System.out.println("City : " + this.city);

    }
}

class Date{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this.month=10;
        this.year=2025;
        this.day=12;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void display(){
        System.out.println("Date hired : " + this.day +"-"+this.month+"-"+this.year);
    }
}

class Person2{
    private String name;
    private String phoneNO;
    private Address2 address;
    private String email;

    public Person2(String name, String phoneNO, Address2 address, String email) {
        this.name = name;
        this.phoneNO = phoneNO;
        this.address = address;
        this.email = email;
    }

    public Person2() {
        this.name="areeb";
        this.address=new Address2();
        this.phoneNO="34343";
        this.email="043";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("NUmber : " + this.phoneNO);
        System.out.println("Email : " + this.email);
        address.display();
    }

}
class Student extends Person2{
    private String status;

    public Student(String name, String phoneNO, Address2 address, String email, String status) {
        super(name, phoneNO, address, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void display(){
        System.out.println("Details about student : ");
        System.out.println("Status : " + this.status);
        super.display();


    }
}
class Employee extends Person2{
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String phoneNO, Address2 address, String email, String office, double salary, Date dateHired) {
        super(name, phoneNO, address, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    public void display(){
        System.out.println("Details about Employee : ");
        super.display();
        System.out.println("Office : " + this.office);
        System.out.println("salary : " + this.salary);
        dateHired.display();
    }

}

class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String phoneNO, Address2 address, String email, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, phoneNO, address, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void display(){
        super.display();
        System.out.println("Office hours : " + this.officeHours);
        System.out.println("Rank : " + this.rank);
    }
}
class Staff extends Employee{
    private String title;

    public Staff(String name, String phoneNO, Address2 address, String email, String office, double salary, Date dateHired, String title) {
        super(name, phoneNO, address, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void display(){
        super.display();
        System.out.println("Title : " + this.title );
    }
}

public class task5{
    public static void main() {
        Address2 addressForStudent = new Address2(31,23,"Lahore");
        Date datehiredforFaculty = new Date(12,10,2005);
        Student areeb = new Student("areeb" , "0304-0546700" , addressForStudent , "areebulhaq2005@gmail.com","enrolled");
        System.out.println(areeb.getName());
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         Address addressForFaculty = new Address();
//         Faculty fac1 = new Faculty("abrar","0341-5163122" ,addressForFaculty , "xyz@gmaol.com" , "A-12" , 5000 , datehiredforFaculty ,"9-5" , "major" );
//         fac1.display();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         Address addressForStaff = new Address(23,32,"Karachi");
//         Date dateHiredForStaff  = new Date(23,02,2000);
//         Staff S1 = new Staff("ali","03445343" , addressForStaff , "fef@gmail.com" , "A-13",7000,dateHiredForStaff , "perfectionlist");


    }
}
