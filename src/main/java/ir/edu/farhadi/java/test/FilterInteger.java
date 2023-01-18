package ir.edu.farhadi.java.test;

public class FilterInteger {
    static final int result = 6;
    public static void main(String[] args) {

        int arr[] = {4,2,3,3,8,9,10 };
        int res[] = new int[arr.length];

        int count = 0;
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if ( (arr[i]+arr[j])==result) {
                    if(res[i]!=arr[i] && res[j]!=arr[j]){
                        res[count++] = arr[i];
                        res[count++] = arr[j];
                    }
                }
            }
        }
        for (int s =0;s<res.length;s++){
            if(res[s]!=0) System.out.print(res[s]);
        }


    }
}
