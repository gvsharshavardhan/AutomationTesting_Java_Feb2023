package Session_1;

public class OperatorDemo {

    public static void main(String[] args) {

//        int a = 17;
//        int b = 5;
//        int c = a/b;
//        int d = a%b;
//        System.out.println(c);
//        System.out.println(d);

        /**
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
         **/


        //++ increment - pre post
        //-- decrement - pre post
        //k++ -> post inc, ++k->pre inc
        //k++,++k => k = k + 1
        int k = 10;
        int j = k++;
        int l = ++k;
//        System.out.println(j);//
//        System.out.println(l);//


        int a = 13;
        int b = 14;
        int c = a++;
        int d = --b;
        int e = ++a;
        int f = b--;
        int g = a+b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);






    }
}
