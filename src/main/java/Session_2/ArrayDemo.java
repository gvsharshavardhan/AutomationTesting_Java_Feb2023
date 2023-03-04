package Session_2;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);


        int[] b = new int[5];
        for(int i=0;i<b.length;i++ ){
            System.out.println("Enter value into array of index "+i);
            b[i] = sc.nextInt();
        }

//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);
//        System.out.println(b[3]);
//        System.out.println(b[4]);


        System.out.println("OUTPUT:");

        for(int i=0;i<b.length;i++ ){
            System.out.println(b[i]);
        }


    }
}
