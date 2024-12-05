public class BankAccount {
    private final String accountNumber;
    private String password;
    private double balance;
    private String[] transactions = new String[5];
    private int index = 0;
    private boolean accountLock = true;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void deposit(double amount) {
        if (!accountLock) {
            System.out.println("Account is locked.");
            return;
        }
        if (amount > 0 && amount <= 10000) {
            this.balance += amount;
            if (index == transactions.length) increaseSize();
            transactions[index] = amount + "$ has been deposited to you balance.";
            index++;
        } else System.out.println("This amount of money is not allowed to be deposited.");
    }

    public void withdraw(double amount, String password) {
        if (!accountLock) {
            System.out.println("Account is locked.");
            return;
        }
        if (!password.equals(this.password)) System.out.println("Incorrect password!");
        else if (amount <= 0) System.out.println("Enter valid amount.");
        else if (amount > this.balance) System.out.println("Insufficient funds.");
        else {
            this.balance -= amount;
            if (index == transactions.length) increaseSize();
            transactions[index] = amount + "$ has been withdrawn from you balance.";
            index++;
        }
    }

    // N1

    public void transactionHistory() {
        if (!accountLock) {
            System.out.println("Account is locked.");
            return;
        }
        for (String s : transactions) {
            if (s == null) continue;

            System.out.println(s);
        }
    }

    // N2

    public void transferMoney(BankAccount acc, double amount) {
        if (!accountLock) {
            System.out.println("Account is locked.");
            return;
        }
        if (amount <= 0 || amount > 1000) System.out.println("This amount of money is not allowed to be transferred");
        else {
            acc.deposit(amount);
            balance -= amount;
            if (index == transactions.length) increaseSize();
            transactions[index] = amount + "$ has been transferred to " + acc.getAccountNumber();
            index++;
        }
    }

    // N3

    public void lockAccount() {
        accountLock = false; // arvici false rato unda iyos logikurad true unda iyos idk
    }

    public void unlockAccount() {
        accountLock = true;
    }
    // N4

    public double invCalculator(double amount, int months) {
        if (months == 0) return amount;

        return amount + invCalculator(amount * 1.01, months - 1);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    private void increaseSize() {
        String[] newArr = new String[transactions.length + 5];

        for (int i = 0; i < transactions.length; i++) {
            newArr[i] = transactions[i];
        }

        transactions = newArr;
    }
}


