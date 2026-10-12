// Q5: BankAccount and SavingsAccount withdrawal rule
class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = Math.max(0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal denied.");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (balance - amount < 100) {
            System.out.println("Withdrawal denied: balance cannot fall below Rs. 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class SavingsAccountMain {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.0);
        account.deposit(100.0);
        account.withdraw(250.0);
        account.withdraw(300.0);
        System.out.println("Final balance: Rs. " + account.getBalance());
    }
}
