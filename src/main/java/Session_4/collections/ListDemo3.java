package Session_4.collections;

import java.util.ArrayList;

public class ListDemo3 {

    public static void main(String[] args) {

        ArrayList fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");

        ArrayList animals = new ArrayList<>();
        animals.add("tiger");
        animals.add("lion");
        animals.add("elephant");

        fruits.addAll(animals);

        System.out.println(fruits);

    }
}
