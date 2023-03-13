package Session_3.TVExample;

public class Demo {

    public static void main(String[] args) {
        Sony s = new SonyPro();
        s.program();
        s.volume();
        SonyPro sp = (SonyPro)s;
        sp.bluetooth();



    }




}
