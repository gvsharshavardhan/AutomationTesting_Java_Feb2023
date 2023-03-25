package Session_4;

public class StringStringBufferStringBuilderDemo {

    public static void main(String[] args) {


        StringBuffer str = new StringBuffer("harsha");
        str.replace(0,str.length()-1,"z");
        System.out.println(str);
        str.reverse();

    }

}
