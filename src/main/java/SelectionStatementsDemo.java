public class SelectionStatementsDemo {

    public static void main(String[] args) {


        int marks = 40;


        if (marks >= 0 && marks < 40) {
            System.out.println("fail");
        } else if (marks >= 40 && marks < 80) {
            System.out.println("Avg");
        } else if (marks >= 80 && marks <= 100) {
            System.out.println("good");
        } else {
            System.out.println("please enter valid marks!!");
        }


        System.out.println("bye!");
    }
}
