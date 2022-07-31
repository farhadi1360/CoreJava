package ir.edu.farhadi.java.j19.di;

public class Test {
    public static void main(String[] args) {
        CallTarget callTarget = new CallTarget();
        MostafaDIEngine diEngine = new MostafaDIEngine();
        diEngine.injection(callTarget);
        callTarget.calling("Mostafa.Farhadi","09125128532");
    }


}
