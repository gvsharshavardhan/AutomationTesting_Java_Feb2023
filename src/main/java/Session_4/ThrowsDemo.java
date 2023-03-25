package Session_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    static FileReader fr;

    static void readFileAndPrintOutputOnTOtHeScreen() throws IOException {
        fr = new FileReader("E:\\febSelenium\\test1.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) throws IOException {

        readFileAndPrintOutputOnTOtHeScreen();


    }
}
