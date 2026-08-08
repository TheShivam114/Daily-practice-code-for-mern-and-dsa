/*Problem: Bank Account Balance Display
You are required to create a simple banking class using OOP principles.
Task:
Create a class BankAccount with the following attributes:
long accountNumber
double balance
The class must contain:

A parameterized constructor to initialize account number and balance.
A method displayBalance() that prints the balance in the format:

Balance: <balance>

In the main method:
Take input for account number and balance.
Create an object of BankAccount.
Call the displayBalance() method.

Input Format:
<accountNumber>
<balance>

Output Format:
Balance: <balance> */
import java.util.*;
public class oops_day3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long accountNumber = sc.nextLong();
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accountNumber, balance);
        acc.displayBalance();
    }
}

class BankAccount {
    long accountNumber;
    double balance;

    // Parameterized constructor
    BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
