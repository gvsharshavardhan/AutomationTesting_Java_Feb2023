package Session_4.collections;


import java.util.List;
import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
//
//        Car honda = new Car("honda CRV");
//        Car bmw = new Car("BMW");
//        Car toyota = new Car("Toyota");

        ArrayList l = new ArrayList();
        l.add(10);
        l.add(10.7);
        l.add(false);
        l.add('@');
        l.add("harsha");
        l.add(null);
        l.add("harsha");
//        l.add(new Car("Tesla"));
//        l.add(honda);
//        l.add(bmw);
//        l.add(toyota);
//
        System.out.println(l);
//        System.out.println(honda);

        l.add(3,100);
        System.out.println(l);
        System.out.println(l.indexOf("harsha"));
        System.out.println(l.lastIndexOf("harsha"));
        l.remove("harsha");
        System.out.println(l);
        System.out.println(l.set(1,20.7));//10.7
        System.out.println(l);




    }
}
