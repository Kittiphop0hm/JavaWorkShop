package bms;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    ArrayList<Account> arrayList = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void listAccount() {}
    public void openAccount(Account account) {}
    public void closeAccount(Account account) {}
    public void depositMoney(Account account, double amount) {}
    public void withdrawMoney(Account account, double amount) {}
    public Account getAccount(int accountNumber, String accountType) {
        return null;
    }
}
