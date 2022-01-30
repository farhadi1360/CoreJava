package ir.edu.farhadi.java.j13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class MyServer {
    public static void main(String[] args) {
      //  firstServer();
        secondServer();

    }

    private static void firstServer() {
        try {
            ServerSocket server = new ServerSocket(5050);
            System.out.println("server is up");
            Socket serverSocket = server.accept();
            System.out.println("connect to client");
            OutputStream outputStream = serverSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.println("Your Connection was accept");
            writer.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void secondServer() {
        try {
            ServerSocket server = new ServerSocket(5050);
            System.out.println("server is up");
            Socket serverSocket = server.accept();
            InputStream inputStream = new BufferedInputStream(new FileInputStream("db.pdf"));
            OutputStream outputStream = new BufferedOutputStream(serverSocket.getOutputStream());
            int readByte;
            while ((readByte = inputStream.read()) != -1) {
                outputStream.write(readByte);
            }
            inputStream.close();
            outputStream.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Transfer Data is down");
    }
}
