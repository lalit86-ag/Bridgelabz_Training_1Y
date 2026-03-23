package BankAccountTypes;

public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    public void calculateInterest(){
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest : "+interest);
        System.out.println("Balance after Interest : "+balance);
    }
}
