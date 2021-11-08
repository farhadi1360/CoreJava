package ir.edu.farhadi.java.j1;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */

public class Test {
	/*
	   these space define for all fields of class
	   Fields are allocated in Heap (as object)
	   when object created, till object garbage collected!
	   like String name;
	   or Book book;
	 */

    public static void main(String[] args) {
        Test test = new Test();
        test.met2();

        //Autoboxing
        Integer a = 10;
        //unbox
        int k = a;

    }

    public void met2() {
        /**
         * these part is placed for  Local variable and
         *all of the Local variable are in Call Stack
         * to mack it clear i should say each method has a unique space that called Activation Record or Stack Frame
         * and life cycle of this started  from beginning of the block to the end of the block
         */
        int a = 10;
        met3(a);
    }

    public void met3(int number) {
        System.out.println(number);
    }

}
