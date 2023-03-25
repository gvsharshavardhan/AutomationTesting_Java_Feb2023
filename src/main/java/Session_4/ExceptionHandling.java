package Session_4;

public class ExceptionHandling {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int[] abc = {1,2,3};

        try {
            System.out.println(abc[5]);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
//        try {
//            System.out.println(a / b);
//            System.out.println(abc[5]);
//        }catch (ArrayIndexOutOfBoundsException ae){
//            System.out.println(a/1);
//        }


        System.out.println("harsha");


    }

}