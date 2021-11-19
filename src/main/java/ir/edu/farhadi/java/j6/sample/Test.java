package ir.edu.farhadi.java.j6.sample;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {
    public static void main(String[] args) {
        Diskette diskette = new DentalDiskette("Dental");
        printPrice(diskette);
    }

    /**
     *  i prefer you should be try for generalisation view and use reference object instance of actual object
     * @param diskette
     */
    private static void printPrice(Diskette diskette){
        diskette.calculateInsurance();
    }
}
