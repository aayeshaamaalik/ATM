package org.example;

import java.util.Date;

public class Withdraw implements Transaction {
    private String id;
    private int amount;
    private TransactionStatus status;
    private Date createdOn;

    public Withdraw(String id, int amount, boolean successful) {
        this.id = id;
        this.amount = amount;
        this.status = successful ? TransactionStatus.Success : TransactionStatus.Failure;
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

