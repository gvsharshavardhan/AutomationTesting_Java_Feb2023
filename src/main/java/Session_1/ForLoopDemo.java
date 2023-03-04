package Session_1;

public class ForLoopDemo {
    public static void main(String[] args) {

        int i;
        for (i = 1; i <= 10; i++) {
           if(i==7){

               continue;

           }else{
               System.out.println(i);
           }

        }

        //1 to 10, but stop when you see 7

    }
}
