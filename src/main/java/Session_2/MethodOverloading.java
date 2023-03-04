package Session_2;

public class MethodOverloading {


    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, double b){
        return a+b;
    }

    static void test(){
        System.out.println("test static method");
    }

    public static void main(String[] args) {
        MethodOverloading ml = new MethodOverloading();
        ml.sum(12,23);
    }
}