package Session_2;

import java.util.Scanner;

public class Array2D_Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];

        for(int i = 0;i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println("Insert value into index "+i+"::"+j);
                a[i][j] = sc.nextInt();
            }
        }

        //outer loop -> vertical, rows
        for(int i = 0;i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }




    }
}
