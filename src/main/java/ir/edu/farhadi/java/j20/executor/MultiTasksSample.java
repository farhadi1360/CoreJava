package ir.edu.farhadi.java.j20.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiTasksSample {

    public static void main(String[] args) {

        Collection tasks = new ArrayList();

        tasks.add(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Send Data To Server 1");
                return "OK";
            }
        });

        tasks.add(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Send Data To Server 2");
                return "OK";
            }
        });
        tasks.add(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Send Data To Server 3");
                return "OK";
            }
        });
        tasks.add(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Send Data To Server 4");
                return "OK";
            }
        });
        try {
            runTasks(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private static void runTasks(Collection tasks) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.invokeAll(tasks);
        executor.shutdown();
    }


}
