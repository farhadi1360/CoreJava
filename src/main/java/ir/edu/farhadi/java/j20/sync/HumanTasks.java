package ir.edu.farhadi.java.j20.sync;


public class HumanTasks {

    public static void main(String[] args) throws InterruptedException {
        CreditCard creditCard = new CreditCard(50);

//        testThreadBySynchronized(creditCard);

//        testThreadByLocking(creditCard);

        testThreadBySynchronized2(creditCard);

    }

    private static void testThreadBySynchronized(CreditCard creditCard) throws InterruptedException {

        Thread human1 = new Thread(() -> creditCard.changeBySyncImplementation());
        Thread human2 = new Thread(() -> creditCard.changeBySyncImplementation());
        Thread human3 = new Thread(() -> creditCard.changeBySyncImplementation());
        Thread human4 = new Thread(() -> creditCard.changeBySyncImplementation());
        human1.start();
        human2.start();
        human3.start();
        human4.start();
        human1.join();
        human2.join();
        human3.join();
        human4.join();
        System.out.println(creditCard.getBalance());
    }
    private static void testThreadBySynchronized2(CreditCard creditCard) throws InterruptedException {

        Thread human1 = new Thread(() -> creditCard.changeBySync2Implementation());
        Thread human2 = new Thread(() -> creditCard.changeBySync2Implementation());
        Thread human3 = new Thread(() -> creditCard.changeBySync2Implementation());
        Thread human4 = new Thread(() -> creditCard.changeBySync2Implementation());
        human1.start();
        human2.start();
        human3.start();
        human4.start();
        human1.join();
        human2.join();
        human3.join();
        human4.join();
        System.out.println(creditCard.getBalance());
    }
    private static void testThreadByLocking(CreditCard creditCard) throws InterruptedException {

        Thread human1 = new Thread(() -> creditCard.changeByLocking());
        Thread human2 = new Thread(() -> creditCard.changeByLocking());
        Thread human3 = new Thread(() -> creditCard.changeByLocking());
        Thread human4 = new Thread(() -> creditCard.changeByLocking());
        human1.start();
        human2.start();
        human3.start();
        human4.start();
        human1.join();
        human2.join();
        human3.join();
        human4.join();
        System.out.println(creditCard.getBalance());
    }


}
