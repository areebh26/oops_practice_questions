package basics;


//task 1 :
//A Student is an object in a university management System. Analyze the concept and identify the data
//members that a Student class should have. Also analyze the behavior of student in a university
//management System and identify the methods that should be included in Student class.

class student{
    String name;
    int age;
    String registrationNumber;
    String contantNumber;
    String emailAdress;
    boolean isFeePaid;
    void displayDetails(){
        System.out.println("Student name : " + name);
        System.out.println("Student Reg no. : "+ registrationNumber);
        System.out.println("Student age : " + age);
        System.out.println("Student phone no. : " + contantNumber);
        System.out.println("Student email adress : " + emailAdress);
        if(isFeePaid){
            System.out.println("Fee status : Paid " );
        }
        else {
            System.out.println("Fee status : Unpaid");
        }
    }
    void updateContactNumber(String newNumber){
        contantNumber=newNumber;
    }
    void updateEmailAdress(String newEmailAdress){
        emailAdress=newEmailAdress;
    }
    void payFee(){
        isFeePaid=true;
    }




}


public class task1{
    public static void main(String[] args) {
        student student1 = new student();
        student1.name="areeb";
        student1.age=20;
        student1.registrationNumber="SP25-BCS-016";
        student1.contantNumber="+923040546700";
        student1.emailAdress="areebulhaq2005@gmail.com";
        student1.isFeePaid=true;
        student1.displayDetails();

    }
}
