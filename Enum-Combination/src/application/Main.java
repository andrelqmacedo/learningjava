package application;

import entitie.enums.OrderStatus;
import entities.Order;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order1);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}