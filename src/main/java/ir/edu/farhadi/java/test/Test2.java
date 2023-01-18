package ir.edu.farhadi.java.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {


    public static void main(String[] args) {

        List<Integer> s1 = List.of(1, 2, 3, 4, 1);
        List<Integer> s2 = List.of(5, 4, 3, 4, 1);
        int result = 0;
for (int i=0;i<=s1.size()-1;i++){
    if (s1.get(i)==s2.get(i)){
        if(s1.get(i)>result){
            result = s1.get(i);
        }
    }
}

        System.out.println(result);


//        System.out.println(updateTime(s1,s2));

    }

    private static int updateTime(List<Integer> signalOne,List<Integer> signalTwo){

        int result=0;


        return result;

    }
}
