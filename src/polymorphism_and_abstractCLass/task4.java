package polymorphism_and_abstractCLass;

//Package-delivery services, offer a number of different shipping options, each with specific costs
//associated.
//Create an inheritance hierarchy to represent various types of packages. Use Package as the super class
//of the hierarchy, then include classes TwoDayPackage and OvernightPackage that derive from Package.
//Super class Package should include data members representing the name and address for both the sender
//and the recipient of the package, in addition to data members that store the weight (in ounces) and cost
//per ounce to ship the package. Package's constructor should initialize these data members. Ensure that
//the weight and cost per ounce contain positive values.
//65Package should provide a public member function calculateCost() that returns a double indicating the
//cost associated with shipping the package. Package's calculateCost() function should determine the cost
//by multiplying the weight by the cost per ounce.
//        Derived class TwoDayPackage should inherit the functionality of base class Package, but also include a
//        data member that represents a flat fee that the shipping company charges for two-day-delivery service.
//TwoDayPackage'sconstructor should receive a value to initialize this data member. TwoDayPackage
//should redefine member function calculateCost() so that it computes the shipping cost by adding the flat
//fee to the cost calculated by base class Package's calculateCost() function.
//Class OvernightPackage should inherit from class Package and contain an additional data member
//        representing an additionalfee charged for overnight-delivery service.
//OvernightPackage should redefine member function calculateCost() so that it computes the shipping cost
//by adding the additionalfee to the cost calculated by base class Package's calculateCost() function.
//Write a test program that creates objects of each type of Package and tests member function
//calculateCost() using polymorphism .


class Address{
    private int streetNo ;
    private int houseNo;
    private String city;
    public Address(int streetNo, int houseNo, String city) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;

    }
    public Address() {
        this.streetNo = 31;
        this.houseNo = 247;
        this.city = "Lahore";

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

    @Override
    public String toString() {
        return
                "streetNo=" + streetNo +
                        "\nhouseNo=" + houseNo +
                        "\ncity='" + city ;
    }
}
class Name{
    private String sender;
    private String receiver;

    public Name(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }
    public Name() {
        this.sender = "areeb";
        this.receiver = "ali";
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Name : " +
                "\nsender : " + sender + '\'' +
                "\nreceiver : " + receiver;
    }
}
class Package{
    protected Name names ;
    protected Address adressOfSender ;
    protected Address adressOfReceiver ;
    protected  double weightInOunces;
    protected  double costPerOunce;

    public Package(Name names, Address adressOfSender, Address adressOfReceiver, double weightInOunces, double costPerOunce) {
        this.names = names;
        this.adressOfSender = adressOfSender;
        this.adressOfReceiver = adressOfReceiver;
        this.weightInOunces = validationForWeight(weightInOunces);
        this.costPerOunce = validationForCostPerOunce(costPerOunce);
    }
    public Package() {
        this.names = new Name();
        this.adressOfSender = new Address();
        this.adressOfReceiver = new Address(13,344,"Islamabad");
        this.weightInOunces = 70;
        this.costPerOunce = 5;
    }

    public Name getNames() {
        return names;
    }

    public void setNames(Name names) {
        this.names = names;
    }

    public Address getAdressOfSender() {
        return adressOfSender;
    }

    public void setAdressOfSender(Address adressOfSender) {
        this.adressOfSender = adressOfSender;
    }

    public Address getAdressOfReceiver() {
        return adressOfReceiver;
    }

    public void setAdressOfReceiver(Address adressOfReceiver) {
        this.adressOfReceiver = adressOfReceiver;
    }

    public double getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(double weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        this.costPerOunce = costPerOunce;
    }
    public double calculateCost(){
        return this.costPerOunce*this.weightInOunces;
    }
    public double validationForWeight(double num){
        if(num<0){
            num=70;
            System.out.println("Negative values are not allowed ! Default value " + getWeightInOunces()+" is used");
        }
        return num;
    }
    public double validationForCostPerOunce(double num){
        if(num<0){
            num=5;
            System.out.println("Negative values are not allowed ! Default value " + getCostPerOunce()+" is used");
        }
        return num;
    }

    @Override
    public String toString() {
        return "Package : \n" +
                names.toString()+
                "\nadressOfSender : \n" + adressOfSender.toString() +
                "\nadressOfReceiver : \n" + adressOfReceiver.toString() +
                "\nweightInOunces=" + weightInOunces +
                "\ncostPerOunce=" + costPerOunce ;
    }
}
class TwoDayPackage extends Package{
    private double flatFeeFor2DayPackage;

    public TwoDayPackage(Name names, Address adressOfSender, Address adressOfReceiver, double weightInOunces, double costPerOunce, double flatFeeFor2DayPackage) {
        super(names, adressOfSender, adressOfReceiver, weightInOunces, costPerOunce);
        this.flatFeeFor2DayPackage = flatFeeFor2DayPackage;
    }
    public TwoDayPackage() {
        super(new Name(), new Address(), new Address(13,433,"Islamabad"), 70, 5);
        this.flatFeeFor2DayPackage = 10;
    }

    public double getFlatFeeFor2DayPackage() {
        return flatFeeFor2DayPackage;
    }

    public void setFlatFeeFor2DayPackage(double flatFeeFor2DayPackage) {
        this.flatFeeFor2DayPackage = flatFeeFor2DayPackage;
    }
    @Override
    public double calculateCost(){
        return super.calculateCost()+this.flatFeeFor2DayPackage;
    }

    @Override
    public String toString() {
        return "TwoDayPackage : \n" +
                super.toString()+
                "\nflatFeeFor2DayPackage=" + flatFeeFor2DayPackage + "\nTotal cost : " + this.calculateCost();
    }
}
class OvernightPackage extends Package{
    private double additionalFeeForOvernightPackage;

    public OvernightPackage(Name names, Address adressOfSender, Address adressOfReceiver, double weightInOunces, double costPerOunce, double additionalFeeForOvernightPackage) {
        super(names, adressOfSender, adressOfReceiver, weightInOunces, costPerOunce);
        this.additionalFeeForOvernightPackage = additionalFeeForOvernightPackage;
    }
    public OvernightPackage() {
        super(new Name(), new Address(), new Address(13,433,"Islamabad"), 70, 5);
        this.additionalFeeForOvernightPackage = 25;
    }

    public double getAdditionalFeeForOvernightPackage() {
        return additionalFeeForOvernightPackage;
    }

    public void setAdditionalFeeForOvernightPackage(double additionalFeeForOvernightPackage) {
        this.additionalFeeForOvernightPackage = additionalFeeForOvernightPackage;
    }
    @Override
    public double calculateCost(){
        return super.calculateCost()+this.additionalFeeForOvernightPackage;
    }

    @Override
    public String toString() {
        return "OvernightPackage : \n" +
                super.toString() +
                "\nadditionalFeeForOvernightPackage=" + additionalFeeForOvernightPackage + "\nTotal Cost : " + this.calculateCost();
    }
}
public class task4{
    static void main(String[] args) {
        Name names = new Name("ahmad","saqib");
        Address adressOfSender = new Address(98,434,"Karachi");
        Address adressOfReceiver = new Address(65,354,"Islamabad");
        Package myPackage = new TwoDayPackage();
        Package myPackage2 = new OvernightPackage(names,adressOfSender,adressOfReceiver,100,10,20);
        System.out.println(myPackage.toString());
        System.out.println(myPackage2.toString());

    }
}
