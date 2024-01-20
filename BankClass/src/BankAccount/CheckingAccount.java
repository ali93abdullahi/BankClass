package BankAccount;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount() {
        super(); // Calls the superclass constructor
    }

    // Setter and Getter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Methods
    public void processWithdrawal(double amount) {
        double overdraftFee = 30.0;
        double totalWithdrawal = amount + overdraftFee;
        withdrawal(totalWithdrawal);
        System.out.println("Withdrawal processed with overdraft fee of $30. New balance: $" + getBalance());
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}