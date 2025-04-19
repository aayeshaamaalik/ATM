package org.example;

public class User {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private Account account;
    private Card card;

    public User(String name, String email, String phone, Address address, Account account, Card card) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.account = account;
        this.card = card;
    }

    public boolean makeTransaction(TransactionType type, int amount, String accountNumber) {
        if (!account.getAccountNumber().equals(accountNumber)) {
            System.out.println("Account mismatch!");
            return false;
        }

        switch (type) {
            case DisplayBalance:
                System.out.println("Available Balance: $" + account.getBalance());
                return true;
            case Deposit:
                account.deposit(amount);
                System.out.println("Deposited: $" + amount);
                return true;
            case Withdraw:
                if (account.withdraw(amount)) {
                    System.out.println("Withdrawn: $" + amount);
                    return true;
                } else {
                    System.out.println("Insufficient balance.");
                    return false;
                }
            default:
                return false;
        }
    }

    public Account getAccount() {
        return account;
    }

    public Card getCard() {
        return card;
    }
}
