public class Main {
    public static void main(String[] args) {
                BankAccount account1 = new BankAccount("1414141");
                BankAccount account2 = new BankAccount("4525214");

                account1.setPassword("password1");
                account2.setPassword("password2");


                account1.deposit(2000);
                account2.deposit(4000);

                account1.withdraw(1000, "password1");

                System.out.println("account1 balance: $"+account1.getBalance());
                System.out.println("account2 balance: $"+account2.getBalance());

                System.out.println("Transaction history for account1:");
                account1.transactionHistory();
                System.out.println("\nTransaction history for account2:");  // \n - next line
                account2.transactionHistory();

                System.out.println("\naccount1 balance: $"+account1.getBalance());
                System.out.println("account2 balance: $"+account2.getBalance());


                account1.transferMoney(account2, 100);

                System.out.println("\nTransaction history for account1:");
                account1.transactionHistory();
                System.out.println("\nTransaction history for account2:");
                account2.transactionHistory();

                System.out.println("\naccount1 balance: $"+account1.getBalance());
                System.out.println("account2 balance: $"+account2.getBalance());
                System.out.println();


                account1.lockAccount();
                account1.deposit(100);

                account1.unlockAccount();
                account1.deposit(100);

                double investment = 100;
                int months = 12;
                double futureValue = account1.invCalculator(investment, months);
                System.out.println("\nFuture value of $" + investment + " after " + months + " months: $" + futureValue);
    }
}
