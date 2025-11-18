package polymorphism_and_abstractCLass;

//create a class hierarchy that performs conversions from one system of units to another. Your program
//should perform the following conversions,
//i. Liters to Gallons, ii. Fahrenheit to Celsius and iii. Feet to Meters
//The Super class convert declares two variables, val1 and val2, which hold the initial and converted
//        values, respectively. It contains an abstract function “compute()”.
//        66The function that will actually perform the conversion, compute() must be defined by the classes derived
//from convert. The specific nature of compute() will be determined by what type of conversion is taking
//place.
//Three classes will be derived from convert to perform conversions of Liters to Gallons (l_to_g),
//Fahrenheit to Celsius (f_to_c) and Feet to Meters (f_to_m), respectively. Each derived class implements
//compute() in its own way to perform the desired conversion.
//Test these classes from main() to demonstrate that even though the actual conversion differs between
//l_to_g, f_to_c, and f_to_m, the interface remains constant.


abstract  class Convert {
    protected double initial_value;
    protected double final_value;


    public double getInitial_value() {
        return initial_value;
    }

    public void setInitial_value(double initial_value) {
        this.initial_value = initial_value;
    }

    public double getFinal_value() {
        return final_value;
    }

    public void setFinal_value(double final_value) {
        this.final_value = final_value;
    }

    abstract double compute();

    @Override
    public abstract String toString();
}
class LitretoGallom extends Convert{
    public LitretoGallom(double a ) {
        super.initial_value=a;
    }

    public double compute(){

        super.final_value = super.initial_value*0.26417;
        return super.final_value;
    }

    @Override
    public String toString() {
        return "Initial value : " + super.initial_value +" L"+"\nFinal Value : " + this.compute() + " Gallons";
    }

}
class FahrenheittoCelcius extends Convert{
    public FahrenheittoCelcius(double a ) {
        super.initial_value=a;
    }

    @Override
    double compute() {
        super.final_value=Math.round((super.initial_value-32)*(5.0/9));
        return final_value;
    }

    @Override
    public String toString() {
        return "Initial value : " + super.initial_value +" F"+"\nFinal Value : " + this.compute() + " C";
    }
}
class FeetToMeters extends Convert{
    public FeetToMeters(double a ) {
        super.initial_value=a;
    }

    @Override
    double compute() {
        super.final_value=Math.round(super.initial_value*0.3048);
        return final_value;
    }

    @Override
    public String toString() {
        return "Initial value : " + super.initial_value +" feet"+"\nFinal Value : " + this.compute() + " meters";
    }
}
public class task6 {
    static void main(String[] args) {
        System.out.println("Converting feet to meters : ");
        Convert conversion1 = new FeetToMeters(10);
        System.out.println(conversion1.toString());
        System.out.println();
        System.out.println();
        System.out.println("Converting fehrenheit to celcius : ");
        FahrenheittoCelcius conversion2 = new FahrenheittoCelcius(77);
        System.out.println(conversion2.toString());
        System.out.println();
        System.out.println();
        System.out.println("Converting litres to gallon : ");
        LitretoGallom conversion3 = new LitretoGallom(10);
        System.out.println(conversion3.toString());

    }
}