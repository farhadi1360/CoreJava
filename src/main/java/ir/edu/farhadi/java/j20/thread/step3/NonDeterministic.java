package ir.edu.farhadi.java.j20.thread.step3;

public class NonDeterministic {

    public static void main(String[] args) throws InterruptedException {
//        step1();
//        step2();
        step3();

    }

    private static void step1(){
        System.out.println("1");
        Thread t1 = new Thread(){ public void run() { System.out.println("2"); } };
        t1.start();
        System.out.println("3");
        Thread t2 = new Thread(){ public void run() { System.out.println("4"); } };
        t2.start();
        System.out.println("5");
        System.out.println("6");
    }
    private static void step2() throws InterruptedException {
        System.out.println("1");
        Thread t1 = new Thread(){ public void run() { System.out.println("2"); } };
        t1.start();
        t1.join();
        System.out.println("3");
        Thread t2 = new Thread(){ public void run() { System.out.println("4"); } };
        t2.start();
        t2.join();
        System.out.println("5");
        System.out.println("6");
    }

    private static void step3(){
        System.out.println(" in this mode Process is  Starting...");

        Thread t = new Thread() {
            public void run() {
                System.out.println("Process was terminated and call ShutdownHook");
            }
        };

        Runtime.getRuntime().addShutdownHook( t );
//        System.exit(0);
//        Runtime.getRuntime().halt(0);
        System.out.println("The end of main thread");


//        Runtime.getRuntime().halt(0);
        throw new RuntimeException();
    }

    /*
        what is deference between finalize And addShutdownHook
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
