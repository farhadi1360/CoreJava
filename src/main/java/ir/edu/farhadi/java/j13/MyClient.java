package ir.edu.farhadi.java.j13;

import java.io.*;
import java.net.Socket;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class MyClient {
    public static void main(String[] args) {
        //firstClient();
        secondClient();
    }

    private static void firstClient() {
        String ip = "10.21.24.124";
        int port = 5050;
        try {
            Socket socket = new Socket(ip, port);
            InputStream inputStream = socket.getInputStream();
            int readByte;
            while ((readByte = inputStream.read()) != -1) {
                System.out.printf("%c", readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void secondClient() {
        String ip = "10.21.24.124";
        int port = 5050;
        try {
            Socket socket = new Socket(ip, port);
            InputStream inputStream = new BufferedInputStream(socket.getInputStream());
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("farhadi.pdf"));
            int readByte;
            System.out.println("File is Downloading please waite !!!");
            while ((readByte = inputStream.read()) != -1) {
                outputStream.write(readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
