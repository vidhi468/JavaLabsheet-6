// Q8: Abstract BankAccount with SavingsAccount and CurrentAccount
abstract class BankAccount {
    protected double balance;

    BankAccount(double openingBalance) {
        this.balance = Math.max(0, openingBalance);
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Balance: Rs. " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double openingBalance) {
        super(openingBalance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Savings deposit successful.");
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Savings withdrawal denied.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 1000.0;

    CurrentAccount(double openingBalance) {
        super(openingBalance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current account deposit successful.");
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Current account withdrawal successful.");
        } else {
            System.out.println("Withdrawal denied: overdraft limit exceeded.");
        }
    }
}

public class AbstractBankAccountMain {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000.0);
        BankAccount current = new CurrentAccount(500.0);

        savings.deposit(300.0);
        savings.withdraw(200.0);
        savings.displayBalance();

        current.deposit(200.0);
        current.withdraw(1200.0);
        current.displayBalance();
    }
}
