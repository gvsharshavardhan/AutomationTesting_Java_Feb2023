package Session_2;

public class StringDemo {
    public static void main(String[] args) {

        /**
         * 1. String is a seq of chars
         * 2. String is not a primitive datatype
         * 3. String is an object
         *4. == for addr check, .equals() for content check
         *5. String is immutable in java
         *
         */

        String s1 = "busyqa";
        String s2 = "busyqa";
        String s3 = "busyqa456";
        String s4 = new String("busyqa");

        System.out.println(s1==s2);
        System.out.println(s1==s4);

        String name = "harsha vardhan";
        System.out.println(name.length());

        System.out.println(name.charAt(10));

        String s10 = "  abc    ";
        String s20 = "lmn";
        System.out.println(s20.concat(s10));


        System.out.println(s10.length());
        s10 = s10.trim();
        System.out.println(s10.length());

        System.out.println(name.contains("var"));//true
        System.out.println(name.contains("rav"));//false

        String s22 = "abc";
        String s33 = "AbC";

        System.out.println(s22.equals(s33));//false
        System.out.println(s22.equalsIgnoreCase(s33));//true

        s22 = s22.toUpperCase();

        System.out.println(s22);

        String s100 = "Jaxyza";
        s100 = s100.replace("xyz","v");
        System.out.println(s100);

        String s200 = "selenium";
        System.out.println(s200.substring(4));
        System.out.println(s200.substring(4,7));





    }
}
