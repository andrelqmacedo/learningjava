package application;
import entities.*;
import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

import static util.CurrencyConverter.convertToReais;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //exemplo 1
        /*Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calcArea();

        double areaY = y.calcArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Triangle X has the larger area");
        }
        else {
            System.out.println("Triangle Y has the larger area");
        } */

        //exemplo 2
        /*Product product1 = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product1.name = sc.nextLine();
        System.out.print("Price: ");
        product1.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product1.quantity = sc.nextInt();
        System.out.println("Product data: "  + product1);

        System.out.println();
        System.out.println("Enter the number of products do be added in stock: ");
        int quantity = sc.nextInt();
        product1.addProducts(quantity);
        System.out.println("Updated data: "  + product1);

        System.out.println();
        System.out.println("Enter the number of products do be removed in stock: ");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);
        System.out.println("Updated data: "  + product1);
        */

        //exemplo 3
        /*Rectangle r1 = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        r1.width = sc.nextDouble();
        r1.height = sc.nextDouble();
        System.out.printf("AREA: %.2f%n  ", r1.rectangleArea());
        System.out.printf("PERIMETER: %.2f%n ", r1.rectanglePerimeter());
        System.out.printf("DIAGONAL: %.2f%n  ", r1.rectangleDiagonal());
         */

        //exemplo 4
        /*Employee e1 = new Employee();
        System.out.println("Enter the data from the employee: ");
        System.out.println("Name: ");
        e1.name = sc.nextLine();
        System.out.println("Gross salary: ");
        e1.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        e1.tax = sc.nextDouble();

        System.out.printf("Employee: " + e1.name + ", $ %.2f%n ", e1.netSalary());
        System.out.println("Wich percentage to increase salary? ");
        e1.increaseSalary(sc.nextDouble());
        System.out.printf("Updated data: " + e1.name + ", $ %.2f%n ", e1.netSalary());
        */


        //exemplo 5
        /*Student s1 = new Student();
        System.out.println("Enter the student´s name and grades: ");
        System.out.println("Name: ");
        s1.name = sc.nextLine();
        System.out.println("Grade 1: ");
        s1.grade1 = sc.nextDouble();
        System.out.println("Grade 2: ");
        s1.grade2 = sc.nextDouble();
        System.out.println("Grade 3: ");
        s1.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n POINTS%n", s1.finalGrade());

        if(s1.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", s1.missingPoints());
        }
        else{
            System.out.println("PASS");
        }
        */


        //exemplo 6 - Explicação sobre métodos estáticos (não precisa instanciar a classe para utilizazr o método)
        /*System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
        */

        //exemplo 7 - Exercicio de método estático
        /*System.out.println("What is the dollar price? ");
        double cotation = sc.nextDouble();
        System.out.println("How many dollar will be bought? ");
        double amountToConvert = sc.nextDouble();
        System.out.printf("Amount to be paid in reais: R$ %.2f%n", convertToReais(cotation, amountToConvert));
        */

        //exemplo 8 - Construtores(utilizando a mesma classe do exemplo 2 - Product)
        /*System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product1 = new Product(name, price, quantity);

        System.out.println("Product data: "  + product1);

        System.out.println();
        System.out.println("Enter the number of products do be added in stock: ");
        quantity = sc.nextInt();
        product1.addProducts(quantity);
        System.out.println("Updated data: "  + product1);

        System.out.println();
        System.out.println("Enter the number of products do be removed in stock: ");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);
        System.out.println("Updated data: "  + product1);
        */

        //exemplo 9 - Sobrecarga: disponibilizar mais de uma versão da mesma operação, com diferença entre a quantidade de paramentos entre versões (utilizaremos a mesma classe do exemplo 8 - Product)
        /*System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product1 = new Product(name, price);

        System.out.println("Product data: "  + product1);

        System.out.println();
        System.out.println("Enter the number of products do be added in stock: ");
        int quantity = sc.nextInt();
        product1.addProducts(quantity);
        System.out.println("Updated data: "  + product1);

        System.out.println();
        System.out.println("Enter the number of products do be removed in stock: ");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);
        System.out.println("Updated data: "  + product1);
        */

        //exemplo 10




        sc.close();
    }
}