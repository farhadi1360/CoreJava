package ir.edu.farhadi.java.j11.marker;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestMarker {


    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        Database database = new Database();
        Object[] objects = new Object[2];
        objects[0] = fileSystem;
        objects[1] = database;
        TestMarker.checkSecurity(objects);


    }


    private static void checkSecurity(Object[] objects) {
        for (Object object : objects) {
            if (object instanceof Security) {
                System.out.println(object.getClass().getName() + "  Pass Security");
            } else {
                System.out.println(object.getClass().getName() + "    Fail Security");
            }
        }

    }
}
