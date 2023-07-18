package ir.edu.farhadi.java.practice.utils;

public class Calculations {
    public static final double RED_LIGHT_COEFFICIENT = 5.0;
    public static final double SPEED_limit_COEFFICIENT = 7.0;

    private Calculations() {
    }

    public static double calculateRedLight(double fee) {
        double result = fee * RED_LIGHT_COEFFICIENT;
        return result;
    }

    public static double calculateSpeedLimit(double fee) {
        double result = fee * RED_LIGHT_COEFFICIENT;
        return result;
    }
}
