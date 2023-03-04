package Session_2;

public class StringImmutability {

    public static void main(String[] args) {

        String s1 = "busy";
        String s2 = "qa";

        System.out.println(s1);//busy
        System.out.println(s2);//qa

        s1 = s1.concat(s2);

        System.out.println(s1);//busyqa, busy, busyqa
        System.out.println(s2);//qa



    }
}
