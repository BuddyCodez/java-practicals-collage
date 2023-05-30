class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not sufficient funds!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class Practical_24 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        account.deposit(25000);

        try {
            account.withdraw(20000);
            System.out.println("Balance: " + account.getBalance());

            account.withdraw(4000);
            System.out.println("Balance: " + account.getBalance());

            account.withdraw(2000);
            System.out.println("Balance: " + account.getBalance());
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
