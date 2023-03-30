package entities;

public class PessoaFisica extends Pessoa{
    private Double healthExpenses;

    public PessoaFisica(){
    }

    public PessoaFisica(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double calculateTaxes(){
        if(getAnnualIncome() < 20000.0 ){
            return (getAnnualIncome() * 15 / 100) - (healthExpenses * 50 / 100);
        }
        else {
            return (getAnnualIncome() * 25 / 100) - (healthExpenses * 50 / 100);
        }

    }
}
