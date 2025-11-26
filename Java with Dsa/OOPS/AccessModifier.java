
public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "shivam";
        // myAcc.password="abcd";//can't access
        System.out.println(myAcc.userName);
        
        myAcc.setPassword("abcd");
        
        // System.out.println(myAcc.Password);
    }

}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pass) {
        password = pass;
        System.out.println(password);
    }
}
