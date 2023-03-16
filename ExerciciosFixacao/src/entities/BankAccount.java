package entities;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    public BankAccount(int accountNumber, String accountHolder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public String getAccountHolder() {
        return this.accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void deposit(double depositValue){
        this.accountBalance += depositValue;
    }
    public void withdraw(double withdrawValue){
        this.accountBalance -= withdrawValue + 5.00;

    }
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", accountBalance );
    }
}
