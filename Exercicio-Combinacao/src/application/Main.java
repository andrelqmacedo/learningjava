package application;

import entities.*;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        /*
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that´s awesome");

        Post p1 = new Post(sdf.parse(
                "21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I´m going to visit this wonderful contry",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Client c1 = new Client();

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        c1.setName(sc.nextLine());
        System.out.print("Email: ");
        c1.setEmail(sc.nextLine());
        System.out.print("Birth date (DD/MM/YYYY): ");
        c1.setBirthDate(sdf.parse(sc.next()));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, c1);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();


    }
}