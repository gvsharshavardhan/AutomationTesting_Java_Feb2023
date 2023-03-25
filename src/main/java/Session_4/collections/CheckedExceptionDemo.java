package Session_4.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    static FileReader fr;

    public static void main(String[] args) {

        try {
            fr = new FileReader("E:\\febSelenium\\test.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }

        BufferedReader br = new BufferedReader(fr);

        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e);
        }


    }

}
