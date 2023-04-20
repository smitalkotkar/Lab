package lab;

import java.util.Scanner;

abstract class BankAccount {
	int accountNumber;
	double balance;
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		}
	
	public int getAccountNumber() {
		return accountNumber;
		}
	public double getBalance() {
		return balance;
		}
	
	abstract void deposit(double amount);
    abstract void withdraw(double amount);
    }

class CheckingAccount extends BankAccount {


public CheckingAccount(int accountNumber, double balance) {
    super(accountNumber, balance);
}

public void deposit(double amount) {
    double newBalance = getBalance() + amount;
    System.out.println("Depositing Amount " + amount );
    System.out.println("New balance is after depositing " + newBalance);
    super.balance = newBalance;
}

public void withdraw(double amount) {
    double newBalance = getBalance() - amount;
    System.out.println("Withdrawing Amount " + amount);
    System.out.println("New balance is after withdrawing " + newBalance);
    super.balance = newBalance;
}
}

public class Abstraction2 {
public static void main(String[] args) {
CheckingAccount account = new CheckingAccount(1234, 1000.0);
Scanner scanner = new Scanner(System.in);


    System.out.print("Enter amount to deposit: ");
    double depositAmount = scanner.nextDouble();
    account.deposit(depositAmount);
    
    System.out.print("Enter amount to withdraw: ");
    double withdrawAmount = scanner.nextDouble();
    account.withdraw(withdrawAmount);
}
}
