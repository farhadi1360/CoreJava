package ir.edu.farhadi.java.j2;

/**
 * in this sample I'm going to showing Garbage Collection with 3 ways
 *  first  By nulling a reference
 *  second By assigning a reference to another
 *  third  By anonymous object:
 */
public class GarbageCollectionSample {

    protected void finalize() throws Throwable{
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();


        person1 = null; // By nulling a reference
      //  person1 = person2; //By assigning a reference to another
     //   new Person(); //By assigning a reference to another

        System.gc();
    }
}
