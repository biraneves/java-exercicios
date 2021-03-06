import java.util.Scanner;

class Account {

    private String name;
    private double balance;

    // Constructor
    public Account(String name, double balance) {

        this.name = name;

        if (balance > 0.0)
            this.balance = balance;

    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0.0)
            balance += amount;

    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount > balance)
            System.out.println("Withdrawal amount exceeded account balance.");
        else
            balance -= amount;

    }

    // Returns account balance
    public double getBalance() {

        return balance;

    }

    // Set a new name for the account holder
    public void setName(String name) {

        this.name = name;

    }

    // Returns account holder's name
    public String getName() {

        return name;

    }

}

class AccountTest {

    public static void main(String [] args) {

        Account account1 = new Account("Jane Green", 200.00);
        Account account2 = new Account("John Blue", -18.34);

        System.out.printf("account1 initial balance: $%.2f%n", account1.getBalance());
        System.out.printf("account2 initial balance: $%.2f%n", account2.getBalance());

        System.out.println("---------------------------------------------------");

        System.out.println("Inform deposit amount for account1:");
        Scanner input = new Scanner(System.in);
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        System.out.println("---------------------------------------------------");

        System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.println("---------------------------------------------------");

        System.out.println("Inform deposit amount for account2:");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);

        System.out.println("---------------------------------------------------");

        System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.println("---------------------------------------------------");

        System.out.println("Inform withdrawal amount for account1:");
        double withdrawalAmount = input.nextDouble();
        account1.withdraw(withdrawalAmount);

        System.out.println("Inform withdrawal amount for account2:");
        withdrawalAmount = input.nextDouble();
        account2.withdraw(withdrawalAmount);

        System.out.println("---------------------------------------------------");

        System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());

    }

}