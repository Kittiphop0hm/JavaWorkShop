package bms;

public class CurrentAccount implements Account {
    private int accountNumber;
    private String accountName;
    private double balance;
    private double minimum;
    private String accountType;
    
    public CurrentAccount(int accountNumber, String accountName, double balance, double minimum) {
        if (accountNumber <= 0 || accountName == null || accountName.isBlank() || balance <= 0 || minimum <= 0) throw new RuntimeException();
        this.minimum = minimum;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.accountType = "Current Account";
    }

    @Override
    public void deposit(double amount) {
        if (amount >= 1) {
            this.balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount >= 1 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    @Override
    public String getAccountName() {
        return this.accountName;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public String getAccountType() {
        return this.getAccountType();
    }

    @Override
    public double getBalance() {
        return this.balance;      
    }
}
