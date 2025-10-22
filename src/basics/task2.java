package basics;

//Task 2
//Time is an intangible concept. Analyze the concept and identify the data members and methods that
//should be included in Time class.

class Time {
    int seconds;
    int min;
    int hour;
    void displayTime(){
        System.out.println(hour+":"+min+":"+seconds);
    }
    void setTime(int h , int m , int s){
        seconds=s;
        min=m;
        hour=h;
    }


}
public class task2{
    static void main() {
        Time mytime = new Time();
        mytime.setTime(12,30,10);
        mytime.displayTime();
    }
}
