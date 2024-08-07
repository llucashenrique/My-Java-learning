package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class BankAccounte {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdrawe(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}


