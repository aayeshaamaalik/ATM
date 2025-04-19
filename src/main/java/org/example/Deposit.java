package org.example;

import java.util.Date;

public class Deposit implements Transaction {
    private String id;
    private int amount;
    private TransactionStatus status;
    private Date createdOn;

    public Deposit(String id, int amount) {
        this.id = id;
        this.amount = amount;
        this.status = TransactionStatus.Success;
        this.createdOn = new Date();
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public TransactionStatus getStatus() {
        return status;
    }

    @Override
    public Date getCreatedOn() {
        return createdOn;
    }
}

