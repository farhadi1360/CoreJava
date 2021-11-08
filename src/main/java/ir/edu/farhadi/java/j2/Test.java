package ir.edu.farhadi.java.j2;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {

    /**
     * in this method i tried show how can we compering reference and value object
     */
    public static void step1() {
        String s = "Farhadi";
        s.concat("Mostafa");
        String a = new String("Mostafa");
        String b = new String("Farhadi");

        String s2 = "MostafaFarhadi".substring(0, 7); // --> "Mostafa"
        String s1 = "";
        // compare address
        if (s2 == s1)
            System.out.println("Compare String with ==");
        // compare values
        if (s2.equals(s1))
            System.out.println("Compare String with .equals");
    }

    /**
     * in this method i tried to described  address assigning
     */
    public static void step2() {
        String str1 = "MOS";
        String str2 = str1;
        if (str1.equals(str2))
            System.out.println("Compare String with .equals");

        if (str1 == str2)
            // compare address
            System.out.println("Compare String with ==");
    }

    /**
     * in this method i described about interning concept in string pool
     */
    public static void step3() {
        // i use literal string assignment that Jvm use it Interning as internally process
        String s1 = "MOS"; // new S1("MOS")
        String s2 = "MOS";
        if (s1 == s2)
            System.out.println("it is equal because it used from string pooling in java ");
       // but in these case we have 2 instance of objects
        String s3 = new String("MOS");
        String s4 = new String("MOS");
        if (s3 == s4)
            System.out.println("it is not equal because it does not used from string pooling in java ");
        // but in these case we have 2 instance of objects but with intern method
        String s5 = new String("Java").intern();
        String s6 = new String("Java").intern();
        if (s5 == s6)
            System.out.println("as you can see these objects are equal ");

    }
}
