package ir.edu.farhadi.java.j15;

public class Order {

    public Actionable orderAction(){
        return new Actionable() {
            @Override
            public void doAction() {
                System.out.println("Do Order");
            }
        };
    }
}
