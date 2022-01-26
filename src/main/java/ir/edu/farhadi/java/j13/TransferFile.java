package ir.edu.farhadi.java.j13;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TransferFile {
    static String source = "db.pdf";
    static String destination = "db2.pdf";

    public static void main(String[] args) throws IOException {
//        simpleTransfer();
//        secondTransfer();
//        thirdTransfer();
//        fourthTransfer();
        fifthTransfer();
    }

    private static void simpleTransfer() throws IOException {
        long startTime = System.currentTimeMillis();

        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(destination);
        int value;
        while ((value = inputStream.read()) != -1) {
            outputStream.write(value);
        }
        inputStream.close();
        outputStream.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File was succeed transferred in Time : " + (endTime - startTime)); // -> 25713
    }

    private static void secondTransfer() throws IOException {
        byte[] block = new byte[4 * 1024]; //4k

        long startTime = System.currentTimeMillis();

        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(destination);
        int value = 0;
        while ((value = inputStream.read(block)) != -1) {
            outputStream.write(block, 0, value);
        }
        inputStream.close();
        outputStream.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File was succeed transferred in Time : " + (endTime - startTime)); // -> 20

    }

    private static void thirdTransfer() throws IOException {
        long startTime = System.currentTimeMillis();

        InputStream inputStream = new BufferedInputStream(new FileInputStream(source));
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destination));
        int value = 0;
        while ((value = inputStream.read()) != -1) {
            outputStream.write(value);
        }
        inputStream.close();
        outputStream.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File was succeed transferred in Time : " + (endTime - startTime)); // -> 64
    }

    private static void fourthTransfer() throws IOException {
        long startTime = System.currentTimeMillis();

        FileInputStream in = new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(destination);

        FileChannel sourceFile = in.getChannel();
        FileChannel destinationFile = out.getChannel();

        sourceFile.transferTo(0, sourceFile.size(), destinationFile);
        sourceFile.close();
        destinationFile.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File was succeed transferred in Time : " + (endTime - startTime)); // -> 92
    }

    private static void fifthTransfer() throws IOException {
        long startTime = System.currentTimeMillis();

        Files.copy(new File(source).toPath(),
                new File(destination).toPath());

        long endTime = System.currentTimeMillis();
        System.out.println("File was succeed transferred in Time : " + (endTime - startTime)); // -> 108

    }
}
