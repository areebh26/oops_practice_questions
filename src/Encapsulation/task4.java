package Encapsulation;
interface Payable {
    double getPaymentAmount();
}
class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public Invoice() {
        this.partNumber = "434";
        this.partDescription = "xyz";
        this.quantity = 10;
        this.pricePerItem = 20;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice : " +
                "\npartNumber : " + partNumber  +
                "\npartDescription : " + partDescription  +
                "\nquantity : " + quantity +
                "\npricePerItem : " + pricePerItem;
    }
}
abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public Employee(){
        this.firstName = "areeb";
        this.lastName = "ul haq";
        this.socialSecurityNumber = "3232-4343-3434";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return
                "\nfirstName ; " + firstName  +
                "\nlastName :" + lastName +
                "\nsocialSecurityNumber : " + socialSecurityNumber;
    }
}
class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }
    public SalariedEmployee() {
        super();
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double getPaymentAmount() {
        return weeklySalary; // Calculation for a salaried employee
    }

    @Override
    public String toString() {
        return "SalariedEmployee : " + super.toString() +
                "\nweeklySalary : " + weeklySalary;
    }
}
public class task4 {
    public static void main(String[] args) {
        Payable invoice = new Invoice("1234", "balallaa", 2, 15);
        Payable employee = new SalariedEmployee("ali", "mehtab", "143-22-343", 800);
        Payable[] payableObjects = { invoice, employee };
        System.out.println("Processing Payments polymorphically: ");
        for (Payable current : payableObjects) {
            System.out.println("Object: " + current.toString());
            System.out.println("Payment Due: $" + current.getPaymentAmount());
            System.out.println();
            System.out.println();
        }
    }
}