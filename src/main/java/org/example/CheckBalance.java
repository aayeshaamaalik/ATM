package org.example;

import java.util.Date;

public class CheckBalance implements Transaction {
    private String id;
    private TransactionStatus status;
    private Date createdOn;
    private String accountNumber;
    private double balance;

    public CheckBalance(String id, String accountNumber, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.createdOn = new Date();
        this.status = TransactionStatus.Success;
    }

    public double getBalance() {
        return balance;
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

