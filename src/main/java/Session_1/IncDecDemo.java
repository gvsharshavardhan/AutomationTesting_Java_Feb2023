package Session_1;

public class IncDecDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        int c = a--;
        int d = ++c;
        int e = --b;
        int f = d-e;
        int g = f++;
        int h = g+a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
}
