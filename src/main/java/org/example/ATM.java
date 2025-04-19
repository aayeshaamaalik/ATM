package org.example;

public class ATM {
    private int id;
    private Address address;
    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Screen screen;
    private CardReader cardReader;
    private DepositSlot depositSlot;

    public ATM(int id, Address address, CashDispenser dispenser, Keypad keypad,
               Screen screen, CardReader reader, DepositSlot depositSlot) {
        this.id = id;
        this.address = address;
        this.cashDispenser = dispenser;
        this.keypad = keypad;
        this.screen = screen;
        this.cardReader = reader;
        this.depositSlot = depositSlot;
    }

    public boolean authenticate(Card card, int enteredPin) {
        return cardReader.readCard() && card.validatePin(enteredPin);
    }

    public void start(User user) {
        screen.showMessage("Welcome! Please insert your card.");
        Card card = user.getCard();

        if (!authenticate(card, Integer.parseInt(keypad.getInput()))) {
            screen.showMessage("Incorrect PIN. Exiting...");
            return;
        }

        TransactionType type = screen.getInput();
        Account account = user.getAccount();
        String accNum = account.getAccountNumber();

        switch (type) {
            case DisplayBalance:
                screen.showMessage("Balance: $" + account.getBalance());
                break;

            case Deposit:
                screen.showMessage("Enter deposit amount:");
                int depositAmount = Integer.parseInt(keypad.getInput());
                account.deposit(depositAmount);
                depositSlot.addCash(depositAmount);
                screen.showMessage("Deposited: $" + depositAmount);
                break;

            case Withdraw:
                screen.showMessage("Enter withdrawal amount:");
                int withdrawAmount = Integer.parseInt(keypad.getInput());
                if (!cashDispenser.canDispense(withdrawAmount)) {
                    screen.showMessage("ATM has insufficient cash.");
                } else if (!account.withdraw(withdrawAmount)) {
                    screen.showMessage("Account has insufficient balance.");
                } else {
                    cashDispenser.dispenseCash(withdrawAmount);
                    screen.showMessage("Please collect your cash.");
                }
                break;

            default:
                screen.showMessage("Invalid transaction.");
        }

        screen.showMessage("Thank you for using the ATM.");
    }
}

