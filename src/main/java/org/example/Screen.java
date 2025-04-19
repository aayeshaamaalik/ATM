package org.example;

import java.util.Scanner;

public class Screen {
    public boolean showMessage(String msg) {
        System.out.println("SCREEN: " + msg);
        return true;
    }

    public TransactionType getInput() {
        System.out.println("Select Transaction Type:");
        System.out.println("1. Display Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return TransactionType.DisplayBalance;
            case 2:
                return TransactionType.Deposit;
            case 3:
                return TransactionType.Withdraw;
            default:
                return null;
        }
    }
}
