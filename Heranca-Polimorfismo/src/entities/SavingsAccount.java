package entities;

public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer accountNumber, String accountHolder, Double accountBalance, Double interestRate) {
        super(accountNumber, accountHolder, accountBalance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        accountBalance += accountBalance*interestRate;
    }
    @Override
    public  void withdraw(double amount){
        if (accountBalance > amount) {
            accountBalance -= amount;
        }
    }
}
