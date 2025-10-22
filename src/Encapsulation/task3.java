package Encapsulation;

//Create an Encapsulated class Student with following
//        characteristics:
//Data Members:
//String Name
//Int [] Result_array[5] // Result array contains the marks for 5 subjects
//Methods:
//Student ( String, int[])
//// argument Constructor
//Average ()
//// it calculates and returns the average based on the marks in the array.
//Runner:
//Create two objects of type Student and call the Average method.
//24Compare the Average of both Students and display which student has higher average. Create a
//third student with name as object 1 and result array as object 2

class Student{
    private String name;
    private int [] result;
    Student(String name, int[] result) {
        this.name = name;
        this.result = result;
    }
    double Average(){
        double sum=0;
        for (int i = 0 ; i < this.result.length;i++){
            sum+=result[i];
        }
        return sum/result.length;
    }
    public void setResult(int[] result) {
        this.result = result;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int[] getResult() {
        return result;
    }
}
public class task3{
    public static void main(String[] args) {
        int [] marks1 = {99,87,65,98,77};
        int [] marks2 = {67 , 88 , 53,54,99};
        Student stu1 = new Student("Areeb" , marks1);
        Student stu2 = new Student("Ali" , marks2);
        double average1 = stu1.Average();
        double average2 = stu2.Average();
        if(average1>average2){
            System.out.println("Average of student 1 is greater i.e : " + average1);

        }
        else if (average1==average2){
            System.out.println("both studetns have same average i.e : " + average2);
        }
        else{
            System.out.println("Average of student 2 is greater i.e : " + average2);
        }

        Student stu3 = new Student(stu1.getName(),stu2.getResult());
    }
}
