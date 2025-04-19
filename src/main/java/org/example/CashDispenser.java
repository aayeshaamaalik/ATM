package org.example;

public class CashDispenser {
    private int twentyDollarBills;
    private int tenDollarBills;
    private int fiftyDollarBills;

    public CashDispenser(int twenties, int tens, int fifties) {
        this.twentyDollarBills = twenties;
        this.tenDollarBills = tens;
        this.fiftyDollarBills = fifties;
    }

    public boolean canDispense(int amount) {
        return getTotalCash() >= amount;
    }

    public boolean dispenseCash(int amount) {
        if (!canDispense(amount)) {
            System.out.println("Not enough cash in machine.");
            return false;
        }
        // Simplified logic: we assume exact match is not mandatory
        System.out.println("Dispensed $" + amount);
        return true;
    }

    private int getTotalCash() {
        return 20 * twentyDollarBills + 10 * tenDollarBills + 50 * fiftyDollarBills;
    }
}
