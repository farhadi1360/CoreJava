package ir.edu.farhadi.java.j3;

public class SampleArray {

    public static void main(String[] args) {
//    step1();
//    step2();
        step3();

    }

    private static void step1(){
        int[] nums;
//        nums.length;
//        int[] pops = null;
//        System.out.println( pops.length);
//        int[] aaa = new int[0]; // Zero Size Array
//        System.out.println(aaa.length);
//        aaa[0] = 100;
//        System.out.println(aaa[0]);
        int bbb[] = new int[1];
        System.out.println(bbb.length);
        bbb[0] = 100;
        System.out.println(bbb[0]);
    }
    private static void step2(){
        int[] nums = new int[10];
        Book[] books = new Book[5];
        nums[0] = 5;
        books[0] = new Book(500);
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
        for (int j = 0; j <= books.length - 1; j++) {

            if (books[j] != null) {

                System.out.println(books[j].getPrice());
            } else {
                System.out.println(books[j]);
            }
        }
    }

    private static void step3(){
        int [] result = prepareZeroSizeArray();
        int [] result2 = prepareNullArray();
        if(result!=null && result.length>0){
            // do somethings
        }
        if(result2!=null){
            // do somethings
        }
    }

    private static int[] prepareZeroSizeArray(){
        int aaa[] = new int[0];
        return aaa;
    }
    private static int [] prepareNullArray(){
        int aaa[] = null;
        return aaa;
    }
}
