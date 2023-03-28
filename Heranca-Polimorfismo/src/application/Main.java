package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


        //Upcasting
        //é possível atribuir uma bussinessAccount a uma Account, pq uma B.A é uma (relação proveniente da herança) A.
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //Downcasting - converter um objeto da superclasse para a subclasse
        /*BusinessAccount acc4 = acc2;
        A conversão não é natural, necessário um casting manual, embaixo:
         */
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        /*BusinessAccount acc5 = (BusinessAccount) acc3;
        O erro é lançado em tempo de execução, o downcasting nem sempre da certo e o compilador só avisa dps. responsabilidade do programador evitar o erro no downcasting
         */
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        //Sobreposição do método withdraw()
        Account acc99 = new Account(10101, "Alex", 1000.00);
        acc99.withdraw(200.0);
        System.out.println(acc99.getAccountBalance());

        Account acc100 = new SavingsAccount(11313, "Maria", 1000.0, 0.01);
        acc100.withdraw(200.0);
        System.out.println(acc100.getAccountBalance());

        Account acc101 = new BusinessAccount(10223, "Bob", 1000.0, 500.0);
        acc101.withdraw(200.0);
        System.out.println(acc101.getAccountBalance());

    }

}