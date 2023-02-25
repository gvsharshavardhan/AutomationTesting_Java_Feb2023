public class WhileLoopDemo {
    public static void main(String[] args) {

/**
 int sensor = sensor();
 while (sensor != flag) {
 System.out.println("move forward by 1 step");
 sensor = sensor();
 }
 **/
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i >= 10);
    }
}
