# ATM System

This project is an implementation of an ATM (Automated Teller Machine) System using Object-Oriented Design (OOD) principles. It models real-world ATM interactions including user authentication, deposits, withdrawals, and balance inquiries using a clean modular architecture.

**Design Reference:**  
This implementation is inspired by the [ATM design](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/atm.md) in the OOD-Object-Oriented-Design repository by ycwkatie.

---

## Key Components and Interacting Objects

The system is built using clearly defined components that reflect real-world ATM hardware and user roles:

- **ATM**: Core controller that handles all transaction logic and hardware coordination.
- **User**: Represents a bank customer with associated `Account`, `Card`, and personal details.
- **Card**: Simulates a debit card used for authentication via card number and PIN.
- **Account**: Holds balance data and allows operations like withdrawal and deposit.
- **Transaction**: Interface for modeling different types of transactions.
- **CheckBalance, Deposit, Withdraw**: Concrete transaction implementations.
- **CardReader, Screen, Keypad, CashDispenser, DepositSlot**: Represent ATM hardware components.
- **Enums**:
  - `TransactionType`: Types of actions (e.g., Deposit, Withdraw, Balance)
  - `TransactionStatus`: Status (Success or Failure)

---

## User Action Flow

The system supports the typical lifecycle of an ATM session. The operations are orchestrated through the public methods in the `ATM` class:

1. **User inserts card**  
   `CardReader.readCard()` simulates card reading.

2. **Authentication with PIN**  
   `Card.validatePin()` verifies the entered PIN.

3. **Select transaction type**  
   The `Screen.getInput()` method prompts the user to choose:
   - Display Balance
   - Deposit
   - Withdraw

4. **Deposit**  
   - User enters an amount
   - Amount is credited to their account
   - Deposit slot registers the cash

5. **Withdraw**  
   - User enters amount
   - ATM checks if it has enough cash
   - Account balance is verified
   - Cash is dispensed and account is debited

6. **Display Balance**  
   - Account balance is shown on screen

7. **Session ends**  
   - System thanks the user and ends the session

---

## Getting Started

To set up and run the ATM System locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/atm-system.git
   ```

2. Navigate to the project folder:
   ```bash
   cd atm-system
   ```

3. Open in your Java IDE (IntelliJ IDEA, Eclipse, etc.)

4. Build and run the project  
   Ensure your environment supports **Java 8+**.

---

## Project Structure

| Component                  | Responsibility                                                |
|---------------------------|----------------------------------------------------------------|
| `ATM`                     | Orchestrates the session, hardware, and transaction flow       |
| `User`, `Account`, `Card` | Represents bank users and their financial identity             |
| `Transaction` Interface   | Common behavior for `Deposit`, `Withdraw`, and `CheckBalance` |
| `CardReader`, `Keypad`, `Screen`, etc. | Simulate ATM hardware interactions        |
| `TransactionType`, `TransactionStatus` | Enum to track transaction logic            |

