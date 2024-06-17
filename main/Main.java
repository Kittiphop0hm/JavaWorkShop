package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankUI();
    }

    public static void BankUI() {
        String choice = """
                1. Display All Account.
                2. Open New Account.
                3. Close Existing Account.
                4. Deposit.
                5. Withdraw.
                0. Exit""";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            case 3: {
                System.out.println("3");
                break;
            }
            case 4: {
                System.out.println("4");
                break;
            }
            case 5: {
                System.out.println("5");
                break;
            }
            default:
                System.out.println("Exit");
                break;
        }

    }
}