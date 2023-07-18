package ir.edu.farhadi.java.j18.Annotations.hierarchy;

public class Test {

    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
//        Three three = new Three();

        System.out.println( "One:" + one.getClass().isAnnotationPresent(Data.class) );
        System.out.println( "Two:" + two.getClass().isAnnotationPresent(Data.class) );
//        System.out.println( "Three:" + three.getClass().isAnnotationPresent(Data.class) );

    }
}
