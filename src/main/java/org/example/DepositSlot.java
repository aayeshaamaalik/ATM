package org.example;

public class DepositSlot {
    private int totalAmount;

    public DepositSlot(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void addCash(int amount) {
        totalAmount += amount;
    }
}

