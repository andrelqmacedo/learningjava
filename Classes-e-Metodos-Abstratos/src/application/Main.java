package application;

import entities.*;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Classes Abstratas
        São classes que não podem ser instanciadas
        É uma forma de garantir herança total: somente subclasses não abstratas
        pode ser instanciadas, mas nunca a superclasse abstrata
         */

        //Account acc1 = new Account(101, "Alex", 1000.00); - Não é possível! Account é abstrata

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1004, "Bob", 300.00, 0.05 ));
        list.add(new BusinessAccount(1003, "Ana", 500.00, 200.00));

        double sum = 0;
        for(Account acc : list){
            sum += acc.getAccountBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for(Account acc : list){
            acc.deposit(10);
        }
        for(Account acc : list){
            System.out.printf("Updated balance for account %d: %.2f%n",acc.getAccountNumber(), acc.getAccountBalance());
        }

        /* Métodos Abstratos
        São metodos que não possuem implementação;
        Metodos precisam ser abstratos quando a classe é génerica demais para conter a sua implementação
        Se uma classe possui pelo menos um metodo abstrato, então a classe tambem é abstrata
         */
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> listShapes = new ArrayList<>();

        for(int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data :");
            System.out.print("Rectangle or Circle (r/c) ? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED):  ");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.print("Widht: ");
                double widht = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                listShapes.add(new Rectangle(color, widht, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                listShapes.add(new Circle(color, radius));
            }
            }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape s: listShapes){
            System.out.println(String.format("%.2f", s.area()));

        }
        sc.close();
    }
}