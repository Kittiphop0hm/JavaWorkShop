package main;

public class CurrentAccount implements Account {
    private int accountNumber;
    private String accountName;
    private  double balance;
    private double minimum;
    private String accountType;

    public CurrentAccount(int accountNumber, String accountName, double balance, double minimum) {
        if (accountNumber < 0 || accountName == null || accountName.isBlank() || balance < 0) throw new RuntimeException();
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.minimum = minimum;
        this.accountType = "CurrentAccount";
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) throw new RuntimeException();
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0 || amount > this.balance) throw new RuntimeException();
        this.balance -= amount;

    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getAccountType() {
        return this.accountType;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public String getAccountName() {
        return this.accountName;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }
}
