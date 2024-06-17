package bms;

public class Test {
    public static void main(String[] args) {
        testBank();
    }

    public static void testBank() {
        Account a1 = new SavingAccount(1, "Ohm", 100000.00);
        Account a2 = new CurrentAccount(2, "Ohm", 5000.00, 100.00);
        Bank b1 = new Bank("Oomsin");
        //test openAccount
        b1.openAccount(a1);
        b1.openAccount(a2);
        b1.listAccounts();
        //test closeAccount
        b1.closeAccount(a2);
        b1.listAccounts();
        //test deposit
        b1.depositMoney(a1, 50000.00);
        System.out.println("Deposit: " + a1.getBalance());
        //test withdraw
        b1.withdrawMoney(a1, 100000.00);
        System.out.println("Withdraw: " + a1.getBalance());
        //test getAccount
        b1.openAccount(a2);
        System.out.println(b1.getAccount(a1.getAccountNumber(), a1.getAccountType()));
    }
}
