package entities;

public class Account {
    private Integer accountNumber;
    private String accountHolder;
    protected Double accountBalance;

    public Account() {
    }

    public Account(Integer accountNumber, String accountHolder, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void withdraw(double amount) {
        if (accountBalance > amount) {
            accountBalance -= amount + 5.0;
        }
    }
    public void deposit (double amount){
        accountBalance += amount;
    }

}
