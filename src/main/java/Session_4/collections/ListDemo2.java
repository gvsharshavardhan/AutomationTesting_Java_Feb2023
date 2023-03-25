package Session_4.collections;

import java.util.ArrayList;

public class ListDemo2 {


    public static void main(String[] args) {


        ArrayList AL1 = new ArrayList();

        AL1.add("Nandhini");
        AL1.add("Manju");


        ArrayList AL2 = (ArrayList)AL1.clone();

        AL2.add("Anusha");

        System.out.println(AL1);//n,m
        System.out.println(AL2);//n,m,a


    }
}
