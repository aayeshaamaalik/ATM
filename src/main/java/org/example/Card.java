package org.example;

import java.util.Date;

public class Card {
    private String cardNumber;
    private String userName;
    private Date expiryDate;
    private int pin;

    public Card(String cardNumber, String userName, Date expiryDate, int pin) {
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.expiryDate = expiryDate;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }
}

