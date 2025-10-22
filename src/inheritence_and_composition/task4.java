package inheritence_and_composition;

//Create a class named Pizza that stores information about a single pizza. It should contain the following:
//        41Private instance variables to store the size of the pizza (either small, medium, or large), the number of
//        cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
//Constructor(s) that set all of the instance variables.
//Public methods to get and set the instance variables.
//        A public method named calcCost( ) that returns a double that is the cost of the pizza. Pizza cost is
//determined by:
//Small: $10 + $2 per topping Medium: $12 + $2 per topping Large: $14 + $2 per topping
//public method named getDescription( ) that returns a String containing the pizza size, quantity of each
//topping.
//Write test code to create several pizzas and output their descriptions. For example, a large pizza with one
//cheese, one pepperoni and two ham toppings should cost a total of $22.
//Now Create a PizzaOrder class that allows up to three pizzas to be saved in an order. Each pizza saved
//should be a Pizza object. Create a method calcTotal() that returns the cost of order.
//In the runner order two pizzas and return the total cost.


class Pizza{
    private String size;
    private int cheese;
    private int pepparoni;
    private int ham;
    static int count=0;

    public Pizza(String size, int cheese, int pepparoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepparoni = pepparoni;
        this.ham = ham;
        count++;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepparoni() {
        return pepparoni;
    }

    public void setPepparoni(int pepparoni) {
        this.pepparoni = pepparoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }
    public  double calCost(){
        double cost=0;
        switch(size){
            case "small":
                cost=10+(2*cheese)+(2*pepparoni)+(2*ham);
                break;

            case "medium" :
                cost=12+(2*cheese)+(2*pepparoni)+(2*ham);
                break;

            case "large" :
                cost=14+(2*cheese)+(2*pepparoni)+(2*ham);
                break;
        }
        return cost;
    }

    public String getDescription(){
        String des = "Pizza size : " + size + "\nQuantity of cheese : " + String.valueOf(cheese) + "\nQuantity of paparoni : " + String.valueOf(pepparoni)+"\nQuantity of ham : " +String.valueOf(ham)+"\nCost : " + String.valueOf(calCost());
        return des;
    }
}

class PizzaOrder{


    //    ye pizzaorder class sirf upto 3 pizza objects ke liye design ki he as mentioned in task
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;

    public PizzaOrder(Pizza p) {
        this.p1 = p;
    }
    public PizzaOrder(Pizza p1,Pizza p2) {
        this.p1 = p1;
        this.p2=p2;
    }
    public PizzaOrder(Pizza p1,Pizza p2,Pizza p3) {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    double calTotal(){
        double total=0;
        if( Pizza.count==1){
            total= p1.calCost();
        } else if (Pizza.count==2) {
            total= p1.calCost()+ p2.calCost();
        } else if (Pizza.count==3) {
            total= p1.calCost()+ p2.calCost()+ p3.calCost();
        }
        return total;

    }

}

public class task4{
    public static void main(String[] args) {
//        Pizza p1 = new Pizza("small" , 1 , 1 , 1);
//        System.out.println(p1.getDescription());
//        Pizza p2 = new Pizza("small" , 3 , 2 , 1);
//        System.out.println(p2.getDescription());
//        Pizza p3 = new Pizza("large" , 1 , 1 , 2);
//        System.out.println(p3.getDescription());



        Pizza p4 = new Pizza("medium" , 2 , 2 , 1);
        System.out.println(p4.getDescription());
        Pizza p5 = new Pizza("small" , 1 , 1 , 1);
        System.out.println(p5.getDescription());
        PizzaOrder firstOrder = new PizzaOrder(p4,p5);
        System.out.println(firstOrder.calTotal());
    }
}
