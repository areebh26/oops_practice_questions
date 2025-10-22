package basics;

//Task 12
//Define a class called Fraction. This class is used to represent a ratio of two integers. Create two
//constructors, set, get and display function. Include an additional method, equals, that takes as input
//another Fraction and returns true if the two fractions are identical and false if they are not.


class Fraction {
    private int numerator;
    private int denominator;
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
    public boolean equals(Fraction otherFraction) {
        return (this.numerator * otherFraction.denominator) == (this.denominator * otherFraction.numerator);
    }
}
public class task12 {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(3,3);
        Fraction frac2 = new Fraction(2, 2);
        System.out.println("Fraction 1: ");
        frac1.display();
        System.out.println("Fraction 2: ");
        frac2.display();
        System.out.println("Testing equals method:");
        System.out.println("Fraction 1 equals Fraction 2? " + frac1.equals(frac2));
    }
}