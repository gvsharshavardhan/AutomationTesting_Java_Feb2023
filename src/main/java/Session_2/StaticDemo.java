package Session_2;

public class StaticDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Anusha");
        s1.increment();
        Student s2 = new Student("Manju");
        s2.rollNum++;
        Student s3 = new Student("Nandhini");
        s3.increment();

        System.out.println(Student.rollNum);
        //N-> 13, A-> 10, M-> 12


    }
}
