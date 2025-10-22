package inheritence_and_composition;

//Task 1
//Create an Address class, which contains street#, house#, city and code. Create another class Person that
//contains an address of type Address. Give appropriate get and set functions for both classes. Test class
//person in main.

class Address{
    private int streetNo ;
    private int houseNo;
    private String city;
    private int code;

    public Address(int streetNo, int houseNo, String city, int code) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
        this.code = code;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void display(){
        System.out.println("Address of the person is as follow : ");
        System.out.println("House no. : " + this.houseNo);
        System.out.println("Street no. : " + this.streetNo);
        System.out.println("City : " + this.city);
        System.out.println("Code : " + this.code);
    }
}

class Person{
    private String name;
    private Address adress;

    public Person(String name, Address adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
    public void display(){
        System.out.println("Name  : " + this.name);
        adress.display();
    }
}
public class task1{
    public static void main(String[] args) {
        Address ad = new Address(31,247,"Islamabad",46000);
        Person areeb = new Person("areeb" , ad);
        areeb.display();

    }
}