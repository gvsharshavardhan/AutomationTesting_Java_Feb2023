package Session_3.encapsulation;

public class Bank {

    private long amt;
    private String uname;
    private String password;

    Bank(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    long getBalance() {
        return amt;
    }

    void deposit(int depositAmt, String uname, String password) {
        if (uname.equals(this.uname) && password.equals(this.password)) {
            amt = amt + depositAmt;
        }
    }

    void withdraw(int withdrawAmt, String uname, String password) {
        if (uname.equals(this.uname) && password.equals(this.password)) {
            amt = amt - withdrawAmt;
        }
    }

     void updatePassword(String oldpassword, String newPassword) {
        if (oldpassword.equals(this.password)) {
            this.password = newPassword;
        }

    }

}