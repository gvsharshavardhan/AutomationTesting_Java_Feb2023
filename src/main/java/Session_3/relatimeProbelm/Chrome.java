package Session_3.relatimeProbelm;

public class Chrome implements Browser {


    public void click(String buttonName) {
        System.out.println("chrome click" + buttonName);
    }

    public void sendText(String text) {
        System.out.println("chrome send " + text);
    }

    public void openApplication(String url) {
        System.out.println("Opening " + url);
    }

    void chromeSpecifcMethd() {
        System.out.println("chrome specific method");
    }
}
