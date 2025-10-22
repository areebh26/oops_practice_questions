package basics;

//Task 5
//Write a class Time with three data members to store hr, min and seconds. Create two constructors and
//apply checks to set valid time. Also create display function which displays all data members.

class Time2{
    int hours;
    int minutes;
    int seconds;

    public Time2() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time2(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hours = h;
        } else {
            hours = 0;
        }
        if (m >= 0 && m < 60) {
            minutes = m;
        } else {
            minutes = 0;
        }
        if (s >= 0 && s < 60) {
            seconds = s;
        } else {
            seconds = 0;
        }
    }

    public void display() {
        System.out.printf("Time: %d:%d:%d\n", hours, minutes, seconds);
    }
}
public class task9 {
    public static void main(String[] args) {
        System.out.println("Default Time:");
        Time2 time1 = new Time2();
        time1.display();
        System.out.println("Valid Time :");
        Time2 time2 = new Time2(14, 30, 45);
        time2.display();
        System.out.println("Invalid Time:");
        Time2 time3 = new Time2(25, 70, 80);
        time3.display();
    }
}

