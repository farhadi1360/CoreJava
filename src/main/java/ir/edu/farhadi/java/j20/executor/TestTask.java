package ir.edu.farhadi.java.j20.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestTask {
    public static void main(String[] args) {
        ExecutorService readService = Executors.newSingleThreadExecutor();
        ExecutorService processService = Executors.newSingleThreadExecutor();
        ExecutorService sendingService = Executors.newSingleThreadExecutor();
        Runnable readTask = new ReadFromDatabase();
        Runnable imageProcessTask = new ImageProcessing();
        Runnable SendingInfoTask = new SendImagesToServer();
        readService.submit(readTask);
        processService.submit(imageProcessTask);
        sendingService.submit(SendingInfoTask);
        readService.shutdown();
        processService.shutdown();
        sendingService.shutdown();

    }
}
