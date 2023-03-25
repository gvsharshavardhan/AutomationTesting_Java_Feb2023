package Session_4.collections;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("soaps", 10);
        m.put("atta", 40);
        m.put("rice", 50);
        m.put(10, 50);
        m.put(10.4,false);
        m.put(true,new Car("bmw","10lit/km"));
        m.put(null,new Car("toyota","10lit/km"));
        m.put("soaps",100);

        System.out.println(m);

        Set keys = m.keySet();
        System.out.println(keys);

        Collection values = m.values();
        System.out.println(values);


        Set entries = m.entrySet();
        System.out.println(entries);


    }


}
