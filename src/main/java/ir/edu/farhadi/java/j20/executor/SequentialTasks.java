package ir.edu.farhadi.java.j20.executor;

import java.util.concurrent.*;

public class SequentialTasks {

    public static void main(String[] args) {
        Future<String> result = action(new ReadFromFileSystem("c://temp//images"));


        while (!result.isDone()) {
            runTask(new readDataFromChannel1());
            runTask(new readDataFromChannel2());
        }
        try {
            String rs = result.get();
            if ("OK".equalsIgnoreCase(rs)) {
                System.out.println(" ********Reading Data was completed******");

                runTask(new SendDataToServer());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


    static class ReadFromFileSystem implements Callable<String> {
        String fileSystemPath = "";

        public ReadFromFileSystem(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
        }

        @Override
        public String call() throws Exception {
            System.out.println(" Reading Data From File System");
            return "OK";
        }
    }





    static class SendDataToServer implements Runnable {
        @Override
        public void run() {
            System.out.println(" Sending Data To Server");
        }
    }

    static class readDataFromChannel1 implements Runnable {
        @Override
        public void run() {
            System.out.println(" Reading Data From Channel 1");
        }
    }

    static class readDataFromChannel2 implements Runnable {
        @Override
        public void run() {
            System.out.println(" Reading Data From Channel 2");
        }
    }


    static Future<String> action(Callable<String> callable) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        return executor.submit(callable);
    }

    private static void runTask(Runnable runnable) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(runnable);
    }

}

