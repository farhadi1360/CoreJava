package ir.edu.farhadi.java.j5;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * i am going to descibed a bout how can i get only one object per instans
 */
public final class SingleObject {
    /*
      i create a constructor as a private constructor so all of the developers can not use default constructor
     */
    private SingleObject() {
    }

    private static SingleObject onlyOneObject = null;

    public synchronized static SingleObject getOnlyOneObject() {
        if (onlyOneObject == null) {
            onlyOneObject = new SingleObject();
        }
        return onlyOneObject;
    }
}
