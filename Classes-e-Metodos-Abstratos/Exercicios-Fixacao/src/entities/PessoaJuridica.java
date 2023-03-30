package entities;

public class PessoaJuridica extends Pessoa{
    private Integer employeesNumber;

    public PessoaJuridica(){
    }
    public PessoaJuridica(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
    @Override
    public double calculateTaxes(){
        if (employeesNumber > 10){
            return getAnnualIncome() * 14 / 100;
        }
        else{
            return getAnnualIncome() * 16 / 100;
        }
    }
}
