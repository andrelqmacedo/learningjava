package application;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> produtos = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.print("Product #" + (i+1) + " data: ");
            System.out.print("Common, user or impoted? (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                produtos.add(new UsedProduct(name, price, manufactureDate));
            }
            else if (ch == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                produtos.add(new ImportedProduct(name, price, customsFee));
            }
            else{
                produtos.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product p : produtos){
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}