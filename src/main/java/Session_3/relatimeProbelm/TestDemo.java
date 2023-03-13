package Session_3.relatimeProbelm;

public class TestDemo {
    public static void main(String[] args) {
        String browername = "harhsa";

        Browser c;


        if (browername.equals("chrome")) {
            c = new Chrome();
        }else if(browername.equals("firefox")){
            c = new FireFox();
        }else{
            c = new Chrome();
        }

        c.openApplication("amazon.ca");
        c.click("submit button");
        c.sendText("abcd");

    }
}
