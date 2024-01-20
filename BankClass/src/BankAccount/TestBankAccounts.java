package BankAccount;

public class TestBankAccounts {
    public static void main(String[] args) {
        // Test BankAccount
        BankAccount account1 = new BankAccount();
        account1.setFirstName("John");
        account1.setLastName("Doe");
        account1.setAccountID(1001);
        account1.deposit(1000.0);
        account1.withdrawal(200.0);
        account1.accountSummary();

        // Test CheckingAccount
        CheckingAccount checkingAccount1 = new CheckingAccount();
        checkingAccount1.setFirstName("Jane");
        checkingAccount1.setLastName("Smith");
        checkingAccount1.setAccountID(2001);
        checkingAccount1.deposit(1500.0);
        checkingAccount1.processWithdrawal(1800.0);
        checkingAccount1.setInterestRate(2.5);
        checkingAccount1.displayAccount();
    }
}