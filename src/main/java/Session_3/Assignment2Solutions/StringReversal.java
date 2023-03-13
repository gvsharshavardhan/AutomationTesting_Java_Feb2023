package Session_3.Assignment2Solutions;

public class StringReversal {

    public static void main(String[] args) {

        String s1 = "bird";

        char[] ch = s1.toCharArray();

        for(int i=0;i<ch.length/2;i++){
            char temp = '0';
            temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        System.out.println(String.valueOf(ch));
    }
}
