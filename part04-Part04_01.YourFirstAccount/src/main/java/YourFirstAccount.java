
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account thomasAccount = new Account("Thomas's account", 100.0);
        
        thomasAccount.deposit(20.0);
        
        System.out.println(thomasAccount);
        
    }
}
