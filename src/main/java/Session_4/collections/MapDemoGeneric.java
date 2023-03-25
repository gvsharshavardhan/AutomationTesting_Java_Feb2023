package Session_4.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemoGeneric {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("soaps", 10);
        hm.put("nuts", 30);
        hm.put("bars", 50);
        hm.put("flour", 70);
        hm.put("fruits", 90);

        Set entries = hm.entrySet();

        for (Object entry : entries) {
            System.out.print("Key: " + ((Map.Entry<String, Integer>) entry).getKey() + " :: ");
            System.out.println("Value: " + ((Map.Entry<String, Integer>) entry).getValue());
        }




    }
}
