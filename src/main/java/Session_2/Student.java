package Session_2;

public class Student {

    String name;

    static int rollNum = 10;

    Student(String name){
        this.name = name;
        rollNum++;
    }

    void increment(){
        rollNum++;
    }

}