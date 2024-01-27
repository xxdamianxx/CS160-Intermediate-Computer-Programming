/*
 *  Managing Bank Account
 *  This program performs basic banking functions
 *  CS160-3
 *  September 12, 2023
 *  @author Pedro Damian Sanchez Jr
 */

 public class Account {
    private String name;
    private double balance;

    public Account() {
        name = "NoName";
        balance = 0;
    }

    public void setName(String userName) {
        name = userName;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public void printDetails() {
        System.out.println("Hi " + name + ", you have $" + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}