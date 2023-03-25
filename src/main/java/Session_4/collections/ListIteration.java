package Session_4.collections;

import java.util.ArrayList;

public class ListIteration {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add(10);
        l.add(10.7);
        l.add(false);
        l.add('@');
        l.add("harsha");
        l.add(null);
        l.add("harsha");


        for(Object o:l){
            System.out.println(o);
        }


    }
}
