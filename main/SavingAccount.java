package main;

public class SavingAccount implements Account {
    private int accountNumber;
    private String accountName;
    private  double balance;
    private String accountType;

    public SavingAccount(int accountNumber, String accountName, double balance) {
        if (accountNumber < 0 || accountName == null || accountName.isBlank() || balance < 0) throw new RuntimeException();
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.accountType = "SavingAccount";
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
}
