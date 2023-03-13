package Session_3.valueAndReference;

public class Test {


    static int a = 10; //global variables
    static Integer b = 100;

    static int m1(int x) {
       return x+10;
    }

    static Integer m3(Integer y){
        return y + 50;
    }

    static void m2(Car c){
        c.setCarValue(30);
    }

    public static void main(String[] args) {

        //3
        System.out.println(b);//100
        m3(b);
        System.out.println(b);


        //1
        System.out.println(a);//10
        m1(a);//10
        System.out.println(a);//20

        //2
        Car c = new Car();
        c.x = 20;
        System.out.println(c.x);//
        m2(c);
        System.out.println(c.x);//







    }
}
