package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1; i<= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            Character ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenses = sc.nextDouble();
                list.add(new PessoaFisica(name, annualIncome, healthExpenses));
            }
            else{
                System.out.print("Number of employees: ");
                Integer employeesNumber = sc.nextInt();
                list.add(new PessoaJuridica(name, annualIncome, employeesNumber));
            }
        }
        double sumTaxes = 0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(Pessoa p : list){
            System.out.printf(p.getName() + ": $ " + String.format("%.2f", p.calculateTaxes()));
            System.out.println();
            sumTaxes += p.calculateTaxes();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: " + sumTaxes);
    }
}