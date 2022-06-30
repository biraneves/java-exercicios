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