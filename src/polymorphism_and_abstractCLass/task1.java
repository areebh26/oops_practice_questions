package polymorphism_and_abstractCLass;

//Create a class named Movie that can be used with your video rental business. The Movie class should
//track the Motion Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R), ID Number,
//and movie title with appropriate accessor and mutator methods. Also create an equals() method that
//overrides Object ’s equals() method, where two movies are equal if their ID number is identical. Next,
//create three additional classes named Action , Comedy , and Drama that are derived from Movie .
//Finally, create an overridden method named calcLateFees that takes as input the number of days a movie
//is late and returns the late fee for that movie. The default late fee is $2/day. Action movies have a late fee
//of $3/day, comedies are $2.50/day, and dramas are $2/day. Test your classes from a main method.


class Movie{
    private String title;
    private String ID;
    private String rating;

    public Movie(String title, String ID, String rating) {
        this.title = title;
        this.ID = ID;
        this.rating = rating;
    }

    public Movie() {
        this.title="xyz";
        this.ID="123A";
        this.rating="PG-13";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public double lateFee(int numberOfDays){
        return 2*numberOfDays;
    }

    @Override
    public boolean equals(Object obj) {
        Movie other = (Movie)obj;
        if(this.ID.equals(other.ID)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "  title='" + title + '\'' +
                ", ID='" + ID + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
class Action extends Movie{
    public Action(String title, String ID, String rating){
        super(title,ID,rating);
    }
    public Action(){
        super();
    }
    @Override
    public double lateFee(int numberOfDays){
        return 3*numberOfDays;
    }

}
class Comedy extends Movie{
    public Comedy(String title, String ID, String rating){
        super(title,ID,rating);
    }
    public Comedy(){
        super();
    }
    @Override
    public double lateFee(int numberOfDays){
        return 2.5*numberOfDays;
    }
}
class Drama extends Movie{
    public Drama(String title, String ID, String rating){
        super(title,ID,rating);
    }
    public Drama(){
        super();
    }
}
public class task1{
    static void main() {
        Action action = new Action("abc","125A","PG13");
        System.out.println(action.toString());
        System.out.println("Late fee : ");
        System.out.println(action.lateFee(5));
        System.out.println();
        System.out.println();
        System.out.println();

        Comedy comedy = new Comedy();
        System.out.println(comedy.toString());
        System.out.println("Late fee : ");
        System.out.println(comedy.lateFee(10));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Does both books have same ID ?  " + action.equals(comedy));

    }
}