package bms;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    ArrayList<Account> arrayList = new ArrayList<Account>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void listAccounts() {
        System.out.println(arrayList);
    }

    public void openAccount(Account account) {
        if (account == null) throw new RuntimeException();
        arrayList.add(account);
    }

    public void closeAccount(Account account) {
        if (account == null) throw new RuntimeException();
        arrayList.remove(account);
    }

    public void depositMoney(Account account, double amount) {
        if (account == null || amount <= 0) throw new RuntimeException();
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        if (account == null || amount <= 0 ) throw new RuntimeException();
        account.withdraw(amount);
    }

    public Account getAccount(int accountNumber, String accountType) {
        if (accountNumber >= 0 || accountType != null) {
            for (Account arraysAccount : arrayList) {
                if (arraysAccount.getAccountNumber() == accountNumber && arraysAccount.getAccountType().equals(accountType)) {
                    return arraysAccount;
                }
            }
        }
        return null;
    }
}
