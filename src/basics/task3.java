package basics;

//Task 3
//Car is an object that helps us in transportation. Analyze the concept and identify the data members and
//methods that should be included in Car class.

class car{
    String ManufacturedBy;
    String model;
    String color;
    int numberOfSeats;
    String fuelType;
    int manufacturingYear;
    void displayDetails(){
        System.out.println("Manufactured by : " + ManufacturedBy);
        System.out.println("Name of Car : " + model);
        System.out.println("Manufactured in : " + manufacturingYear);
        System.out.println("Color : " + color);
        System.out.println("Fuel type : " + fuelType);
        System.out.println("Number of seats : " + numberOfSeats);
    }
    void changeColor(String newColor){
        color=newColor;
    }
    void startEngine(){
        System.out.println("Engine is starting ");
    }
    void drive(){
        System.out.println("Car is running");
    }
    void applyBreak(){
        System.out.println("Breaks are applied");
    }

}
public class task3{
    static void main() {
        car civic = new car();
        civic.numberOfSeats=5;
        civic.color="black";
        civic.fuelType="Petrol";
        civic.ManufacturedBy="honda";
        civic.manufacturingYear=2025;
        civic.model="Civic";
        civic.displayDetails();
        civic.startEngine();
        civic.drive();
        civic.applyBreak();

    }
}
