import java.util.Scanner;

public class InputFromTheUserDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // obj for scanner class
        System.out.println("Please enter your name:");
        int age = sc.nextInt();

        System.out.println(age + 20);


    }
}
