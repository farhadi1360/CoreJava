package ir.edu.farhadi.java.j15.lombda.sam;

public class Test {
    public static void main(String[] args) {
        oldWay();
//        newWay();
    }

    public static void oldWay(){
        Peapering p = new Peapering();

        p.pepperInfo(new DataSetProcessing() {
            @Override
            public void multiPle() {
                System.out.println("Call multiPle");
            }
        });
    }

    public static void newWay(){
        Peapering p = new Peapering();
        p.pepperInfo(()-> System.out.println("Call multiPle"));
    }


}
