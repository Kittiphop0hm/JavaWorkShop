package main;

public class Test {
    public static void main(String[] args) {
        testBankApp();
    }

    public static void testBankApp() {
        Bank b1 = new Bank("OomSin");
        Account ac1 = new CurrentAccount(11, "Ohm", 10000.00, 500.00);
        Account as1 = new SavingAccount(22, "Gun", 50000.00);
        b1.openAccount(ac1);
        b1.openAccount(as1);
        b1.listAccounts();
        b1.closeAccount(ac1);
        b1.listAccounts();


    }
}
