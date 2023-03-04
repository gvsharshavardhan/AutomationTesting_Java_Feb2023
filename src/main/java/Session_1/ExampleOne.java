package Session_1;

import java.util.Scanner;

public class ExampleOne {

    public static void main(String[] args) {

        /**
         * program should prompt for username and password
         * if uname and pword are not satisfied then it should print
         * "credentials are incorrect" and again should ask for credentials
         * until user gives correct credentials
         *
         * count: you have got your credentials right in 5 iteration
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Hey user pls enter uname:");
        String uname = sc.nextLine();
        System.out.println("Hey user pls enter password:");
        String password = sc.nextLine();

        while(!(uname.equals("harsha") && password.equals("password"))){
            System.out.println("incorrect credentials! pls enter again:");
            System.out.println("Hey user pls enter uname:");
            uname = sc.nextLine();
            System.out.println("Hey user pls enter password:");
            password = sc.nextLine();
        }
        System.out.println("you are logged in!!!!");

//        if(uname.equals("harsha") && password.equals("password")){
//            System.out.println("you are logged in!!");
//        }else{
//            System.out.println("pls enter valid credentials!!!");
//        }


    }
}
