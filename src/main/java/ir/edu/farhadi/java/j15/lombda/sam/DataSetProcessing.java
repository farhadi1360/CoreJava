package ir.edu.farhadi.java.j15.lombda.sam;

@FunctionalInterface
public interface DataSetProcessing {

    void multiPle();

    default void adder(int a , int b){
        System.out.println(a+b);
    }
}
