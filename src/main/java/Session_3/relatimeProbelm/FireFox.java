package Session_3.relatimeProbelm;

public class FireFox implements Browser {
    public void click(String buttonName) {
        System.out.println("ff click" + buttonName);
    }

    public void sendText(String text) {
        System.out.println("ff send " + text);
    }

    public void openApplication(String url) {
        System.out.println("ff Opening " + url);
    }
}
