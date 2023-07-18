package ir.edu.farhadi.java.j3;

public class SampleArray2 {

    public static void main(String[] args) {

        step1();
        step2();

    }

    private static void step1() {
        int[] ccc = new int[3];
        ccc[0] = 40;
        ccc[1] = 20;
        ccc[2] = 60;
        showMyArray(ccc);
        // Initialization
        int[] numbers2 = {40,20,60};
        showMyArray( numbers2 );
        // Anonymous Array
        showMyArray( new int[] {40, 20, 60} );
    }

    private static void step2(){
        showMyArray2();
        showMyArray2(40);
        showMyArray2(40,20);
        showMyArray2(40,20,60);
        showMyArray2( new int[] {40, 20, 60} );
    }





    static void showMyArray(int[] numbers) {

        for (int i=0; i < numbers.length; i++)
            System.out.println( numbers[i] );

    }

    static void showMyArray2(int... numbers) {

        for (int i=0; i < numbers.length; i++)
            System.out.println( numbers[i] );

    }

}
