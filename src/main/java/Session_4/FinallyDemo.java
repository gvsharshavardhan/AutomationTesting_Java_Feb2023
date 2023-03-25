package Session_4;

public class FinallyDemo {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;

        //opened db connection

        try {
            //trying to read db values
            System.out.println(a / b);
            //
            //
            //
            //
        }finally {
            System.out.println("close the bd");
        }


    }
}
