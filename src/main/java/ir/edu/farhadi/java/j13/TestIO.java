package ir.edu.farhadi.java.j13;

import org.codehaus.plexus.component.configurator.converters.basic.UrlConverter;

import java.io.*;
import java.net.URL;


/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestIO {
    /*
             Reader reader;
             InputStream inputStream;
             Writer writer;
             OutputStream outputStream;

      as you can see we have 4 abstract class for basic java io
            Reader And InputStream;
                 reader        using to   input stream as text
                 inputStream   using to   input stream as binary
            Writer And OutputStream;
                 writer        using to   out stream as text
                 outputStream  using to   out stream as binary
     */


    public static void main(String[] args) throws IOException {
//******************************Read From File *****************************
//          readFile(System.in);
//          readFile(new FileInputStream("test.txt"));
//          readFile(new URL("https://www.google.com/").openStream());
//          readString();


//******************************Write To File *****************************
//        writeToFile();
        readFromStringAndWriteToFile("Ip : localhost , Port : 7001");

    }

    private static void readFile(InputStream inputStream) throws IOException {
        int b;
        while ((b = inputStream.read()) != -1) {
            System.out.printf("%c", b);
        }
    }

    private static void readString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());
    }

    private static void writeToFile() throws IOException {
        int simple = 500;
        OutputStream outputStream = new FileOutputStream("MyFile.txt");
        outputStream.write(simple);

//        Writer writer = new FileWriter("MyFile2.txt");
//        writer.write(simple);
//        writer.flush();

        PrintStream printStream = new PrintStream(outputStream);
        printStream.println(simple);
        System.out.println("Write To File was Down");
    }

    private static void readFromStringAndWriteToFile(String input) throws IOException {
        FileOutputStream fos = new FileOutputStream("setting.txt");
        fos.write(input.getBytes());
    }
}
