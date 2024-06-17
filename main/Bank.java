package main;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public Bank(String bankName) {
        if (bankName == null || bankName.isBlank()) throw new RuntimeException();
        this.bankName = bankName;
    }

    public void listAccounts() {
        for (Account account : accounts) {
            System.out.println("{ id:" + account.getAccountNumber() + ", name:" + account.getAccountName() + ", type:" + account.getAccountType() + " }");
        }
    }

    public void openAccount(Account account) {
        if (account == null) throw new RuntimeException();
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        if (account == null) throw new RuntimeException();
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount) {
        if (account == null || amount < 0) throw new RuntimeException();
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        if (account == null || amount < 0) throw new RuntimeException();
        account.withdraw(amount);
    }

    public Account getAccount(int accountNumber, String accountType) {
        if (accountNumber < 0 || accountNumber > accounts.size() || accountType == null || accountType.isBlank()) throw new RuntimeException();
        for (Account account : accounts) {
            if (accountNumber == account.getAccountNumber() && accountType.equals(account.getAccountType()))
                return account;
        }
        return null;
    }
}
