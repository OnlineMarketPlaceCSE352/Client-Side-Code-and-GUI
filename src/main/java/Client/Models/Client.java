package Client.Models;

public class Client {
    private String name;
    private String email;
    private double balance;

    public Client() {
        this.name=null;
        this.email=null;
        this.balance=0.0;
    }

    public Client(String name, String email, double balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    // UI helper
//    public String getProfileInfo() {
//        return name + " | " + email + " | Balance: " + balance;
//    }
}
