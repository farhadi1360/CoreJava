package ir.edu.farhadi.java.j3;

public class Result {
    public static void fizzBuzz(int n) {
        // Write your code here
        int res1 = n / 3;
        int res2 = n / 5;
        if (res1==0 && res2!=0){
            System.out.println("Fizz");
        }else
        if(res2==0 && res1!=0){
            System.out.println("Buzz");
        }else{
            System.out.println("Fizz Buzz");
        }

    }

}
