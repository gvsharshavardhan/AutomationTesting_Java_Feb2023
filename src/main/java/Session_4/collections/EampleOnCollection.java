package Session_4.collections;

import java.util.HashMap;

public class EampleOnCollection {


    public static void main(String[] args) {

//        String str = "today, we are gonna discuss about collections and selenium basics";
        String str = "harsha";

        //harsha

        //h - 2, a - 2, r - 1, s - 1

        HashMap<Character, Integer> countMap = new HashMap();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (countMap.get(ch) == null) {
                countMap.put(ch, 1);
            } else {
                int c = countMap.get(ch) + 1;
                countMap.put(ch, c);
            }
        }

        System.out.println(countMap);


    }
}
