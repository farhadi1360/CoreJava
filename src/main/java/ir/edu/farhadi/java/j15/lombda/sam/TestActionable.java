package ir.edu.farhadi.java.j15.lombda.sam;

import ir.edu.farhadi.java.j15.lombda.sam.Actionable;
import ir.edu.farhadi.java.j15.lombda.sam.Order;

public class TestActionable {

    public static void main(String[] args) {
        Order order = new Order();
        order.orderAction(new Actionable() {
            @Override
            public void doAction() {
                System.out.println("Authentication Check");
            }
        });

        order.orderAction(new Actionable() {
            @Override
            public void doAction() {
                System.out.println("Authorization Check");
            }
        });

        order.orderAction(()->{System.out.println("Full Security Check!!!");});

    }
}
